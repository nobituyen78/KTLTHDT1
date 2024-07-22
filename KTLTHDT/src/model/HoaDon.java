
package model;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
	private int soHD;
	private List<SanPham> dssp;
	public HoaDon(int doHD) {
		super();
		this.soHD = soHD;
		this.dssp = new ArrayList<SanPham>();
	}
	public void addSanPham(SanPham sp) throws CloneNotSupportedException {
		this.dssp.add((SanPham)sp.clone());
	}
	public int getSoHD() {
		return soHD;
	}
	public void setSoHD(int soHD) {
		this.soHD = soHD;
	}
	public List<SanPham> getDssp() {
		return dssp;
	}
	public void setDssp(List<SanPham> dssp) {
		this.dssp = dssp;
	}
	@Override
	public String toString() {
		return "HoaDon [soHD=" + soHD + ", dssp=" + dssp + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
