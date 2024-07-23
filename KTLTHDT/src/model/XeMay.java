package model;
import java.util.ArrayList;
import java.util.List;

import model.VoXe;
import model.DongCo;
import model.SanPham;

public class XeMay extends SanPham {
	private DongCo dongco;
	private List<VoXe> dsbx;
	public XeMay(int maSP, String tenSP, int soluong, double giaca, DongCo dongco) {
		super(maSP, tenSP, soluong, giaca);
		this.dongco = dongco;
		this.dsbx = new ArrayList<VoXe>();
	}
	public void addBanhXe (VoXe bx) throws CloneNotSupportedException {
		dsbx.add((VoXe)bx.clone());
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
	public List<VoXe> getDsbx() {
		return dsbx;
	}
	public void setDsbx(List<VoXe> dsbx) throws CloneNotSupportedException {
		for(VoXe item: dsbx) {
			this.dsbx.add((VoXe)item.clone());
		}
	}
	@Override
	public String toString() {
		return "XeHoi [dongco=" + dongco + ", dsbx=" + dsbx + ", getMaSP()=" + getMaSP() + ", getTenSP()=" + getTenSP()
				+ ", getSoluong()=" + getSoluong() + ", getGiaca()=" + getGiaca() + "]";
	}
	

}