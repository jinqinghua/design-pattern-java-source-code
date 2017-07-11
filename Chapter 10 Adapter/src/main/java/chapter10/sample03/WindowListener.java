package chapter10.sample03;

public interface WindowListener {

    void windowOpened(WindowEvent e);

    void windowClosing(WindowEvent e);

    void windowClosed(WindowEvent e);

    void windowIconified(WindowEvent e);

    void windowDeiconified(WindowEvent e);

    void windowActivated(WindowEvent e);

    void windowDeactivated(WindowEvent e);
}


class WindowEvent {

}
