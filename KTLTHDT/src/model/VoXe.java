package model;

public class VoXe implements Cloneable {
	private String loaiBanhXe;
	private double bankinh;
	public VoXe(String loaiBanhXe, double bankinh) {
		super();
		this.loaiBanhXe = loaiBanhXe;
		this.bankinh = bankinh;
	}
	public String getLoaiBanhXe() {
		return loaiBanhXe;
	}
	public void setLoaiBanhXe(String loaiBanhXe) {
		this.loaiBanhXe = loaiBanhXe;
	}
	public double getBankinh() {
		return bankinh;
	}
	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}
	@Override
	public String toString() {
		return "BanhXe [loaiBanhXe=" + loaiBanhXe + ", bankinh=" + bankinh + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}