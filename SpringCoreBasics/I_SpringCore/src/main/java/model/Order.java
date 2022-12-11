package model;

public class Order {

	private int ordid;
	private String ordname;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int ordid, String ordname) {
		super();
		this.ordid = ordid;
		this.ordname = ordname;
	}
	public int getOrdid() {
		return ordid;
	}
	public void setOrdid(int ordid) {
		this.ordid = ordid;
	}
	public String getOrdname() {
		return ordname;
	}
	public void setOrdname(String ordname) {
		this.ordname = ordname;
	}
	@Override
	public String toString() {
		return "Order [ordid=" + ordid + ", ordname=" + ordname + "]";
	}
	
}
