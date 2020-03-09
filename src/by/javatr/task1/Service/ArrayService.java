package by.javatr.task1.Service;


import by.javatr.task1.entity.Array;
import by.javatr.task1.util.FileLogic;

import java.util.ArrayList;
import java.util.List;

public class ArrayService {
    public static void randomizeArray(Integer[] integers) throws Exception {
        if (integers == null)
        {
            throw new Exception("Null array");
        }
        for (int i = 0;i<integers.length;i++)
        {
            integers[i] = (int)(Math.random() * 10);
        }
    }

    public static void randomizeArray(Integer[] integers, int minRange, int maxRange) throws Exception {
        if (integers == null)
        {
            throw new Exception("Null array");
        }
        if (minRange > maxRange || minRange >= integers.length)
        {
            throw new Exception("Wrong parameters");
        }
        for (int i = 0;i<integers.length;i++)
        {
            integers[i] = (int)(Math.random() * (maxRange-minRange+1) +minRange);
        }
    }

    public static Array fromCmd(String[] args) throws Exception {
        if (args == null)
        {
            throw new Exception("Args null");
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i<args.length;i++)
        {
            list.add(Integer.parseInt(args[i]));
        }
        Integer[] val = new Integer[list.size()];
        list.toArray(val) ;
        return new Array(val);
    }

    public static Array fromFile(String dir) throws Exception {
        if (dir == null)
        {
            throw new Exception("Invalid path");
        }
        return new Array(FileLogic.readDataInteger(dir));
    }
}
