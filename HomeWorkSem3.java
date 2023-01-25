package JavaLess1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class HomeWorkSem3 {
    public static void main(String[] args) {
        ArrayList<Integer> HomeWList = new ArrayList<>();
        ArrayList<Integer> HomeWList2 = new ArrayList<>();
        for (int j = 1; j < 20; j++) {
            HomeWList.add(new Random().nextInt(20));
            HomeWList2.add(new Random().nextInt(20));
        }
        System.out.println("Первый список " + HomeWList);
        System.out.println("Второй список " + HomeWList2);
        HomeWList.removeAll(HomeWList2);
        System.out.println("Удалил элементы отсутсвующие во втором " + HomeWList);
        Collections.sort(HomeWList);
        System.out.println("Метод Collections.sort " + HomeWList);
        HomeWList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("Компоратор " + HomeWList);

        System.out.println("Пузырьковая сортировка по уменьшению " + sorted(HomeWList));
    }

    public static ArrayList<Integer> sorted(ArrayList<Integer> arrayList) {

        for (int j = 0; j < arrayList.size(); j++) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(j) > arrayList.get(i)) {
                    int tmp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, tmp);
                }
            }
        }
        return arrayList;
    }

}