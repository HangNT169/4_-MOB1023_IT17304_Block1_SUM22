/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_Expection;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
// https://github.com/HangNT164/FPTUniversity_Project
       // https://openplanning.net/10175/java-regular-expression
//        https://github.com/AnhDT0407/Course-JavaCore/blob/master/Java-Lesson/Java%208/1.%20Lamda%20Expressions/3.%20So%20s%C3%A1nh%20m%E1%BA%A1nh%20m%E1%BA%BD%20v%E1%BB%9Bi%20Lambda.md
      
    /**
     * 1. Khi nao xay ra expection? 2. Nhung cach fix khi xay ra expection? 3.
     * Huong dan tu custom 1 expection.
     */
    public static void main(String[] args) {
        // Nhap vao tuoi tu ban phim
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap tuoi:");

//        try {
//            // Chua nhung dong co the xay ra loi ma cac ban nghi ngo
//            int tuoi = sc.nextInt();
//        } catch (Exception e) {
//            // khi xay ra loi se lam gi =>vut o day
//            System.out.println("Kieu du lieu khong hop ly");
//        }
//        int a[] = {-1, 4, 5, 2, 9};
//        System.out.println(a[10]);
//        try {
//            System.out.println(a[0]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            // xu ly loi
//            System.out.println("Mang k chua du 10 phan tu");
//        } finally {
//            // Moi thu trong finally deu duoc thuc hien du bi loi hay khong
//            System.out.println("Cuoi cung");
//        }
        try {
            System.out.println("Hien thi");
            throw new MyExpection("Custom expection");
        } catch (MyExpection e) {
            System.out.println(e.getMessage());
        }
    }
}
