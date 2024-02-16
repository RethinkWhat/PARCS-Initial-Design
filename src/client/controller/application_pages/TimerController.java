package client.controller.application_pages;

import client.model.application_pages.TimerModel;
import client.view.application_pages.TimerPageView;
import utilities.Resources;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The TimerController processes the user requests for viewing the current booking.
 * Based on the user request, the TimerController defines methods and invokes methods in the View and Model
 * to accomplish the requested action.
 */
public class TimerController {
    /**
     * The view TimerPageView.
     */
    private TimerPageView view;
    /**
     * The model TimerModel.
     */
    private TimerModel model;

    /**
     * Constructs a TimerController with a specified view and model.
     * @param view The specified view.
     * @param model The specified model.
     */
    public TimerController(TimerPageView view, TimerModel model) {
        this.view = view;
        this.model = model;

        // constants / variables
        // TODO: add method to check if the time today is equal to the time of the booking.
        //  Use the code below to start it:

        //if (model.isStartTimer()) {
        //    view.getPnlTimerGraphics().getSwingTimer().start();
       // }

        view.getPnlTicketInfo().setLblParkingType(model.getParkingType());
        view.getPnlTicketInfo().setLblParkingSpot(model.getParkingSlot());
        view.getPnlTicketInfo().setLblParkingDate(model.getDate());
        view.getPnlTicketInfo().setLblParkingDuration((model.getDuration() + " hour/s"));
        view.getPnlTicketInfo().setLblParkingTime(model.getTimeIn() + " - " + model.getTimeOut());

        // action listeners
        view.getPnlTimer().setEndTimerListener(e -> { // opens a JDialog to show a message
            view.getDlgEndTimer().setLocationRelativeTo(view);
            view.getDlgEndTimer().setVisible(true);
            view.getDlgEndTimer().setAlwaysOnTop(true);
            view.getDlgEndTimer().requestFocusInWindow();
        });
        view.getDlgEndTimer().setConfirmListener(new ConfirmListener()); // actual ending of the ticket timer.
        view.getDlgEndTimer().setCancelListener(e -> view.getDlgEndTimer().dispose());

        // mouse listeners
        view.getPnlTimer().getBtnEndTimer().addMouseListener(new Resources.CursorChanger(view.getPnlTimer().getBtnEndTimer()));
        view.getDlgEndTimer().getBtnConfirm().addMouseListener(new Resources.CursorChanger(view.getDlgEndTimer().getBtnConfirm()));
        view.getDlgEndTimer().getBtnCancel().addMouseListener(new Resources.CursorChanger(view.getDlgEndTimer().getBtnCancel()));
    }

    /**
     * Processes the request for the end timer confirmation.
     */
    class ConfirmListener implements ActionListener {
        /**
         * TODO: Documentation
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO: Implementation of cancelling the ticket.
        }
    }

    public void startTimer() {
        Thread thread = new Thread(() -> {
            if (model.getClient().getDate().equals(model.getDate()) &&
                    model.getTimeIn().split(":")[0].compareTo(model.getClient().getTime())>0) {
                if (model.isStartTimer() && !model.isTimeStarted()) {
                    String timeNow[] = model.getClient().getTime().split(":");

                    int secondsNow = Integer.parseInt(timeNow[2]);
                    int minutesNow = Integer.parseInt(timeNow[1]);
                    int hoursNow = Integer.parseInt(timeNow[0]);

                    int secondsRemaining = 0;
                    int minutesRemaining = 0;
                    int hoursRemaining = hoursNow;

                    if (secondsNow != 0) {
                        secondsRemaining = 60 - secondsNow;
                        minutesRemaining -= 1;
                    }
                    if (minutesNow != 0) {
                        minutesRemaining += 60 - minutesNow;
                        hoursRemaining -= 1;
                    }

                    view.getPnlTimerGraphics().setHour(hoursRemaining);
                    view.getPnlTimerGraphics().setMinute(minutesRemaining);
                    view.getPnlTimerGraphics().setSecond(secondsRemaining);
                /*
                view.getPnlTimerGraphics().setHour(
                        Integer.parseInt(model.getTimeOut().split(":")[0]) -
                                hoursNow);
                view.getPnlTimerGraphics().setMinute(Integer.parseInt(timeNow[1]));

                if ((Integer.parseInt(timeNow[2])) != 0) {
                    Integer secondsRemaining = 60 - Integer.parseInt(timeNow[2]);
                }

                view.getPnlTimerGraphics().setSecond(Integer.parseInt(timeNow[2]));

                 */

                    view.getPnlTimerGraphics().getSwingTimer().start();
                    model.setTimeStarted(true);
                }
            }
        });
        thread.start();
    }

}
