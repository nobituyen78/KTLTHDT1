package model;

import java.util.ArrayList;
import java.util.List;

public class SinhVien {
	private String hoten;
	private String sdt;
	private LopHoc lop;
	private List<HoaDon> dshd;
	public SinhVien(String hoten, String sdt, LopHoc lop) {
		super();
		this.hoten = hoten;
		this.sdt = sdt;
		this.lop = lop;
		this.dshd = new ArrayList<HoaDon>();
	}
	public void addHoaDon (HoaDon hd) throws CloneNotSupportedException {
		this.dshd.add((HoaDon)hd.clone());
	}
	public void removeHoaDon(HoaDon hd) {
	    this.dshd.remove(hd);
	}
	public List<HoaDon> getdshd() {
	    return dshd;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public LopHoc getLop() {
		return lop;
	}
	public void setLop(LopHoc lop) {
		this.lop = lop;
	}
	public List<HoaDon> getDshd() {
		return dshd;
	}
	public void setDshd(List<HoaDon> dshd) throws CloneNotSupportedException {
		for(HoaDon item:dshd) {
			this.dshd.add((HoaDon)item.clone());
		}
	}
	@Override
	public String toString() {
		return "SinhVien [hoten=" + hoten + ", sdt=" + sdt + ", lop=" + lop + ", dshd=" + dshd + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}