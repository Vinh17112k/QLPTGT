package quanly;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import Vehicle.Oto;
import Vehicle.XeMay;
import Vehicle.PTGT;
import java.util.Comparator;
public class QLPTGT implements ChucNang{
	private List<PTGT> list;
	private Scanner in;
	public QLPTGT()
	{
		list=new ArrayList<>();
		in=new Scanner(System.in);
		list.add(new Oto("REW3482856",2012,200000,"Do",30));
		list.add(new Oto("YTK2834756",2020,423500,"Hong",20));
		list.add(new Oto("REW3482856",2016,600000,"Cam",50));
		list.add(new Oto("REW3482856",2018,500000,"Nau",40));
		list.add(new Oto("REW3482856",2014,300000,"Xanh",45));
		list.add(new XeMay("DRE2983433",2015,234256,"Do",2343));
		list.add(new XeMay("DGE2823433",2016,423413,"Do",8744));
	}
	public PTGT nhap()
	{
		String soKhung,Color;
		int namSX, gia;
		while(true)
		{
			System.out.print("so khung: ");
			soKhung=in.nextLine();
			if(soKhung.matches("^[A-Z]{3}\\d{7}"))
				break;
			else
				System.out.println("nhap lai");
		}
		System.out.print("nam san xuat: ");
		namSX=Integer.parseInt(in.nextLine());
		System.out.print("gia: ");
		gia=Integer.parseInt(in.nextLine());
		System.out.print("Color: ");
		Color=in.nextLine();
		return new PTGT(soKhung, namSX, gia, Color);
	}
	@Override
	public void nhapOto()
	{
		PTGT p=nhap();
		int sits;
		System.out.print("so ghe: ");
		sits=Integer.parseInt(in.nextLine());
		Oto c=new Oto(p.getSoKhung(),p.getNamSX(),p.getGiaTien(),p.getColor(),sits);
		list.add(c);
	}
	@Override
	public void nhapXeMay()
	{
		PTGT p=nhap();
		int congSuat;
		System.out.print("cong suat: ");
		congSuat=Integer.parseInt(in.nextLine());
		XeMay xemay=new XeMay(p.getSoKhung(),p.getNamSX(),p.getGiaTien(),p.getColor(),congSuat);
		list.add(xemay);
	}
	@Override
	public void vietDS()
	{
		System.out.println("So Khung\tnamSX\tgia\tColor'\sits");
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i) instanceof Oto)
				System.out.println(list.get(i));
		}
		System.out.println("So Khung\tnamSX\tgia\tColor'\tcong suat");
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i) instanceof XeMay)
				System.out.println(list.get(i));
		}
	}
	private int getVTsoKhung(String soKhung)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getSoKhung().equalsIgnoreCase(soKhung))
				return i;
		}
		return -1;
	}
	@Override
	public void sua(String soKhung)
	{
		int VT=getVTsoKhung(soKhung);
		if(VT==-1) System.out.println("khong tim thay");
		else {
			XeMay xemay=(XeMay) list.get(VT);
			System.out.println("NamSX: ");
			int namSX=Integer.parseInt(in.nextLine());
			xemay.setNamSX(namSX);
			System.out.println("gia: ");
			int gia=Integer.parseInt(in.nextLine());
			xemay.setGiaTien(gia);
			System.out.println("Color: ");
			String Color=in.nextLine();
			xemay.setColor(Color);
			System.out.println("cong suat: ");
			int congSuat=Integer.parseInt(in.nextLine());
			xemay.setCongSuat(congSuat);
			System.out.println("sua thanh cong");
		}
	}
	public void sxTheoNam()
	{
		Collections.sort(list,new Comparator<PTGT>(){
			@Override
			public int compare(PTGT p1, PTGT p2)
			{
				return p1.getNamSX()-p2.getNamSX();
			}
		});
	}
	@Override
	public void maxPT()
	{
		int maxPT=list.get(0).getGiaTien();
		int vTMax=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getGiaTien()>maxPT)
			{
				maxPT=list.get(i).getGiaTien();
				vTMax=i;
			}
		}
		System.out.println(list.get(vTMax));
	}
}
