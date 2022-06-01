/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_BaiMauCURD_DocGhiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class DocGhiFile {

    public String ghiFile(String path, List<SinhVien> lists) {
        try {
            // Check ton tai file 
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }

            // Ghi file
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (SinhVien sv : lists) {
                oos.writeObject(sv);
            }

            // close
            oos.close();
            fos.close();
            return "Ghi file thanh cong";
        } catch (Exception e) {
            return "Ghi file that bai";
        }
    }

    public String docFile(String path, List<SinhVien> lists) {
        try {
            // Check ton tai file 
            File file = new File(path);
            if (!file.exists()) {
                return "File khong ton tai";
            }

            // Ghi file
            FileInputStream fis = new FileInputStream(file);// mo file 
            ObjectInputStream ois = new ObjectInputStream(fis);// doc data trong file 

            SinhVien sv = new SinhVien();

            // Kiem tra xem file co dong k => ghi vao list
            while (fis.available() > 0) {
                sv = (SinhVien) ois.readObject();
                lists.add(sv);
            }

            // close
            ois.close();
            fis.close();
            return "Doc file thanh cong";
        } catch (Exception e) {
            return "Doc file that bai";
        }
    }
}
