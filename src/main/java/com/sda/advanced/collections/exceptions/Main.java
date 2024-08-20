package com.sda.advanced.collections.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/sda/advanced/collections/exceptions";
        String fileName = "parks.csv";
        String fileName2 = "parks2.csv";
        System.out.println(readFromFile(filePath, fileName));


        List<String> result = readFromFile(filePath, fileName);
//        writeToFile(filePath, fileName2, result);
//        appendToFile(filePath,fileName2, result);

        try {
            validateContent(result);
        } catch (MissingLocationException e) {
            System.out.println("Missing location information.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }


    }

    public static List<String> readFromFile(String filePath, String name) {
        Path path = Paths.get(filePath + "/" + name);
        try {
            List<String> content = Files.readAllLines(path);
            content.remove(0);
            return content;
        } catch (IOException e) {
            System.err.println("File could not be read.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void writeToFile(String filePath, String name, List<String> content) {
        Path path = Paths.get(filePath + "/" + name);
        try {
            Files.write(path, content);
        } catch (IOException e) {
            System.err.println("Unable to write to file.");
            e.printStackTrace();
            throw new RuntimeException(e);

        }
    }

    public static void appendToFile (String filePath, String name, List<String> content) {
        Path path = Paths.get(filePath + "/" + name);
        try {
            Files.write(path, content, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Unable to write to file.");
            e.printStackTrace();
            throw new RuntimeException(e);

        }
    }

    public static void validateContent (List<String> text) throws MissingLocationException {
        for (String s : text) {
            int index = s.indexOf(",");
            String newString = s.substring(index + 1);
            if (newString.isEmpty() || newString.isBlank()){
                throw new MissingLocationException();
            }
        }
    }

}
