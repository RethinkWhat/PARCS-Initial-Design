package server.model;


import client.model.DateTime;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

import java.util.*;

public class ReservationParser {


    DocumentBuilder builder;
    Document document;

    final File reservationsFile = new File("src/server/res/reservations.xml");

    DateTime dateTimeFormatter = new DateTime();

    private void getReservationsFile() {
        try {
            builder = DocumentBuilderFactory.newNSInstance().newDocumentBuilder();
            document = builder.parse(reservationsFile);
            document.getDocumentElement().normalize();
        } catch (IOException | SAXException ex) {
            ex.printStackTrace();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method to retrieve parking information
     */
    public List<ParkingSpot> getParkingInformation() {

        // Set the file to be read
        getReservationsFile();


        List<ParkingSpot> parkingSpotList = new ArrayList<>();

        NodeList nodeList = document.getElementsByTagName("parkingSpot");

        for (int x = 0 ; x < nodeList.getLength(); x++) {
            Node currNode = nodeList.item(x);


            String parkingIdentifier = currNode.getAttributes().item(0).getTextContent();

            ParkingSpot parkingSpot = new ParkingSpot(parkingIdentifier);

            // Create a reservationsList associated with the parkingIdentifier
            List<Reservations> reservationsList = new ArrayList<>();

            // StartTime, EndTime, User
            NodeList infoPerIdentifier = currNode.getChildNodes();

            for (int y =0; y <infoPerIdentifier.getLength() ; y++) {
                Node reservationNode = infoPerIdentifier.item(y);
                if (reservationNode.getNodeType() == Node.ELEMENT_NODE) {

                    NodeList reservationInfo = reservationNode.getChildNodes();

                    ArrayList<String> reservationParticulars = new ArrayList<>();
                    for (int z = 0; z < reservationInfo.getLength(); z++) {
                        Node reservationChildNode = reservationInfo.item(z);
                        if (reservationChildNode.getNodeType() == Node.ELEMENT_NODE)
                            reservationParticulars.add(reservationInfo.item(z).getTextContent());
                    }
                    String startTime = dateTimeFormatter.createTime(reservationParticulars.get(0));
                    String endTime = dateTimeFormatter.createTime(reservationParticulars.get(1));

                    String dateFromFile = dateTimeFormatter.createDate(reservationNode.getAttributes().item(0).getTextContent());

                    boolean dateExists = false;
                    for (Reservations reservation : reservationsList) {
                        if (reservation.getDate() == dateFromFile) {
                            reservation.addReservation(startTime,endTime,reservationParticulars.get(2));
                            dateExists = true;
                        }
                    }
                    if (!dateExists) {
                        // Create a reservation listing with the date
                        HashMap<TimeRange, String> timeRangeStringHashMap = new HashMap<>();
                        timeRangeStringHashMap.put(new TimeRange(startTime,endTime),reservationParticulars.get(2));
                        Reservations newReservation = new Reservations(dateFromFile, timeRangeStringHashMap);
                        reservationsList.add(newReservation);
                        //System.out.println(newReservation);
                    }

                }
            }
            parkingSpot.addReservationsList(reservationsList);
            parkingSpotList.add(parkingSpot);
        }
        return parkingSpotList;
    }

    public static void main(String[] args) {
        ReservationParser parser = new ReservationParser();
        List<ParkingSpot> parkingSpotList = parser.getParkingInformation();

        for (int x = 0 ; x < parkingSpotList.size(); x++) {
            System.out.println(parkingSpotList.get(x));
        }

    }


}
