package com.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Attendance {
	@Id
	private int attendanceId;
	@JsonFormat(pattern="dd-MM-yyyy")
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
