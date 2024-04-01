package resource_bundles;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class PropertiesFile {

    public static void main(String[] args) {

        ResourceBundle resourceBundleFR = ResourceBundle.getBundle("zoo", Locale.FRANCE);
        System.out.println(resourceBundleFR.getString("hello"));
        System.out.println(resourceBundleFR.getString("open"));
        String helloByName = MessageFormat.format(resourceBundleFR.getString("helloByName"), "Klaas");
        System.out.println(helloByName);

        ResourceBundle resourceBundleDefault = ResourceBundle.getBundle("zoo");
        resourceBundleDefault.keySet().stream()
                .map(resourceBundleDefault::getString)
                .forEach(System.out::println);

    }

}
