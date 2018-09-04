import com.sun.net.httpserver.Authenticator;

import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class View {
    private JLabel mainWindow;

    public void View(){
        try {
            Setup();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void Setup() throws MalformedURLException {

        URL url = this.getClass().getResource("Success.gif");
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);

        JFrame f = new JFrame("Animation");
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //f.setUndecorated(true);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public void Setup(String path) throws MalformedURLException {

        URL url = new File(path).toURI().toURL();
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);

        JFrame f = new JFrame("Animation");
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //f.setUndecorated(true);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

}
