/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_DocGhiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * 1. Tao class Teacher gom cac thuoc tinh: ten, tuoi,namSinh Va cac
     * contrutor, getter, setter. Ghi 5 doi tuong Teacher vao file. Xuat file ra
     */
    public static void main(String[] args) {
        try {
            new Main().docFileObjectInputStream();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Ghi vao file
    public void ghiFileObjectOutputStream() throws FileNotFoundException, IOException {
        // Check ton tai file 
        File file = new File("test.txt");
        if (!file.exists()) {
            try {
                // tao file
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Tao 5 doi tuong
        List<Teacher> lists = new ArrayList<>();
        lists.add(new Teacher("ten1", 10, "2010", "ha noi"));
        lists.add(new Teacher("ten12", 101, "2002", "ha noi"));
        lists.add(new Teacher("ten13", 102, "2102", "ha noi"));
        lists.add(new Teacher("ten14", 103, "2102", "ha noi"));
        lists.add(new Teacher("ten15", 104, "2012", "ha noi"));

        // Ghi file
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (Teacher teacher : lists) {
            oos.writeObject(teacher);
        }

        // close
        oos.close();
        fos.close();
    }

    // doc file 
    public void docFileObjectInputStream() throws FileNotFoundException, IOException, ClassNotFoundException {
        // Check ton tai file 
        File file = new File("test.txt");
        if (!file.exists()) {
            try {
                // tao file
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Ghi file
        FileInputStream fis = new FileInputStream(file);// mo file 
        ObjectInputStream ois = new ObjectInputStream(fis);// doc data trong file 
        
        Teacher teacherInput = new Teacher();
        List<Teacher>listInput = new ArrayList<>();
        
        // Kiem tra xem file co dong k => ghi vao list
        while(fis.available() >0){
            teacherInput = (Teacher)ois.readObject();
            listInput.add(teacherInput);
        }
        
        // in ra list vua ghi duoc
        for (Teacher teacher : listInput) {
            System.out.println(teacher.toString());
        }
        
        // close
        ois.close();
        fis.close();
    }
}
