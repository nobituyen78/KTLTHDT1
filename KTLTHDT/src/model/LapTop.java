
package model;

public class LapTop extends SanPham {
	private int ram;
	private String cpu;
	public LapTop(int maSP, String tenSP, int soluong, double giaca, int ram, String cpu) {
		super(maSP, tenSP, soluong, giaca);
		this.ram = ram;
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getMaSP() {
	    return this.maSP;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	@Override
	public String toString() {
		return "LapTop [ram=" + ram + ", cpu=" + cpu + ", getMaSP()=" + getMaSP() + ", getTenSP()=" + getTenSP()
				+ ", getSoluong()=" + getSoluong() + ", getGiaca()=" + getGiaca() + "]";
	}
}
