package baiTapNhomMau;

import GaHamTaoDo.MonAn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachNhomMau {
    private List<NhomMau> arr;
    public DanhSachNhomMau(){
        this.arr = new ArrayList<>();
    }

    public void nhap(){
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng");
        int n = scanner.nextInt();
        for(int i =1; i<n+1;i++){
            System.out.println("Nhập thông tin người thứ "+i);
            System.out.println("1. Nhóm O");
            System.out.println("2. Nhóm A");
            System.out.println("3. Nhóm B");
            System.out.println("4. Nhóm AB");
            System.out.println("Mời bạn lựa chọn nhóm máu");
            int flag = scanner.nextInt();
            if (flag==1){
                NhomMau x = new O();
                x.nhap();
                this.arr.add(x);
            } else if (flag==2) {
                NhomMau x= new A();
                x.nhap();
                this.arr.add(x);
            } else if (flag==3) {
                NhomMau x= new B();
                x.nhap();
                this.arr.add(x);
                
            } else if (flag==4) {
                NhomMau x= new AB();
                x.nhap();
                this.arr.add(x);

            }
        }
    }

    public void xuat(){
        for(NhomMau x:this.arr){
            x.xuat();
        }
    }

    public void cau2(){
        NhomMau me= new A();
        NhomMau cha = new B();
        NhomMau con = new A();

        if (me.kiemTraDiTruyen(cha,con)){
            System.out.println("Gia đình phù hợp quy luật di truyển");
        }
        else {
            System.out.println("Có gì đó sai sai");
        }
    }

    public void cau3(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Mời bạn chọn 1 người để nhận máu");
        int index = scanner.nextInt();
        for (var i=0; i < arr.size() ; i++){
            if (i!=index){
                if (this.arr.get(i).kiemTraChoNhan(this.arr.get(index))) {
                    System.out.printf("Bạn thứ %d có thể cho máu bạn thứ %d nhé ", i, index);
                }
            }
        }
    }

    public static void main(String[] args) {
        DanhSachNhomMau a=new DanhSachNhomMau();
        a.nhap();
        a.xuat();
        a.cau2();
        a.cau3();
    }
}
