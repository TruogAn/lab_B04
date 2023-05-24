package nhaDat;

import java.util.Scanner;
public class giaodichnha extends giaodich {
	private String loaiNha;
	private String diaChi;


public giaodichnha() {
	super();
}
public giaodichnha( String loaiNha, String diaChi) {
	super();
	this.diaChi = diaChi;
	this.loaiNha = loaiNha;
}
public void setloaiNha(String loaiNha) {
	this.loaiNha = loaiNha;
}
public String getloaiNha() {
	return loaiNha;
}
public void setdiaChi(String diaChi) {
	this.diaChi = diaChi;
}
public String getdiaChi() {
	return diaChi;
}
public double Thanhtien() {
	if(loaiNha.equals("Cao cap")) {
		return getdienTich()*getdonGia();
	}
	else {
		return getdienTich()*getdonGia()*0.9;
	}
}
@Override
public String toString() {
	return super.toString() + ", Loại nhà: " + this.loaiNha +", địa chỉ: " +this.diaChi +", Thành tiền: " +this.Thanhtien();
}
public void Nhap() {
	super.Nhap();
	System.out.println("Nhập vào địa chỉ: ");
	diaChi = scanner.nextLine();
	System.out.println("Nhập vào loại nhà: ");
	loaiNha = scanner.nextLine();	
}
public void Xuat() {
	System.out.println("Loại nhà:"+ loaiNha);
	System.out.println("Địa chỉ:"+ diaChi);
	System.out.println("Thành tiền:"+ Thanhtien());
}
}
