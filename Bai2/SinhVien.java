package baitap;

import java.util.Scanner;

public class SinhVien {
	private String ten;
	private String maSV;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	private double diemTrungBinh;
	private String xepLoai;
	
	public SinhVien() {}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public double getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}
	public double getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}
	public double getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	public String getXepLoai() {
		return xepLoai;
	}
	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}
	
	void nhapthongtin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ten sinh vien: ");
		this.ten =  scanner.nextLine();
		
		System.out.println("Nhap vao ma so sinh vien: ");
		this.maSV =  scanner.nextLine();
		
		System.out.println("Nhap vao diem toan: ");
		this.diemToan =  Double.parseDouble(scanner.nextLine());
		
		System.out.println("Nhap vao diem ly: ");
		this.diemLy =  Double.parseDouble(scanner.nextLine());
		
		System.out.println("Nhap vao diem hoa: ");
		this.diemHoa =  Double.parseDouble(scanner.nextLine());
	}
	
	void xuatThongTin() {
		System.out.println("Ten: "+ ten);
		System.out.println("Ma Sinh vien: "+ maSV);
		System.out.println("Diem Toan: "+ diemToan);
		System.out.println("Diem Ly: "+ diemLy);
		System.out.println("Diem Hoa: "+  diemHoa);
		System.out.println("Diem Trung Binh: "+ diemTrungBinh);
		System.out.println("Sinh vien xep loai "+ xepLoai);
	}
	
	public double tinhTrungbinh() {
		diemTrungBinh =(diemToan + diemLy+ diemHoa)/3;
		return diemTrungBinh;
	}
	
	public String xepLoai() {
		if(diemTrungBinh >= 9) {
			return xepLoai = "Xuat Sac";
		}else if(diemTrungBinh>=8) {
			return xepLoai = "Gioi";
		}else if(diemTrungBinh>=7) {
			return xepLoai = "Kha";
		}else if(diemTrungBinh>=6) {
			return xepLoai = "TB Kha";
		}else if(diemTrungBinh>=5) {
			return xepLoai = "Trung Binh";
		}else {
			return xepLoai = "Yeu";
		}
	}
}
