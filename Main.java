package nhaDat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        QuanLyGiaoDich qlgd = new QuanLyGiaoDich();

        do {
           
            System.out.println("1. Thêm giao dịch đất");
            System.out.println("2. Thêm giao dịch nhà");
            System.out.println("3. Xuất danh sách giao dịch");
            System.out.println("4. Tính trung bình thành tiền của giao dịch đất");
            System.out.println("5. Xuất ra các giao dịch của tháng 9 năm 2013");
            System.out.println("0. Thoát chương trình");
        

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
 
            switch (choice) {
                case 1:
                    qlgd.themGiaoDich(null);
                    break;
                case 2:
                    qlgd.themGiaoDich(null);
                    break;
                case 3:
                    qlgd.xuatDanhSachGiaoDich();
                    break;
                case 4:
                    qlgd.tinhTrungBinhThanhTienGiaoDichDat();
                    break;
                case 5:
                    qlgd.xuatDanhSachGiaoDichThang9Nam2013();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại!");
            }
        } while (choice != 0);
    }
}
