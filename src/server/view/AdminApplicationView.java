package server.view;

import client.view.ApplicationView;
import client.view.application_pages.ReservationPageView;
import client.view.application_pages.UserProfileView;
import utilities.Resources;

import javax.swing.*;
import java.awt.*;

public class AdminApplicationView extends JFrame {
    /**
     * The panel that holds different component panels.
     */
    private JPanel pnlCards;
    /**
     * The button that expands the navigation bar.
     */
    private JButton btnNavMenu;
    /**
     * The server status button in the navigation bar.
     */
    private JButton btnNavStatus;
    /**
     * The dashboard button in the navigation bar.
     */
    private JButton btnNavDashboard;
    /**
     * The logout button in the navigation.
     */
    private JButton btnNavLogout;
    /**
     * Location of the current user.
     */
    private JLabel lblLocation;
    /**
     * The CardLayout that controls the components of the MainPanel (pnlMain).
     */
    private CardLayout mainCardLayout = new CardLayout();
    /**
     * The stylesheet.
     */
    private Resources res = new Resources();

    private ServerStatusView serverStatusView;
    private DashboardView dashboardView;

    /**
     * Constructs an AdminApplicationView frame.
     */
    public AdminApplicationView() {
        super("PARCS Admin");

        // body panel acting as a container to hold all UI components
        Container contentArea = new JPanel(new BorderLayout());

        // header
        HeaderPanel pnlHeader = new HeaderPanel();
        contentArea.add(pnlHeader, BorderLayout.NORTH);

        // navigation
        NavbarPanel pnlNavbar = new NavbarPanel();
        contentArea.add(pnlNavbar, BorderLayout.WEST);

        // body
        pnlCards = new JPanel(mainCardLayout);
        pnlCards.setPreferredSize(new Dimension(1100,700));
        contentArea.add(pnlCards, BorderLayout.CENTER);

        // Server Status Page
        pnlCards.add(serverStatusView = new ServerStatusView(), "status");

        // Dashboard Page
        pnlCards.add(dashboardView = new DashboardView(), "dashboard");

        this.setContentPane(contentArea);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setSize(1300,800);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * The panel that contains useful information and the searchbar.
     */
    class HeaderPanel extends JPanel {
        /**
         * Constructs a panel of HeaderPanel.
         */
        public HeaderPanel() {
            setBackground(res.celadon);
            setLayout(new FlowLayout(FlowLayout.LEFT));

            btnNavMenu = res.createBtnIconOnly(res.logoParcs, 40,30);
            add(btnNavMenu);

            lblLocation = res.createLblH3("Server Status", res.white);
            add(lblLocation);

            this.setPreferredSize(new Dimension(1300, 50));
        }
    }

    /**
     * The navigation bar contains the buttons for navigation.
     */
    class NavbarPanel extends JPanel {
        /**
         * Constructs a panel of NavbarPanel.
         */
        public NavbarPanel() {
            setBackground(res.feldgrau);

            btnNavStatus = res.createBtnIconOnly(res.iconHome,30,30);
            btnNavStatus.setHorizontalAlignment(SwingConstants.LEFT);
            add(btnNavStatus);

            btnNavDashboard = res.createBtnIconOnly(res.iconTicket, 30,30);
            btnNavDashboard.setHorizontalAlignment(SwingConstants.LEFT);
            add(btnNavDashboard);

            btnNavLogout = res.createBtnIconOnly(res.iconLogout,30,30);
            btnNavLogout.setHorizontalAlignment(SwingConstants.LEFT);
            add(btnNavLogout);

            this.setPreferredSize(new Dimension(60, 800));
        }
    }
}
