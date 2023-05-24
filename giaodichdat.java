package nhaDat;
 
import java.util.Scanner; 
public class giaodichdat extends giaodich { 
	private String loaiDat; 
public giaodichdat() { 
		super(); 
} 
	public giaodichdat( String loaiDat) { 
		super(); 
		this.loaiDat = loaiDat; } 
	public void setloaiDat(String loaiDat) { 
		this.loaiDat = loaiDat; } 
	public String getloaiDat() { 
		return loaiDat = loaiDat; 
} 
	public double Thanhtien() { 
		if(loaiDat.equals("A")) { 
			return getdienTich()*getdonGia()*1.5; } 
		else { 
			return getdienTich()*getdonGia(); } 
		} 
	@Override public String toString() { 
		return super.toString() + ", Loại đất: " + this.loaiDat +", Thành tiền: " +this.Thanhtien();
	} 
	public void Nhap() { 
		super.Nhap(); 
		System.out.println("Nhập vào loại đất: "); 
		loaiDat = scanner.nextLine(); }
	public void Xuat() { 
		System.out.println("Loại đất:" + loaiDat); } 
	}