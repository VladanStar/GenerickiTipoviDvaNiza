package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(5);
        lista1.add(15);
        lista1.add(11);
        lista1.add(16);
        lista1.add(18);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(5);
        lista2.add(15);
        lista2.add(26);
        lista2.add(18);
        lista2.add(10);

        System.out.println(presek(lista1,lista2));

        List<String> lista3 = new ArrayList<>();
        lista3.add("a");
        lista3.add("abc");
        lista3.add("aab");
        lista3.add("bab");
        lista3.add("bba");

        List<String> lista4 = new ArrayList<>();
        lista4.add("aaa");
        lista4.add("abb");
        lista4.add("aab");
        lista4.add("abba");
        lista4.add("babb");

        System.out.println(presek(lista3,lista4));


    }

    public static <T>List<T>  presek(List<T> lista1, List<T> lista2) {
        List<T> presek = new ArrayList<>();
        for (T el:lista1){
            if(lista2.contains(el)){
                presek.add(el);
            }
        }
        return presek;
    }
}
