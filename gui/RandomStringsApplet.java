import javax.swing.*;

/**
 * Created by Daniel Brady as part of the typEd project.
 * Last modified on 07 July 2014 at 11:55 PM.
 *
 * This class is a simple applet which uses a RandomStringsPanel as its content pane.
 */

public class RandomStringsApplet extends JApplet {

    public void init() {
        String message = getParameter("message");
        RandomStringsPanel content = new RandomStringsPanel(message);
        setContentPane(content);
    }
}
