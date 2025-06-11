package baitap;

import java.util.Scanner;

public class Function {
	
	public static void nhapThongTin(SinhVien a) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ten Sinh Vien: ");
		String ten = scanner.nextLine();
		a.setTen(ten);
		
		System.out.println("Nhap vao ma so Sinh Vien: ");
		String maSV = scanner.nextLine();
		a.setMaSV(maSV);
		
		System.out.println("Nhap vao diem toan: ");
		double diemToan = scanner.nextDouble();
		a.setDiemToan(diemToan);
		
		System.out.println("Nhap vao diem ly: ");
		double diemLy = scanner.nextDouble();
		a.setDiemLy(diemLy);
		
		System.out.println("Nhap vao ten Sinh Vien");
		double diemHoa = scanner.nextDouble();
		a.setDiemHoa(diemHoa);
		
		scanner.close();
	}
	
	public static void xepLoaiSinhVien(double dtb) {
		if(dtb >= 9) {
			System.out.println("Sinh Vien Xuat Sac");
		}else if(dtb>=8) {
			System.out.println("Sinh Vien Gioi");
		}else if(dtb>=7) {
			System.out.println("Sinh Vien Kha");
		}else if(dtb>=6) {
			System.out.println("Sinh Vien TB Kha");
		}else if(dtb>=5) {
			System.out.println("Sinh Vien Trung Binh");
		}else {
			System.out.println("Sinh Vien Yeu");
		}
	}
}
