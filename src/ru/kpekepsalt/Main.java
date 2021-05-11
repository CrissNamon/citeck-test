package ru.kpekepsalt;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //1 задание
        ArrayTask<Integer> arrayTask = new ArrayTask<>();
        List<Integer> list = arrayTask.countArrayEntriesToList(new Integer[]{1, 1, 2, 3, 3, 4, 4, 4});
        System.out.println(list.toString());

        //2 задание
        RegExTask regExTask = new RegExTask("([][]()])");
        System.out.println(regExTask.isCorrect());

        //3 задание
        int number = 10304;
        System.out.println(ZeroReplaceTask.replace(number));
    }
}
