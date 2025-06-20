package baitap;

public class TroChoi {
	private String tenTroChoi;
	private int soLuotChoi;
	private boolean dangChoi;
	
	public TroChoi() {
		tenTroChoi = "Lien minh";
		soLuotChoi = 0;
		dangChoi = false;
	}
	
	public String getTenTroChoi() {
		return tenTroChoi;
	}

	public void setTenTroChoi(String tenTroChoi) {
		this.tenTroChoi = tenTroChoi;
	}

	public int getSoLuotChoi() {
		return soLuotChoi;
	}

	public void setSoLuotChoi(int soLuotChoi) {
		this.soLuotChoi = soLuotChoi;
	}
	// boolean ban đầu khi khởi tạo là false
	void batdau() {
		if (!dangChoi) {
            dangChoi = true;
            soLuotChoi++;
            System.out.println("Trò chơi: " + tenTroChoi + " bắt đầu. Đây là lượt chơi thứ " + soLuotChoi + ".");
        } else {
            System.out.println("Trò chơi: " + tenTroChoi + " đang chơi");
        }
	}
	
	void ketthuc() {
		if (dangChoi) {
            dangChoi = false;
            System.out.println("Trò chơi: " + tenTroChoi + " kết thúc ");
        } else {
            System.out.println("Trò chơi: " + tenTroChoi + " chưa bắt đầu ");
        }
	}
	
	public void thongTin() {
        String trangThai = dangChoi ? "đang chơi" : "không hoạt động";
        System.out.println("Tên trò chơi: " + tenTroChoi);
        System.out.println("Số lượt chơi: " + soLuotChoi);
        System.out.println("Trạng thái: " + trangThai);
        System.out.println("");
    }
}
