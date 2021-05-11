package ru.kpekepsalt;

/**
 * Написать алгоритм, как в целом числе самый правый ноль превратить в единицу не используя циклы и рекурсию
 */
public class ZeroReplaceTask {

    public static int replace(int number)
    {
        String str = String.valueOf(number);
        char[] chars = str.toCharArray();
        chars[str.lastIndexOf('0')] = '1';
        return Integer.parseInt(String.valueOf(chars));
    }

}
