/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B4_OverviewMangDong;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        System.out.println(lists.size());
        lists.add(3);
        System.out.println(lists.size());
        lists.add(5);
        System.out.println(lists.size());
        List<Integer> listsIntegers = new ArrayList<>();
        listsIntegers.add(4);
        listsIntegers.add(5);
        System.out.println(listsIntegers);
    }
}
