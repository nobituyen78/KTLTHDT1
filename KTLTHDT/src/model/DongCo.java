
package model;

public class DongCo implements Cloneable {
	private String loaiDongCo;
	private double congsuat;
	public DongCo(String loaiDongCo, double congsuat) {
		super();
		this.loaiDongCo = loaiDongCo;
		this.congsuat = congsuat;
	}
	public String getLoaiDongCo() {
		return loaiDongCo;
	}
	public void setLoaiDongCo(String loaiDongCo) {
		this.loaiDongCo = loaiDongCo;
	}
	public double getCongsuat() {
		return congsuat;
	}
	public void setCongsuat(double congsuat) {
		this.congsuat = congsuat;
	}
	@Override
	public String toString() {
		return "DongCo [loaiDongCo=" + loaiDongCo + ", congsuat=" + congsuat + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
