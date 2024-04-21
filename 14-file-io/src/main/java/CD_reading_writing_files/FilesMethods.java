package CD_reading_writing_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilesMethods {

    public static void main(String[] args) throws IOException {

        Path input = Path.of("test-directory/input.txt");
        Path outputString = Path.of("test-directory/output-string.txt");
        Path outputBytes = Path.of("test-directory/output-bytes.txt");
        Path outputLines = Path.of("test-directory/output-lines.txt");
        Path outputBuffered = Path.of("test-directory/output-buffered.txt");

        // read & write path as string
        String inputString = Files.readString(input);
        System.out.println("inputString: " + inputString);
        Path outputPath = Files.writeString(outputString, inputString, StandardOpenOption.TRUNCATE_EXISTING);
        System.out.println("outputPath: " + outputPath);
        System.out.println("-----------------");

        // read & write path as byte array
        byte[] inputByteArray = Files.readAllBytes(input);
        System.out.println("inputByteArray: " + Arrays.toString(inputByteArray));
        outputPath = Files.write(outputBytes, inputByteArray);
        System.out.println("outputPath: " + outputPath);
        System.out.println("-----------------");

        // read & write path per line
        List<String> inputLines = Files.readAllLines(input);
        System.out.println("inputLines: " + inputLines);
        outputPath = Files.write(outputLines, inputLines);
        System.out.println("outputPath: " + outputPath);
        System.out.println("-----------------");

        // read path lazily as a stream
        try (Stream<String> stream = Files.lines(input)) {
            stream.filter(s -> s.startsWith("s"))
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
        }
        System.out.println("-----------------");

        // create buffered I/O streams for given path with factory method
        try (BufferedReader bufferedReader = Files.newBufferedReader(input);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(outputBuffered)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }
        }
        System.out.println(Files.readString(outputBuffered));
        System.out.println("-----------------");

        // create buffered I/O streams for given path with factory method
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(input.toFile()));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputBuffered.toFile()))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }
        }
        System.out.println(Files.readString(outputBuffered));
        System.out.println("-----------------");


    }

}
