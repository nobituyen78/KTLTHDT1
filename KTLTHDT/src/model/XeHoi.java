package model;

import java.util.ArrayList;
import java.util.List;

public class XeHoi extends SanPham {
	private DongCo dongco;
	private List<BanhXe> dsbx;
	public XeHoi(int maSP, String tenSP, int soluong, double giaca, DongCo dongco) {
		super(maSP, tenSP, soluong, giaca);
		this.dongco = dongco;
		this.dsbx = new ArrayList<BanhXe>();
	}
	public void addBanhXe (BanhXe bx) throws CloneNotSupportedException {
		dsbx.add((BanhXe)bx.clone());
	}
	public DongCo getDongco() {
		return dongco;
	}
	public int getMaSP() {
	    return this.maSP; 
	}
	public void setDongco(DongCo dongco) {
		this.dongco = dongco;
	}
	public List<BanhXe> getDsbx() {
		return dsbx;
	}
	public void setDsbx(List<BanhXe> dsbx) throws CloneNotSupportedException {
		for(BanhXe item: dsbx) {
			this.dsbx.add((BanhXe)item.clone());
		}
	}
	@Override
	public String toString() {
		return "XeHoi [dongco=" + dongco + ", dsbx=" + dsbx + ", getMaSP()=" + getMaSP() + ", getTenSP()=" + getTenSP()
				+ ", getSoluong()=" + getSoluong() + ", getGiaca()=" + getGiaca() + "]";
	}
	

}