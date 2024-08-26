package GaHamTaoDo;
import java.util.ArrayList;
import java.util.List;

public class MonAn {
    public static final int FLAG_CARB = 1;
    public static final int FLAG_FAT = 2;
    public static final int FLAG_FAT_BH  = 3;
    public static final int FLAG_PROTEIN = 4;
    public static final int FLAG_CALO = 5;
    private List<NguyenLieu> arr;

    public MonAn(){
        this.arr = new ArrayList<>();
    }

    public void nhap(){
        System.out.println("Mời bạn nhập gà: ");
        NguyenLieu ga = new Ga();
        ga.nhap();
        this.arr.add(ga);

        System.out.println("Mời bạn nhập hạt sen: ");
        NguyenLieu hatsen = new HatSen();
        hatsen.nhap();
        this.arr.add(hatsen);

        System.out.println("Mời bạn nhập cà rốt: ");
        NguyenLieu carot = new CaRot();
        carot.nhap();
        this.arr.add(carot);

        System.out.println("Mời bạn nhập táo đỏ: ");
        NguyenLieu taodo = new TaoDo();
        taodo.nhap();
        this.arr.add(taodo);

        System.out.println("Mời bạn nhập nấm đông cô: ");
        NguyenLieu nam = new NamDongCo();
        nam.nhap();
        this.arr.add(nam);
    }

    public float tinhNangLuong2(int flag){
        return (float) this.arr.stream()
                .mapToDouble(a ->{
                    if(flag==FLAG_CARB){
                        return a.getKhoiLuong()/100.0f*a.getCarb();
                    }
                    else if (flag==FLAG_FAT){
                        return a.getKhoiLuong()/100.0f*a.getFat();
                    }
                    else if (flag==FLAG_FAT_BH){
                        return a.getKhoiLuong()/100.0f*a.getFatBH();
                    }
                    else if (flag==FLAG_PROTEIN){
                        return a.getKhoiLuong()/100.0f*a.getProtein();
                    }
                    else if (flag==FLAG_CALO){
                        return a.getKhoiLuong()/100.0f*a.getCalo();
                    }
                    throw new IllegalArgumentException("Invalid flag value");
                })
                .sum();
    }

    public float tinhNangLuong(int flag){
        float sum=0;
        for (NguyenLieu a:this.arr){
            if (flag==FLAG_CARB){
                sum+=a.getKhoiLuong()/100.0f*a.getCarb();
            }
            else if (flag==FLAG_FAT){
                sum+=a.getKhoiLuong()/100.0f*a.getFat();
            }
            else if (flag==FLAG_FAT_BH){
                sum+=a.getKhoiLuong()/100.0f*a.getFatBH();
            }
            else if (flag==FLAG_PROTEIN){
                sum+=a.getKhoiLuong()/100.0f*a.getProtein();
            }
            else if (flag==FLAG_CALO){
                sum+=a.getKhoiLuong()/100.0f*a.getCalo();
            }
        }
        return sum*0.8f;
    }

    public void cau2(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Mời bạn nhập chỉ số carb cần thiết cho 1 bữa ăn");
        int carb = scanner.nextInt();
        float nangLuong = tinhNangLuong(FLAG_CARB);
        if (carb>nangLuong){
            System.out.printf("Cơ thể em cần bổ sung thêm %f carb nữa nha", carb - nangLuong);
        }

        System.out.println("Mời bạn nhập chỉ số fat cần thiết cho 1 bữa ăn ");
        int fat = scanner.nextInt();
        nangLuong=tinhNangLuong(FLAG_FAT);
        if(fat>nangLuong){
            System.out.printf("Cơ thể em cần bổ sung thêm %f fat nữa nha", fat - nangLuong);
        }

        System.out.println("Mời bạn nhập chỉ số fatbh cần thiết cho 1 bữa ăn ");
        int fatbh = scanner.nextInt();
        nangLuong=tinhNangLuong(FLAG_FAT_BH);
        if(fatbh>nangLuong){
            System.out.printf("Cơ thể em cần bổ sung thêm %f fatbh nữa nha", fatbh - nangLuong);
        }

        System.out.println("Mời bạn nhập chỉ số protein cần thiết cho 1 bữa ăn ");
        int protein = scanner.nextInt();
        nangLuong=tinhNangLuong(FLAG_PROTEIN);
        if(protein>nangLuong){
            System.out.printf("Cơ thể em cần bổ sung thêm %f protein nữa nha", protein - nangLuong);
        }

        System.out.println("Mời bạn nhập chỉ số calo cần thiết cho 1 bữa ăn ");
        int calo = scanner.nextInt();
        nangLuong=tinhNangLuong(FLAG_CALO);
        if(calo>nangLuong){
            System.out.printf("Cơ thể em cần bổ sung thêm %f calo nữa nha", calo - nangLuong);
        }
    }

    public float cau3(){
        if (tinhNangLuong(FLAG_CALO)-600>0){
            return 30*(tinhNangLuong(FLAG_CALO)-600)/147.5f;
        }
        else {
            return 0;
        }
    }
}
