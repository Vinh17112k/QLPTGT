package Vehicle;
import java.time.YearMonth;
public class XeMay extends PTGT implements TinhGia{
	private int congSuat;
	public XeMay()
	{
		
	}
	public XeMay(String soKhung, int namSX, int gia, String Color, int congSuat)
	{
		super(soKhung, namSX, gia, Color);
		this.congSuat=congSuat;
	}
	public void setCongSuat(int congSuat)
	{
		this.congSuat=congSuat;
	}
	public int getCongSuat()
	{
		return congSuat;
	}
	public String toString()
	{
		return getSoKhung()+"\t"+getNamSX()+"\t"+getGiaTien()+"\t"+getColor()+"\t"+getCongSuat();
	}
	@Override
	public double getGia()
	{
		int Now=YearMonth.now().getYear();
		if(getNamSX()==Now ) return getGiaTien();
		else return getGiaTien()*0.95;
	}
}
