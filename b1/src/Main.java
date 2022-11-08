import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten");
        String ten = sc.next();
        System.out.println("Nhap luong co ban");
        double luongCoBan = sc.nextDouble();
        System.out.println("Nhap he so luong");
        double heSoLuong = sc.nextDouble();
        System.out.println("Nhap luong max");
        double luongMax = sc.nextDouble();
        NhanVien nv = new NhanVien(ten,luongCoBan,heSoLuong,luongMax);
        double tinhLuong = nv.tinhLuong();
        double a=1.5;
        boolean isTangLuong = nv.tangLuong(a);
        System.out.format("Luong cua nhan vien %f\n",tinhLuong);
        System.out.printf("Co duoc tang luong hay khong: ");
        System.out.println(String.valueOf(isTangLuong));
        System.out.println(nv);
    }
}