package baitap;

public class SinhVien {
	private String ten;
	private String maSV;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
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
	
	void xuatThongTin() {
		System.out.println("Ten: "+ ten);
		System.out.println("Ma Sinh vien: "+ maSV);
		System.out.println("Diem Toan: "+ diemToan);
		System.out.println("Diem Ly: "+ diemLy);
		System.out.println("Diem Hoa: "+  diemHoa);
	}
	
	double tinhDiemTB() {
		double temp = (diemToan + diemLy +diemHoa)/3;
		return temp;
	}
}
