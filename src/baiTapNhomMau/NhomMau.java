package baiTapNhomMau;

public abstract class NhomMau {
    protected boolean rh;
    protected int loaiMau;

    public static final int _O = 1;
    public static final int _A = 2;
    public static final int _B = 3;
    public static final int _AB = 4;

    public NhomMau() {

    }

    public void nhap() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Mời bạn nhập RH");
        this.rh = scanner.nextBoolean();
    }

    public void xuat() {
//        System.out.println("######################");
        if (this.loaiMau == _O) {
            System.out.print("O");
        } else if (this.loaiMau == _A) {
            System.out.print("A");
        } else if (this.loaiMau == _B) {
            System.out.print("B");
        } else if (this.loaiMau == _AB) {
            System.out.print("AB");
        }

        if (rh == true) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        System.out.println("###################");

    }

    public abstract boolean kiemTraDiTruyen(NhomMau cha, NhomMau con);

    public abstract boolean kiemTraNhomMau(NhomMau nhan);

    public boolean kiemTraRh(NhomMau nhan){
        if (this.rh==true){
            if(nhan.rh==true){
                return true;
            }
        } else if (this.rh == false){
            return true;
        }
        return false;
    }

    public boolean kiemTraChoNhan (NhomMau nhan){
        boolean nhomMau = kiemTraNhomMau(nhan);
        boolean rh = this.kiemTraRh(nhan);
        if (nhomMau && rh) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isRh() {
        return rh;
    }

    public void setRh(boolean rh) {
        this.rh = rh;
    }

    public int getLoaiMau() {
        return loaiMau;
    }

    public void setLoaiMau(int loaiMau) {
        this.loaiMau = loaiMau;
    }
}

