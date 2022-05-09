/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1_ReviewOOP;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * 4 dac trung cua oop 
     * - tinh dong goi: accecpt modifier(Pham vi truy cap):
     * public,protected,default,private 
     * - tinh ke thua :extends 
     * 1 doi tuong gom : thuoc tinh(cac bien) va phuong thuc(cac ham) 
     * Quy tac dat ten bien, ten ham: nen dat theo con lac da, Chu dau viet thuong, tu chu thu 2 tro di
     * thi viet hoa 
     * Trong lap trinh:
     * 1. Con lac da: numberFirst 
     * 2. Hinh con ran:number_first 
     * Codding conversion : 
     * Quy tac dat ten class: cung theo con lac da nhung chu dau la viet hoa: Student 
     * Quy tac dat ten pacakge: viet thuong va la so it 
     * Co 2 loai contructor: contructor khong tham so va contructor co tham so 
     * Mac dinh cua 1 class la contructor khong tham so
     */
    /**
     * Bai tap: 
     * Tao 1 class Nguoi gom cac thuoc tinh: ten-String,tuoi-int va cac
     * phuong thuc contructor, getter, setter 
     * Tao 1 class SinhVien ke thua tu class Nguoi co them thuoc tinh mssv-String, diem-double 
     * va cac phuong thuc contructor, getter, setter, display():void 
     * Nhap thong tin cua 1 sinh vien va hien thi
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten:");
        String ten = scanner.nextLine();
        System.out.print("Nhap tuoi:");
        String tuoiStr = scanner.nextLine();
        int tuoi = Integer.valueOf(tuoiStr); // valueOf hoac parseInt
//        int tuoiHai = Integer.parseInt(tuoiStr);
//        scanner.nextLine();
        System.out.print("Nhap mssv:");
        String mssv = scanner.nextLine();
        System.out.print("Nhap diem:");
        double diem = Double.valueOf(scanner.nextLine());
        /**
         * C1: Them scanner.nextLine()
         * C2: Quy tat ca ve String( scanner.nextLine()) roi ep kieu
         */
        // C1: Gan gia tri cho thuoc tinh cua 1 doi tuong
//        SinhVien sinhVien = new SinhVien();
//        sinhVien.setDiem(diem);
//        sinhVien.setTen(ten);
//        sinhVien.setMssv(mssv);
//        sinhVien.setTuoi(tuoi);
          SinhVien sinhVien = new SinhVien(mssv, diem, ten, tuoi);
          sinhVien.display();
    }
}
