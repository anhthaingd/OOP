public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double LUONG_MAX;

    public NhanVien () {

    }
    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.LUONG_MAX = LUONG_MAX;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLUONG_MAX() {
        return LUONG_MAX;
    }

    public void setLUONG_MAX(double LUONG_MAX) {
        this.LUONG_MAX = LUONG_MAX;
    }

    public double tinhLuong() {
        return luongCoBan*heSoLuong;
    }

    public boolean tangLuong(double a) {
        if (tinhLuong()*a>LUONG_MAX) return false;
        return true;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "tenNhanVien='" + tenNhanVien + '\'' +
                ", luongCoBan=" + luongCoBan +
                ", heSoLuong=" + heSoLuong +
                ", LUONG_MAX=" + LUONG_MAX +
                '}';
    }
}
