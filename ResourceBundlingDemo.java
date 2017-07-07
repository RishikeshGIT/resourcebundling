package resourcebundling;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by kumarris on 13/02/17.
 */
public class ResourceBundlingDemo {
    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("resources/Messages", Locale.CANADA_FRENCH);
        String inputString = "Hello_world";

        System.out.println(resourceBundle.getString(inputString));

    }
}
