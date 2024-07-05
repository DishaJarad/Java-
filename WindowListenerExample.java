import java.awt.*;
import java.awt.event.*;

public class WindowListenerExample extends Frame implements WindowListener {

    public WindowListenerExample() {
        // Set frame properties
        setSize(400, 300);
        setTitle("Window Listener Example");

        // Add window listener to the frame
        addWindowListener(this);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowListenerExample();
    }

    // Implementing WindowListener interface methods
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened!");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing...");
        dispose(); // Close the frame
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed!");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window iconified!");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window deiconified!");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated!");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated!");
    }
}
