package dto;

import java.util.Date;

public class Route {
	
	private String routecode;
	private Date endtime;
	private String pickuplocation;
	private float kilometersavailableend;
	private float kilometersavailablestar;
	private String solicitudecode;
	
	public Route(String routecode, Date endtime, String pickuplocation,
			float kilometersavailableend, float kilometersavailablestar,
			String solicitudecode) {
		this.routecode = routecode;
		this.endtime = endtime;
		this.pickuplocation = pickuplocation;
		this.kilometersavailableend = kilometersavailableend;
		this.kilometersavailablestar = kilometersavailablestar;
		this.solicitudecode = solicitudecode;
	}

	public String getRoutecode() {
		return routecode;
	}

	public void setRoutecode(String routecode) {
		this.routecode = routecode;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getPickuplocation() {
		return pickuplocation;
	}

	public void setPickuplocation(String pickuplocation) {
		this.pickuplocation = pickuplocation;
	}

	public float getKilometersavailableend() {
		return kilometersavailableend;
	}

	public void setKilometersavailableend(float kilometersavailableend) {
		this.kilometersavailableend = kilometersavailableend;
	}

	public float getKilometersavailablestar() {
		return kilometersavailablestar;
	}

	public void setKilometersavailablestar(float kilometersavailablestar) {
		this.kilometersavailablestar = kilometersavailablestar;
	}

	public String getSolicitudecode() {
		return solicitudecode;
	}

	public void setSolicitudecode(String solicitudecode) {
		this.solicitudecode = solicitudecode;
	}
}
