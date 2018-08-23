package chapter10.sample03;

public class Client extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing.");
    }

    public static void main(String[] args) {
        Client client = new Client();
        WindowEvent e = new WindowEvent();

        client.windowOpened(e);
        client.windowClosing(e);
        client.windowClosed(e);

    }

}
