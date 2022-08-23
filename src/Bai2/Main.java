package Bai2;

import java.util.Scanner;

import static java.lang.Math.min;
import static sun.swing.MenuItemLayoutHelper.max;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap diem sv1: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap diem sv2: ");
        int m = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap ten sv1: ");
        String tenSV1 = sc.nextLine();
        System.out.print("Nhap ten sv2 : ");
        String tenSV2 =  sc.nextLine();

        SinhVien sv1 = new SinhVien(n,tenSV1);
        SinhVien sv2 = new SinhVien(m, tenSV2);


        System.out.println("SINH VIEN 1: " + sv1);
        System.out.println("SINH VIEN 2 : " + sv2);

        if (sv1.getDiem() > sv2.getDiem())
            System.out.print("Sinh vien diem cao hon la : " + sv1.getName());

        else
            System.out.print("Sinh vien diem cao hon la : " + sv2.getName());

//        double k = min(sv1.getDiem(), sv2.getDiem());
//        if (max(sv1.getDiem(), sv2.getDiem())
//           String tenSV3 =

    }
}
