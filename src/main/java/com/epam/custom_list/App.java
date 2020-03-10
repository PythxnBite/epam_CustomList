package com.epam.custom_list;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        CustomList<Integer> cList = new CustomList<>();
        cList.add(58);
        cList.add(65);
        cList.add(47);
        cList.add(711);
        cList.add(877);
        System.out.println(cList);
        cList.remove(58);
        System.out.println(cList);
    }
}
