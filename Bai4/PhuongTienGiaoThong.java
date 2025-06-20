package baitap;

import java.util.Scanner;

public class PhuongTienGiaoThong {
	protected String hangSanXuat;
	protected String mauSac;
	protected int namSanXuat;
	
	public PhuongTienGiaoThong() {
		hangSanXuat = "";
		mauSac = "";
		namSanXuat = 0;
	}
	
	public PhuongTienGiaoThong(String hangSanXuat, String mauSac, int namSanXuat) {
		this.hangSanXuat = hangSanXuat;
		this.mauSac =  mauSac;
		this.namSanXuat = namSanXuat;
	}

	public String getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao hang san xuat: ");
		hangSanXuat = scanner.nextLine();
		
		System.out.println("Nhap vao mau sac: ");
		mauSac = scanner.nextLine();
		
		System.out.println("Nhap vao nam san xuat: ");
		namSanXuat = Integer.parseInt(scanner.nextLine());
	}
	
	void hienthi() {
		System.out.printf("| %10s | %4s | %4s | %n",
                hangSanXuat, mauSac, namSanXuat);
	}
}
