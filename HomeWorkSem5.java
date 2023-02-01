package org.example;


import java.util.ArrayList;
import java.util.HashMap;

public class HomeWorkSem5 {
    public static void main(String[] args) {

        ArrayList<String> fam = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> ser = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gen = new ArrayList<>();

        HashMap<Integer, String> hsh = new HashMap<>();
        hsh.put(1, "Иванов Иван Иванович 32 м");
        hsh.put(2, "Иванова Инга Ивановна 25 ж");
        hsh.put(3, "Петров Игорь михайлович 22 м");
        hsh.put(4, "Сорокин Михаил Михайлович 55 м");
        hsh.put(5, "Васильева Василиса Васильевна 30 ж");

        int i = 1;
        String txt = "";


        for (String l: hsh.values()) {
            String tmp;
            tmp = l.replace(l.substring(l.length()-1), l.substring(l.length()-1).toUpperCase());
            hsh.put(i++ , tmp);
            txt += tmp+("\n");

        }
        String[] str = txt.split("\n");
        for (int k = 0; k < str.length; k++) {
            String[] strB = str[k].split(" ");
            fam.add(strB[0]);
            name.add(String.valueOf(strB[1].charAt(0)));
            ser.add(String.valueOf(strB[2].charAt(0)));
            age.add(Integer.valueOf(strB[3]));
            gen.add(strB[4].equals("Ж") ? true : false);


        }
        for (int x = 0; x < str.length; x++) {

            System.out.printf(fam.get(x) + " ");
            System.out.printf(name.get(x) + ". ");
            System.out.printf(ser.get(x) + ". ");
            System.out.println();

        }
    }

}
