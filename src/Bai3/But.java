package Bai3;

public class But {
    private int soLuong;
    private double giaTien;

    public But() {
    }

    public But(int soLuong, double giaTien) {
        this.soLuong = soLuong;
        this.giaTien = giaTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "But{" +
                "soLuong=" + soLuong +
                ", giaTien=" + giaTien +
                '}';
    }
}
