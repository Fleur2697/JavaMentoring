package task3;

import java.util.*;

public class TwoCollectionToMap {
//  5. Конвертація двох колекцій в Map
//    Задача:
//    Написати метод, який принімає два масиви/списки елементів типу K, V (Generic) з різною кількість елементів
//    і вертає сортований Map<K, V>.
//            1. Якщо масив K > V - то записати в value null, якщо масив K < V - зайві value не обробляти
//2. Якщо масив K > V - перехватить помилку і вивести на екран повідомлення "Value is not enough for map",
// якщо масив K < V - перехватит помилку і вивести на екран повідомлення "Key is not enough for map"


    public static <K extends Comparable<K>, V> Map<K, V> collectionToMapHandle(ArrayList<K> kKey, ArrayList<V> vValue) {
        Map<K, V> map = new TreeMap<>();
        for (int i = 0; i < kKey.size(); i++) {
            if (i >= vValue.size()) {
                map.put(kKey.get(i), null);
            } else {
                map.put(kKey.get(i), vValue.get(i));
            }
        }
        return map;
    }


    public static <K extends Comparable<K>, V> Map<K, V> collectionToMapException(ArrayList<K> kKey, ArrayList<V> vValue) {
        Map<K, V> map = new TreeMap<>();
        if (vValue.size() < kKey.size()) {
            throw new RuntimeException("Value is not enough for map");
        } else if (vValue.size() > kKey.size()) {
            throw new RuntimeException("Key is not enough for map");
        }
        for (int i = 0; i < kKey.size(); i++) {
            map.put(kKey.get(i), vValue.get(i));
        }

        return map;
    }


    public static void main(String[] args) {
        ArrayList<Integer> kKey = new ArrayList<>();
        kKey.add(12);
        kKey.add(18);
        kKey.add(20);
        ArrayList<String> vValue = new ArrayList<>();
        vValue.add("Some");
        vValue.add("Test");
        vValue.add("Co-Co");
        try {
            System.out.println(TwoCollectionToMap.collectionToMapException(kKey, vValue));
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(TwoCollectionToMap.collectionToMapHandle(kKey, vValue));

    }
}
