package nhaDat;
import java.util.ArrayList;

public class QuanLyGiaoDich {
    private ArrayList<giaodich> danhSachGiaoDich;

    public QuanLyGiaoDich() {
        danhSachGiaoDich = new ArrayList<>();
    }

    public void themGiaoDich(giaodich giaoDich) {
        danhSachGiaoDich.add(giaoDich);
    }

    public void xuatDanhSachGiaoDich() {
        for (giaodich giaoDich : danhSachGiaoDich) {
            System.out.println(giaoDich);
        }
    }

    public double tinhTrungBinhThanhTienGiaoDichDat() {
        double tongThanhTien = 0;
        int soGiaoDichDat = 0;
        for (giaodich giaodich : danhSachGiaoDich) {
            if (giaodich instanceof giaodichdat) {
                tongThanhTien += ((giaodichdat) giaodich).Thanhtien();
                soGiaoDichDat++;
            }
        }

        return tongThanhTien / soGiaoDichDat;
    }

    public void xuatDanhSachGiaoDichThang9Nam2013() {
        for (giaodich giaoDich : danhSachGiaoDich) {
            if (giaoDich.ngayGD == 9 && giaoDich.ngayGD == 2013) {
                System.out.println(giaoDich);
            }
        }
    }

}