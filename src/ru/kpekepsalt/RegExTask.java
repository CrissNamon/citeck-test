package ru.kpekepsalt;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 Написать алгоритм проверки корректности регулярного выражения, которое включает [,],(,)
 */
public class RegExTask {

    private String regex;
    private static final Map<String, String> symbols = new HashMap<>();
    static{
        symbols.put("(", ")");
        symbols.put("[", "]");
    }

    public RegExTask(String regex)
    {
        this.regex = regex;
    }

    public boolean isCorrect()
    {
        ArrayTask<String> arrayTask = new ArrayTask<>();
        Map<String, Integer> entries = arrayTask.countArrayEntriesToMap(regex.split(""));
        AtomicBoolean isCorrect = new AtomicBoolean(true);
        symbols.forEach((key, value) ->
        {
            int opened = entries.get(key);
            int closed = entries.get(value);
            isCorrect.set(isCorrect.get() && (opened == closed));
        });
        return isCorrect.get();
    }
}
