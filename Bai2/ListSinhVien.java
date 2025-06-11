package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSinhVien {
	List<SinhVien> danhSachSinhVien = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public void nhapDanhSach() {
		System.out.println("Nhap so luong sinh vien: ");
		int n = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i<n;i++) {
			SinhVien sinhVien = new SinhVien();
			sinhVien.nhapthongtin();
			sinhVien.tinhTrungbinh();
			sinhVien.xepLoai();
			danhSachSinhVien.add(sinhVien);
		}
	}
	
	public void xuatDanhSach() {
		for (SinhVien sv : danhSachSinhVien) {
			sv.xuatThongTin();
		}
	}
	
	public void timDiemTrungBinhLonNhat() {
		double temp = danhSachSinhVien.get(0).getDiemTrungBinh();
		// Lưu vị trí học sinh có dtb cao nhất
		ArrayList<Integer> vitri = new ArrayList<Integer>();
		for (int i = 0 ; i< danhSachSinhVien.size();i++) {
			if(danhSachSinhVien.get(i).getDiemTrungBinh() >= temp) {
				temp = danhSachSinhVien.get(i).getDiemTrungBinh();
				vitri.add(i);
			}
		}
		//in ra một hoặc tất cả sinh viên có ĐTB cao nhất nếu có
		for(int item : vitri) {
			System.out.println("Sinh vien co dtb cao nhat ");
			danhSachSinhVien.get(item).xuatThongTin();
		}
	}
	
	public void timVaInSinhVienYeu() {
		ArrayList<Integer> vitri1 = new ArrayList<Integer>(); //Luu vi tri sinh vien xep loai yeu
		for (int i = 0 ; i< danhSachSinhVien.size();i++) {
			if(danhSachSinhVien.get(i).getXepLoai() == "Yeu" ) {
				vitri1.add(i);
			}
		}
		System.out.println("Cac sinh vien yeu: ");
		//In ra tat ca sinh vien yeu
		for(int item1 : vitri1) {
			
			danhSachSinhVien.get(item1).xuatThongTin();
		}
	}
	
	public void timVaInSinhVienTheoTen() {
		System.out.println("Nhap vao ten sinh vien can tim: ");
		String ten1 = scanner.nextLine();
		int flag = 0; // kiem tra co ten sinh vien trong danh sach hay khong
		for(SinhVien sv1 : danhSachSinhVien) {
			if(sv1.getTen().equals(ten1)) {
				sv1.xuatThongTin();
				flag = 0;
			}else {
				flag =1;
				continue;
			}
		}
		if(flag == 1) {
			System.out.println("Khong tim thay sinh vien");
		}
	}
	
	public void timVaInSinhVienTheoMa() {
		System.out.println("Nhap vao ma so sinh vien can tim: ");
		String maso1 = scanner.nextLine();
		int flag = 0; // kiem tra co ma so sinh vien trong danh sach hay khong
		for(SinhVien sv2 : danhSachSinhVien) {
			if(sv2.getMaSV().equals(maso1)) {
				sv2.xuatThongTin();
				break;
			}else {
				flag =1;
				continue;
			}
		}
		if(flag == 1) {
			System.out.println("Khong tim thay sinh vien");
		}
	}
	
	public void xoaSinhVienTheoMa() {
		int flag = 0; // kiem tra co ma so sinh vien trong danh sach hay khong
		System.out.println("Nhap vao ma so sinh vien can tim: ");
		String maso1 = scanner.nextLine();
		for(SinhVien sv3 : danhSachSinhVien) {
			if(sv3.getMaSV().equals(maso1)) {
				danhSachSinhVien.remove(sv3);
				break;
			}else {
				flag =1;
				continue;
			}
		}
		if(flag == 1) {
			System.out.println("Khong tim thay sinh vien");
		}
	}
}
