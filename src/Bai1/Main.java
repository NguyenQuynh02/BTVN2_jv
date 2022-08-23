package Bai1;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    private static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {

        ToaDo DiemA =  new ToaDo(3,2);
        ToaDo DiemB = new ToaDo(1,4);
        ToaDo DiemC = new ToaDo(4,10);
        ToaDo DiemD = new ToaDo(5,2);

        System.out.println("A: " + DiemA);
        System.out.println("B: " + DiemB);
        System.out.println("C: " + DiemC);
        System.out.println("D: " + DiemD);

        double AB = Math.sqrt(Math.pow((DiemB.getA() - DiemA.getA()), 2) + Math.pow((DiemB.getB() - DiemA.getB()), 2));
        System.out.println("AB: " + AB);
        double BC = Math.sqrt(Math.pow((DiemC.getA() - DiemB.getA()), 2) + Math.pow((DiemC.getB() - DiemB.getB()), 2));
        System.out.println("BC: " + BC);
        double CD = Math.sqrt(Math.pow((DiemD.getA() - DiemC.getA()), 2) + Math.pow((DiemD.getB() - DiemC.getB()), 2));
        System.out.println("CD: " + CD);
        double DA = Math.sqrt(Math.pow((DiemA.getA() - DiemD.getA()), 2) + Math.pow((DiemA.getB() - DiemD.getB()), 2));
        System.out.println("DA: " + DA);
        double AC = Math.sqrt(Math.pow((DiemC.getA() - DiemA.getA()), 2) + Math.pow((DiemC.getB() - DiemA.getB()), 2));
        System.out.println("AC: " + AC);

        double P =  (AB + BC + AC)/2;
        double S = Math.sqrt(P*(P-AB)*(P-BC)*(P-AC));
        System.out.println("Dien tich tam giac ABC: " + S);


    }
}
