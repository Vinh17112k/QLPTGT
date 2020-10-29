package Vehicle;

import java.time.YearMonth;

public class Oto extends PTGT implements TinhGia {
	private int sits;
	public Oto()
	{
		
	}
	public Oto(String soKhung, int namSX, int giaTien, String Color, int sits)
	{
		super(soKhung, namSX,giaTien, Color);
		this.sits=sits;
	}
	public int getSits() {
		return sits;
	}
	public void setSits(int sits) {
		this.sits = sits;
	}
	public String toString()
	{
		return getSoKhung()+"\t"+getNamSX()+"\t"+getGiaTien()+"\t"+getColor()+"\t"+sits;
	}
	@Override
	public double getGia()
	{
		int Now=YearMonth.now().getYear();
		if(getNamSX()==Now ) return getGiaTien();
		else return getGiaTien()*0.7;
	}
}
