
package model;

import java.util.ArrayList;
import java.util.List;
public class HoaDon {
    private SanPham sanPham;
    private int soLuong;
	private Object dssp;
	private int soHD;

    // Constructor, getters, setters

	
	public void addSanPham(SanPham sp) throws CloneNotSupportedException {
		((List<SanPham>) this.dssp).add((SanPham)sp.clone());
	}
	public int getSoHD() {
		return getSoHD();
	}
	public void setSoHD(int soHD) {
		this.soHD = soHD;
	}
	public List<SanPham> getDssp() {
		return (List<SanPham>) dssp;
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
