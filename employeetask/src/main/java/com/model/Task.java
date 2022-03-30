package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Task {
	@Id
	@GeneratedValue
	private int taskId;
	private String taskName;
	private String taskDescription;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private java.sql.Date dateOfAllocation;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private java.sql.Date deadline;
	
	@OneToOne
	private Employee allocatedTo;
	
	public Task() {
		
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public java.sql.Date getDateOfAllocation() {
		return dateOfAllocation;
	}

	public void setDateOfAllocation(java.sql.Date dateOfAllocation) {
		this.dateOfAllocation = dateOfAllocation;
	}

	public java.sql.Date getDeadline() {
		return deadline;
	}

	public void setDeadline(java.sql.Date deadline) {
		this.deadline = deadline;
	}

	public Employee getAllocatedTo() {
		return allocatedTo;
	}

	public void setAllocatedTo(Employee allocatedTo) {
		this.allocatedTo = allocatedTo;
	}
	
}
