package geekbrains;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Движок", "Лозняк", "Вытряхнуть", "Привал", "Привал",
                "Перечислить", "Безумец", "Различный", "Репертуар", "Настил",
                "Лозняк", "Вытряхнуть", "Перечислить", "Привал", "Кряжистый",
                "Вытряхнуть", "Безумец", "Картингист", "Привал", "Потихоньку"
        );

        Set<String> unique = new HashSet<String>(words);


        System.out.println("Список уникальных слов: ");
        System.out.println(unique.toString());

        System.out.println("Сколько раз встречается каждое слово:");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}