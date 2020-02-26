package by.javatr.task1.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileLogic {
    public static File openFile(String fileName) throws Exception {
        if (fileName == null)
        {
            throw new Exception("Path name null");
        }
        return new File(fileName);
    }

    public static Integer[] readDataInteger(String dir) throws Exception {
        if (dir == null)
        {
            throw new Exception("Invalid path");
        }
        Scanner scanner = null;
        List<Integer> integers = new ArrayList<>();
        try {
            scanner = new Scanner(openFile("resources/file.txt"));
            while (scanner.hasNextInt())
            {
                integers.add(scanner.nextInt());
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (scanner != null) {
                scanner.close();
            }
        }
        Integer[] intVal = new Integer[integers.size()];
        return integers.toArray(intVal);
    }
}
