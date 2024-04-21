package E_serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        GorillaSerializer gorillaSerializer = new GorillaSerializer();

        List<Gorilla> gorillas = new ArrayList<>();
        gorillas.add(new Gorilla("klaas", 40, false));
        gorillas.add(new Gorilla("elodie", 39, true));

        File file = new File("test-directory\\gorillas.data");

        gorillaSerializer.saveToFile(gorillas, file);

        List<Gorilla> gorillasFromFile = gorillaSerializer.readFromFile(file);
        System.out.println(gorillasFromFile);

    }

}
