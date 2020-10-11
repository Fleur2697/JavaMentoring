package task3;


import java.util.*;


public class WithoutDuplicates {

//    2.Колекція без дублікатів.
//            Задача:
//    Написати метод, який на вхід принімає колекцію обєктів V (Generic), в якій є дублючі обєкти, а вертає колекцію V вже без дублікатів.

    public ArrayList<Integer> DuplicateKiller(List<Integer> withDuplicate) {
        return new ArrayList<>(new HashSet<>(withDuplicate));
    }

    public static void main(String[] args) {
        ArrayList<Integer> withDuplicate = new ArrayList<>(Arrays.asList(1, 5, 12, 48, 98, 98, 12, 1, 1));
        WithoutDuplicates dupKillerObj = new WithoutDuplicates();
        System.out.println(dupKillerObj.DuplicateKiller(withDuplicate));
    }
}
