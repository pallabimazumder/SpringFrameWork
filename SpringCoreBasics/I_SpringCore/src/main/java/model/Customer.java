package model;

public class Customer {

	private int cid;
	private String cname;
	private String ccity;
	
	private Order order;

	public Customer() {
		super();
	}

	public Customer(int cid, String cname, String ccity, Order order) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ccity = ccity;
		this.order = order;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCcity() {
		return ccity;
	}

	public void setCcity(String ccity) {
		this.ccity = ccity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", ccity=" + ccity + ", order=" + order + "]";
	}
	
	
}
