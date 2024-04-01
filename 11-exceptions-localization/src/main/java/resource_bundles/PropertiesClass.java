package resource_bundles;

import java.util.Properties;

public class PropertiesClass {

    public static void main(String[] args) {

        Properties properties = new Properties();

        properties.setProperty("hello","hallo");
        properties.setProperty("open","De zoo is open");

        System.out.println(properties.getProperty("hello"));
        System.out.println(properties.getProperty("klaas"));
        System.out.println(properties.getProperty("klaas", "klaas"));

        System.out.println(properties.get("hello"));
        System.out.println(properties.get("klaas"));
//        System.out.println(properties.get("klaas", "klaas"));

    }

}
