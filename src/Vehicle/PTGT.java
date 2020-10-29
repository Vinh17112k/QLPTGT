package Vehicle;

public class PTGT implements Comparable{
	private String soKhung;
	private int namSX,giaTien;
	private String Color;
	public PTGT()
	{
		
	}
	public PTGT(String soKhung, int namSX, int giaTien, String Color)
	{
		this.soKhung=soKhung;
		this.namSX=namSX;
		this.giaTien=giaTien;
		this.Color=Color;
	}
	public String getSoKhung() {
		return soKhung;
	}
	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}
	public int getNamSX() {
		return namSX;
	}
	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}
	public int getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(int giaTien) {
		this.giaTien = giaTien;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int compareTo(Object o)
	{
		return soKhung.compareToIgnoreCase(((PTGT) o).soKhung);
	}
}
