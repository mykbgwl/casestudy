package com.model;

import javax.persistence.*;


@Entity
public class Attendance {
	@Id
	private int attendanceId;
	private java.sql.Date attendanceDate;
	@Enumerated(EnumType.STRING)
	private AttendanceType status;
	
	public Attendance() {
		
	}

	public int getAttendanceId() {
		return attendanceId;
	}

	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}

	public java.sql.Date getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(java.sql.Date attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public AttendanceType getStatus() {
		return status;
	}

	public void setStatus(AttendanceType status) {
		this.status = status;
	}
	
}
