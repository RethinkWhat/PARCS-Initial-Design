package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 * The stylesheet of the different view classes.
 */
public class Resources {
    /**
     * Main brand color
     */
    public final Color celadon = new Color(128,207,168);
    /**
     * Secondary brand color
     */
    public final Color feldgrau = new Color(76,102,99);
    /**
     * Solid color
     */
    public final Color eerieBlack = new Color(17,29, 19);
    /**
     * Solid color
     */
    public final Color white = new Color(255,255,255);
    /**
     * Background color for I/O components.
     */
    public final Color lightGray = new Color(239,239,239);
    /**
     * Foreground color for I/O components.
     */
    public final Color gray = new Color(133,133,133);

    public Resources() {
    }

    /**
     *
     */
    public ImageIcon logoParcs = new ImageIcon("res/drawable/parcs-logo.png");

    /**
     * Creates a new JLabel with a specified text and color.
     * The JLabel is a heading (h1).
     * @param text The specified text.
     * @param color The specified color.
     * @return JLabel with specified text and color in an H1 format.
     */
    public JLabel createLblH1(String text, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 26));
        label.setForeground(color);
        return label;
    }

    /**
     * Creates a new JLabel with a specified text and color.
     * The JLabel is a heading (h2).
     * @param text The specified text.
     * @param color The specified color.
     * @return JLabel with specified text and color in an H2 format.
     */
    public JLabel createLblH2(String text, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 22));
        label.setForeground(color);
        return label;
    }

    /**
     * Creates a new JLabel with a specified text and color.
     * The JLabel is a heading (h3).
     * @param text The specified text.
     * @param color The specified color.
     * @return JLabel with specified text and color in an H3 format.
     */
    public JLabel createLblH3(String text, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setForeground(color);
        return label;
    }

    /**
     * Creates a new JLabel with a specified text and color.
     * The JLabel is a paragraph.
     * @param text The specified text.
     * @param color The specified color.
     * @return JLabel with specified text and color in a paragraph format.
     */
    public JLabel createLblP(String text, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        label.setForeground(color);
        return label;
    }

    /**
     * Creates a new JButton with a specified text, background color, foreground color, and radius.
     * @param text The specified text.
     * @param background The specified background.
     * @param foreground The specified foreground.
     * @param radius The specified radius.
     * @return The specified button.
     */
    public JButton createBtnRounded(String text, Color background, Color foreground, int radius) {
        JButton button = new JButton(text);
        button.setBackground(background);
        button.setForeground(foreground);
        button.setBorder(new RoundedBorder(radius));
        button.setVerticalTextPosition(SwingConstants.CENTER);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setContentAreaFilled(true);
        button.setBorderPainted(true);
        return button;
    }

    /**
     * Template for RoundedBorder object.
     */
    static class RoundedBorder implements Border {
        /**
         * The radius of the rounded border.
         */
        private int radius;

        /**
         * Constructs a rounded border with a specified radius.
         * @param radius The specified radius.
         */
        RoundedBorder(int radius) {
            this.radius = radius;
        }

        /**
         * Retrieves the current insets of the rounded border.
         * @param c the component for which this border insets value applies
         * @return The current insets of the rounded border.
         */
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+2, this.radius+2, this.radius+3, this.radius);
        }

        /**
         * Returns the current state of opacity of the rounded border.
         * Returns true if the border is opaque, false if otherwise.
         * @return The current opacity of the rounded border.
         */
        public boolean isBorderOpaque() {
            return true;
        }

        /**
         * Paints the Border.
         * @param c the component for which this border is being painted
         * @param g the paint graphics
         * @param x the x position of the painted border
         * @param y the y position of the painted border
         * @param width the width of the painted border
         * @param height the height of the painted border
         */
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }

    /**
     * Creates a JTextField with rounded corners with a specified text, background color, foreground color, and columns.
     * @param text The specified text.
     * @param background The specified background color.
     * @param foreground The specified foreground color.
     * @param columns The specified columns.
     * @return The new JTextField with rounded borders.
     */
    public JTextField createTxtRounded(String text, Color background, Color foreground, int columns) {
        JTextField textField = new RoundJTextField(columns);
        textField.setText(text);
        textField.setBackground(background);
        textField.setForeground(foreground);
        textField.setFont(new Font("Arial",Font.PLAIN,16));
        return textField;
    }

    /**
     * Template for RoundedJTextField object.
     */
    static class RoundJTextField extends JTextField {
        /**
         * The shape of the RoundJTextField.
         */
        private Shape shape;

        /**
         * Constructs a RoundJTextField with a specified size.
         * @param size The specified size.
         */
        public RoundJTextField(int size) {
            super(size);
            setOpaque(false); // As suggested by @AVD in comment.
        }

        /**
         * Paints the background of the RoundJTextField.
         * @param g the <code>Graphics</code> object to protect
         */
        protected void paintComponent(Graphics g) {
            g.setColor(getBackground());
            g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
            super.paintComponent(g);
        }

        /**
         * Paints the borders of the RoundJTextField.
         * @param g  the <code>Graphics</code> context in which to paint
         *
         */
        protected void paintBorder(Graphics g) {
            g.setColor(getForeground());
            g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
        }

        /**
         * Checks whether the shape is equal to the given bound coordinates.
         * @param x   the <i>x</i> coordinate of the point
         * @param y   the <i>y</i> coordinate of the point
         * @return true / false
         */
        public boolean contains(int x, int y) {
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
            }
            return shape.contains(x, y);
        }
    }

    /**
     * Creates a RoundJPasswordField with a specified background color, foreground color, and columns.
     * @param background The specified background color.
     * @param foreground The specified foreground color.
     * @param columns The specified columns.
     * @return The new RoundJPasswordField.
     */
    public JPasswordField createPwdRounded(Color background, Color foreground, int columns) {
        JPasswordField passwordField = new RoundJPasswordField(columns);
        passwordField.setBackground(background);
        passwordField.setForeground(foreground);
        passwordField.setFont(new Font("Arial",Font.PLAIN,16));
        return passwordField;
    }

    /**
     * Template for RoundJPasswordField object.
     */
    static class RoundJPasswordField extends JPasswordField {
        /**
         * The shape of the RoundJPasswordField.
         */
        private Shape shape;

        /**
         * Constructs a RoundJPasswordField with a specified size.
         * @param size The specified size.
         */
        public RoundJPasswordField(int size) {
            super(size);
            setOpaque(false);
        }

        /**
         * Paints the background of the RoundJTextField.
         * @param g the <code>Graphics</code> object to protect
         */
        protected void paintComponent(Graphics g) {
            g.setColor(getBackground());
            g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
            super.paintComponent(g);
        }

        /**
         * Paints the borders of the RoundJTextField.
         * @param g  the <code>Graphics</code> context in which to paint
         *
         */
        protected void paintBorder(Graphics g) {
            g.setColor(getForeground());
            g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
        }

        /**
         * Checks whether the shape is equal to the given bound coordinates.
         * @param x   the <i>x</i> coordinate of the point
         * @param y   the <i>y</i> coordinate of the point
         * @return TODO
         */
        public boolean contains(int x, int y) {
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
            }
            return shape.contains(x, y);
        }
    }
}
