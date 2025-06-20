package baitap;

public class MainBai5 {
	public static void main(String[] args) {
		DieuHoa dieuHoa = new DieuHoa();
		MaySay maySay = new MaySay();
		
		dieuHoa.nhap();
		dieuHoa.xuat();
		dieuHoa.khuMui();
		dieuHoa.locKhongKhi();
		System.out.println("");
		maySay.nhap();
		maySay.xuat();
		maySay.lamKhoNhanhQuanAo();
		maySay.sayToc();
	}
}