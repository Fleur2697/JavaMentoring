package task3;

import java.util.*;

public class ReplaceKeyValue {
//    Замінити ключі і значення в Map
//    Написати метод, який принімає Map<K, V> і вертає Map, де ключі і значення поміняні місцями.
//    Так як знаяення можуть бути не унікальними, то тип значення в Map буде вже не K, а Collection<K>:
//    Map<V, Collection<K>>

    public static HashMap<String, ArrayList<String>> keyValueReplaces(Map<String, String> map) {
        HashMap<String, ArrayList<String>> mapWithReplace = new HashMap<>();
        Set<Map.Entry<String, String>> helpMap = map.entrySet();
        for (Map.Entry<String, String> s : helpMap) {
            if (!mapWithReplace.containsKey(s.getValue())) {
                ArrayList<String> values = new ArrayList<>();
                values.add(s.getKey());
                mapWithReplace.put(s.getValue(), values);
            } else {
                ArrayList<String> temp = mapWithReplace.get(s.getValue());
                temp.add(s.getKey());
                mapWithReplace.put(s.getValue(), temp);
            }
        }

        return mapWithReplace;
    }

    public static void main(String[] args) {
        HashMap<String, String> mappy = new HashMap<>();
        mappy.put("Olga", "QA");
        mappy.put("Yurii", "Dev");
        mappy.put("Nikita", "Dev");
        mappy.put("Pasha", "QA");
        System.out.println(ReplaceKeyValue.keyValueReplaces(mappy));

    }

}




