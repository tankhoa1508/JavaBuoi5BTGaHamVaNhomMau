package GaHamTaoDo;

public abstract class NguyenLieu {
    protected int carb;
    protected int fat;
    protected int fatBH;
    protected int protein;
    protected int calo;
    protected int khoiLuong;

    public NguyenLieu(){

    }

    public void nhap(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Mời bạn nhập khối lượng");
        this.khoiLuong = scanner.nextInt();
    }

    public int getCarb() {
        return carb;
    }

    public void setCarb(int carb) {
        this.carb = carb;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getFatBH() {
        return fatBH;
    }

    public void setFatBH(int fatBH) {
        this.fatBH = fatBH;
    }

    public int getCalo() {
        return calo;
    }

    public void setCalo(int calo) {
        this.calo = calo;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(int khoiLuong) {
        this.khoiLuong = khoiLuong;
    }
}
