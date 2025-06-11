package baitap;

public class Main {
	public static void main(String[] args) {
		ListSinhVien danhSachSinhVien = new ListSinhVien();
		danhSachSinhVien.nhapDanhSach(); // ham nhap vao thong tin sinh vien
		System.out.println(" ");
		//danhSachSinhVien.xuatDanhSach();
		
		//In ra sinh vien co dtb lon nhat
		//danhSachSinhVien.timDiemTrungBinhLonNhat();
		
		//In ra tat ca sinh vien Yeu
		//danhSachSinhVien.timVaInSinhVienYeu();
		
		//danhSachSinhVien.timVaInSinhVienTheoTen(); //tim va in ra sinh vien theo ten
		//danhSachSinhVien.timVaInSinhVienTheoMa(); // tim va in ra sinh vien theo ma so
		danhSachSinhVien.xoaSinhVienTheoMa(); // xoa sinh vien theo ma so 
	}
}
