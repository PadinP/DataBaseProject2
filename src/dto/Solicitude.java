package dto;

import java.util.Date;

public class Solicitude {
	
	private String solicitudecode;
	private Date programmingstarttime;
	private String programmingtobedone;
	private String iddate;
	private String carnumber;
	private String groupcode;
	private String idprogtype;
	private int durationtime;
	private float mileage;
	
	public Solicitude(String solicitudecode, Date programmingstarttime,
			String programmingtobedone, String iddate, String carnumber,
			String groupcode, String idprogtype, int durationtime, float mileage){
		this.solicitudecode = solicitudecode;
		this.programmingstarttime = programmingstarttime;
		this.programmingtobedone = programmingtobedone;
		this.iddate = iddate;
		this.carnumber = carnumber;
		this.groupcode = groupcode;
		this.idprogtype = idprogtype;
		this.durationtime = durationtime;
		this.mileage = mileage;
	}

	public String getSolicitudecode() {
		return solicitudecode;
	}

	public void setSolicitudecode(String solicitudecode) {
		this.solicitudecode = solicitudecode;
	}

	public Date getProgrammingstarttime() {
		return programmingstarttime;
	}

	public void setProgrammingstarttime(Date programmingstarttime) {
		this.programmingstarttime = programmingstarttime;
	}

	public String getProgrammingtobedone() {
		return programmingtobedone;
	}

	public void setProgrammingtobedone(String programmingtobedone) {
		this.programmingtobedone = programmingtobedone;
	}

	public String getIddate() {
		return iddate;
	}

	public void setIddate(String iddate) {
		this.iddate = iddate;
	}

	public String getCarnumber() {
		return carnumber;
	}

	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}

	public String getGroupcode() {
		return groupcode;
	}

	public void setGroupcode(String groupcode) {
		this.groupcode = groupcode;
	}

	public String getIdprogtype() {
		return idprogtype;
	}

	public void setIdprogtype(String idprogtype) {
		this.idprogtype = idprogtype;
	}

	public int getDurationtime() {
		return durationtime;
	}

	public void setDurationtime(int durationtime) {
		this.durationtime = durationtime;
	}

	public float getMileage() {
		return mileage;
	}

	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
}
