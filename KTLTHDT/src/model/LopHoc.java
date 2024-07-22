package model;

import java.util.ArrayList;
import java.util.List;

public class LopHoc {
	private String tenLop;
	private List<SinhVien> dssv;
	public LopHoc(String tenLop) {
		super();
		this.tenLop = tenLop;
		this.dssv = new ArrayList<SinhVien>();
	}
	public void addSinhVien(SinhVien sv) throws CloneNotSupportedException {
		this.dssv.add((SinhVien)sv.clone());
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public List<SinhVien> getDssv() {
		return dssv;
	}
	public void setDssv(List<SinhVien> dssv) throws CloneNotSupportedException {
		for(SinhVien item: dssv) {
			this.dssv.add((SinhVien)item.clone());
		}
	}
	@Override
	public String toString() {
		return "LopHoc [tenLop=" + tenLop + ", dssv=" + dssv + "]";
	}
	
	
}