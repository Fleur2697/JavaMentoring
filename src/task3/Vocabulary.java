package task3;

/*Задача:
        Побудувати частотний словник букв алфавіту. Створити метод, який принімає текс і вертає словник,
        в якиму міститься символ і його кількість.*/

import java.util.HashMap;
import java.util.Map;

public class Vocabulary {

    public static Map<Character, Integer> characterFrequency(String text) {
        char[] textChars = text.toCharArray();
        Map<Character, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < textChars.length; i++) {
            if (hashmap.containsKey(textChars[i])) {
                hashmap.put(textChars[i], hashmap.get(textChars[i]) + 1);
            } else {
                hashmap.put(textChars[i], 1);
            }
        }
        return hashmap;

    }

    public static void main(String[] args) {
        System.out.println( Vocabulary.characterFrequency("Hellooooo, Pavlo"));
    }
}
