package nhaDat;

import java.util.Scanner;
public class giaodich {
	private String maGD;
	int ngayGD;
	private double donGia;
	private float dienTich;
	Scanner scanner = new Scanner(System.in);
	
public giaodich() {
	super();
}

public giaodich(String maGD, int ngayGD, double donGia, String loaiDat, float dienTich) {
	super();
	this.ngayGD = ngayGD;
	this.maGD = maGD;
	this.dienTich = dienTich;
	this.donGia = donGia;
}

public void setmaGD (String maGD) {
	this.maGD = maGD;
}
public String getmaGD() {
	return maGD;
}
public void setngayGD( int ngayGD) {
	this.ngayGD = ngayGD;
}
public int getngayGD() {
	return ngayGD;
}
public void setdonGia( double donGia) {
	this.donGia = donGia;
}
public double getdonGia() {
	return donGia;
}

public void setdienTich(float dienTich) {
	this.dienTich = dienTich;
}
public float getdienTich() {
	return dienTich;
}
@Override
public String toString () {
	return "Mã giao dịch: " + this.maGD +", Ngày giao dịch: " + this.ngayGD +", Đơn giá: "+ this.donGia +", Diện tích: " +this.dienTich;
}
 public void Nhap() {
	 System.out.println("Nhập vào mã giao dịch: ");
	 maGD = scanner.nextLine();
	 System.out.println("Nhập vào ngày gia dịch: ");
	 ngayGD = scanner.nextInt();
	 System.out.println("Nhập vào diện tích: ");
	 dienTich = scanner.nextFloat();
	 System.out.println("Nhập vào đơn giá: ");
	 donGia = scanner.nextDouble();
}
public void Xuat() {
	System.out.println("Mã giao dịch:"+ maGD);
	System.out.println("Ngày giao dịch:"+ ngayGD);
	System.out.println("Đơn giá:"+ donGia);
	System.out.println("Diện tích:"+ dienTich);
}
}
