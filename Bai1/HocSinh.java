package baitap;

import java.util.Scanner;

public class HocSinh {
	private String ten;
	private int tuoi;
	private double diemSo;
	
	public HocSinh() {
		ten = "";
		tuoi = 0;
		diemSo = 0.0;
	}
	
	public HocSinh(String ten, int tuoi, double diemSo) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.diemSo = diemSo;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public double getDiemSo() {
		return diemSo;
	}

	public void setDiemSo(double diemSo) {
		this.diemSo = diemSo;
	}
	
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ten hoc sinh: ");
		ten = scanner.nextLine();
		
		System.out.println("Nhap vao tuoi: ");
		tuoi = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Nhap vao diem so hoc sinh: ");
		diemSo = Double.parseDouble(scanner.nextLine());
	}
	double tinhTrungBinh()
	{
		return diemSo/1;
	}
	void xuat() {
		System.out.printf("| %-15s | %4s | %6.2f | %6.2f | %n",
                ten, tuoi, diemSo,tinhTrungBinh());
	}
}
