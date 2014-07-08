import javax.swing.*;
import java.awt.*;

/**
 * Created by Daniel Brady as part of the typEd project.
 * Last modified on 07 July 2014 at 10:23 PM.
 *
 * This class models a simple text editor.
 */

public class RandomStringsPanel extends JPanel {

    // Instance variables
    private String message; // the message to be displayed
    private Font font1, font2, font3, font4, font5; // the five fonts to use
    private final Font[] FONTS = {font1, font2, font3, font4, font5};

    /**
     * Default constructor creates a panel that displays the message "Hukarz!"
     */
    public RandomStringsPanel() {
        this(null); // Call the other constructor such that it displays the default message
    }

    /**
     * Constructor creates a panel to display 25 copies of a specified message.
     * @param message The message to be displayed. If this is null, then the default message "Hukarz!" is displayed.
     */
    public RandomStringsPanel(String message) {
        this.message = message;

        if (message == null)
            this.message = "Hukarz!";

        font1 = new Font("Serif", Font.BOLD, 14);
        font2 = new Font("SansSerif", Font.BOLD + Font.ITALIC, 24);
        font3 = new Font("Monospaced", Font.PLAIN, 30);
        font4 = new Font("Dialog", Font.PLAIN, 36);
        font5 = new Font("Serif", Font.ITALIC, 48);

        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics g) {
        // Paint the background
        super.paintComponent(g);

        // Get context dimensions
        int width  = getWidth();
        int height = getHeight();

        // Draw 25 strings
        for (int i = 0; i < 25; i++) {
            // Draw one string.
            // First, set the font to be one of the five, at random.
            int fontNum = (int) (5 * Math.random());
            g.setFont(FONTS[fontNum]);

            // Set the color to be a bright, saturated color, with random hue.
            float hue = (float) Math.random();
            g.setColor( Color.getHSBColor(hue, 1.0f, 1.0f) );

            // Select the position of the string, at random.
            int x, y;
            x = -50 + (int) (Math.random() * (width + 40));
            y = (int) (Math.random() * (height + 20));

            // Draw the message
            g.drawString(message, x, y);
        }
    }
}