package E_serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GorillaSerializer {

    /**
     * Serialization: write objects to stream/file
     */
    void saveToFile(List<Gorilla> gorillas, File file) throws IOException {
        var fileOutputStream = new FileOutputStream(file);
        var bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        try (var objectOutputStream = new ObjectOutputStream(bufferedOutputStream)) {
            for (Gorilla gorilla : gorillas) {
                objectOutputStream.writeObject(gorilla);
            }
        }
        System.out.println("serialization done");
    }

    /**
     * Deserialization: convert stream/file to objects
     */
    List<Gorilla> readFromFile(File file) throws IOException, ClassNotFoundException {
        List<Gorilla> gorillas = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream)) {
            while (true) {
                var object = objectInputStream.readObject();
                if (object instanceof Gorilla gorilla) {
                    gorillas.add(gorilla);
                }
            }
        } catch (EOFException e) {
            System.out.println("deserialization done");
        }
        return gorillas;
    }

}
