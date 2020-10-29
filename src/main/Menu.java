package main;
import java.util.Scanner;
import quanly.QLPTGT;
public class Menu {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		QLPTGT p=new QLPTGT();
		while(true)
		{
			System.out.println("0:Thoat.");
			System.out.println("1:nhap o to.");
			System.out.println("2: nhap xe may.");
			System.out.println("3: viet danh sach.");
			System.out.println("4: sua phuong tien.");
			System.out.println("5: sap xep theo so khung");
			System.out.println("6: tim phuong tin co gia dat nhat.");
			int choise = Integer.parseInt(in.nextLine());
			switch(choise)
			{
			case 0:
				System.out.println("Thoat.");
				System.exit(0);
				break;
			case 1:
				System.out.println("nhap o to");
				p.nhapOto();
				break;
			case 2:
				System.out.println("nhap xe may");
				p.nhapXeMay();
				break;
			case 3:
				System.out.println("viet danh sach");
				p.vietDS();
				break;
			case 4:
				System.out.println("sua phuong tien");
				String soKhung=in.nextLine();
				p.sua(soKhung);
				break;
			case 5:
				System.out.println("sap xep theo so nam");
				p.sxTheoNam();
				break;
			case 6:
				System.out.println("phuong tien dat do nhat");
				p.maxPT();
				break;
			}
		}
	}
}
