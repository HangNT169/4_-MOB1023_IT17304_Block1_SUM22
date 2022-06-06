/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_Thread;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hangnt
 */
public class Bai1_HienThiDongHo implements Runnable {

    @Override
    public void run() {
        // code
        while (true) {
            try {
                // Show dong ho h:m:s
                Calendar cal = Calendar.getInstance();// lay ra moi thong tin lien qua toi gio cua he thong
                int h = cal.get(Calendar.HOUR);// lay ra gio
                int m = cal.get(Calendar.MINUTE); // lay ra phut
                int s = cal.get(Calendar.SECOND); // lay ra giay
                System.out.println(h + ":" + m + ":" + s);
                Thread.sleep(1000); // ngoai le ngat
            } catch (InterruptedException ex) {
                Logger.getLogger(Bai1_HienThiDongHo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        new Bai1_HienThiDongHo().run();
    }
}
