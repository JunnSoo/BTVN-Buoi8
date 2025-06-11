package baitap;

public class Main {
	
	public static void main(String[] args) {
		SinhVien sinhVien = new SinhVien();
		Function.nhapThongTin(sinhVien);
		System.out.println("Diem Trung Binh: "+ sinhVien.tinhDiemTB());
		Function.xepLoaiSinhVien(sinhVien.tinhDiemTB());
	}
}
