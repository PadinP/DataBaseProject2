package dto;

import java.util.Date;

public class date_d {

	private String iddate;
	private Date hour;
	
	public date_d(String iddate, Date hour) {
		this.iddate = iddate;
		this.hour = hour;
	}

	public String getIddate() {
		return iddate;
	}

	public void setIddate(String iddate) {
		this.iddate = iddate;
	}

	public Date getHour() {
		return hour;
	}

	public void setHour(Date hour) {
		this.hour = hour;
	}
}
