package by.javatr.scanner;

import by.javatr.task1.util.FileLogic;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataScanner
{
    public static int enterIntFromConsole(){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (!scanner.hasNextInt()){
            scanner.next();
        }
        a = scanner.nextInt();
        return a;
    }

    public static double enterDoubleFromConsole(){
        Scanner scanner = new Scanner(System.in);
        double a = 0.0;
        while (!scanner.hasNextDouble()){
            scanner.next();
        }
        a = scanner.nextDouble();
        return a;
    }
}
