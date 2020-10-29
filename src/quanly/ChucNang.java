package quanly;

public interface ChucNang {
	//chuc nang 1: nhap Oto, kiem tra dieu kien
	public void nhapOto();
	//chuc nang 2: nhap xe may kiem tra dieu kien
	public void nhapXeMay();
	//chuc nang 3: viet DS oto xe may co them so luong
	public void vietDS();
	//chuc nang 4: sua thong tin phuong tin giao thong theo so khung
	public void sua(String soKhung);
	//chuc nang 5: sap xep phuong tien theo nam san xuat
	public void sxTheoNam();
	//chuc nang 6: in ra phuong tien dat nhat theo mau
	public void maxPT();
}
