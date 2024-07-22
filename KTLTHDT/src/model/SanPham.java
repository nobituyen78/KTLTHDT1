
package model;

public class SanPham {
	protected int maSP;
	private String tenSP;
	private int soluong;
	private double giaca;
	public SanPham(int maSP, String tenSP, int soluong, double giaca) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.soluong = soluong;
		this.giaca = giaca;
	}
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public double getGiaca() {
		return giaca;
	}
	public void setGiaca(double giaca) {
		this.giaca = giaca;
	}
	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", soluong=" + soluong + ", giaca=" + giaca + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
