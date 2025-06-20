package baitap;

import java.util.Scanner;

public class ThietBiDien {
	protected double congSuat;
	protected String chucNang;
	protected int namSanXuat;
	protected String thuongHieu;
	
	public ThietBiDien() {
		congSuat = 0.0;
		chucNang = "";
		namSanXuat = 0;
		thuongHieu = "";
	}
	
	public ThietBiDien(double congSuat, String chucNang, int namSanXuat, String thuongHieu) {
		this.congSuat = congSuat;
		this.chucNang = chucNang;
		this.namSanXuat = namSanXuat;
		this.thuongHieu = thuongHieu;
	}

	public double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}

	public String getChucNang() {
		return chucNang;
	}

	public void setChucNang(String chucNang) {
		this.chucNang = chucNang;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public String getThuongHieu() {
		return thuongHieu;
	}

	public void setThuongHieu(String thuongHieu) {
		this.thuongHieu = thuongHieu;
	}
	
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap cong suat may: ");
		congSuat = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Nhap chuc nang may: ");
		chucNang = scanner.nextLine();
		
		System.out.println("Nhap nam san xuat: ");
		namSanXuat = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Nhap thuong hieu cua may: ");
		thuongHieu = scanner.nextLine();
	}
	
	void xuat() {
		System.out.printf("| %6.2f | %10s | %6s | %15s |%n",
                congSuat, chucNang, namSanXuat, thuongHieu);
	}
}
