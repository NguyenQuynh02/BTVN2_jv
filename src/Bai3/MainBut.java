package Bai3;

import javax.swing.*;
import java.util.Scanner;

public class MainBut {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Khai báo 2 đối tượng bút bi(40, 3500) và bút chì(35, 2500)
       But butBi = new But(40, 3500);
       But butChi = new But(35, 2500);
        System.out.println(butBi);
        System.out.println(butChi);

        System.out.print("But chi khach muon mua : ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("But bi khach muon mua: ");
        int m = Integer.parseInt(sc.nextLine());
        double tongTien = n* butBi.getGiaTien() + m* butChi.getGiaTien();
        System.out.print("Tong tien: " + tongTien +"\n");
        int a1 = (butBi.getSoLuong()-n);
        int a2 = (butChi.getSoLuong()-m);
        System.out.print("So but bi con lai: " + a1+"\n");
        System.out.print("So but chi con lai: " + a2);

        int a = a1 + a2;
        if ( a < 30)
            System.out.print("Nhap them so but bi la: " + ( 35-a1) + "\n");
            System.out.print("Nhap them so but chi la: " + ( 35-a2));





    }
}
