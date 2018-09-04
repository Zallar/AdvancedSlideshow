import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Controller {
    private static View view;



















    //Start of main function
    public static void main(String[] args) {
        view = new View();
        try {
            view.Setup();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
