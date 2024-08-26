package baiTapNhomMau;

public class A extends NhomMau{
    public A(){
        this.loaiMau=_A;
    }
    @Override
    public boolean kiemTraDiTruyen(NhomMau cha, NhomMau con){
        if(cha.getLoaiMau()==_O || cha.getLoaiMau()==_A){
            if (con.getLoaiMau()==_A || con.getLoaiMau()==_O){
                return true;
            }
        } else if (cha.getLoaiMau()==_B) {
            return true;
        } else if (cha.getLoaiMau()==_AB) {
            if (con.getLoaiMau()!=_O){
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraNhomMau (NhomMau nhan) {
        if (nhan.getLoaiMau()==_A || nhan.getLoaiMau()==_AB){
            return true;
        }
        return false;
    }
}
