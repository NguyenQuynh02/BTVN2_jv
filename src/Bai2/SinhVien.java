package Bai2;

public class SinhVien {

    private int diem;
    private String name;

    public SinhVien(){

    }


    public SinhVien(int diem, String name) {
        this.diem = diem;
        this.name = name;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "diem=" + diem +
                ", name='" + name + '\'' +
                '}';
    }
}
