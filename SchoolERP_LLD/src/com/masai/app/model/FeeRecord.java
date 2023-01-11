package com.masai.app.model;

import java.util.Date;

public class FeeRecord 
{
    private int studentId;
    private float feeAmount;
    private Date dueDate;
    private float paidAmount;
    
    public FeeRecord() {}

	public FeeRecord(int studentId, float feeAmount, Date dueDate, float paidAmount) {
		super();
		this.studentId = studentId;
		this.feeAmount = feeAmount;
		this.dueDate = dueDate;
		this.paidAmount = paidAmount;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public float getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(float feeAmount) {
		this.feeAmount = feeAmount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public float getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}

	@Override
	public String toString() {
		return "FeeRecord [studentId=" + studentId + ", feeAmount=" + feeAmount + ", dueDate=" + dueDate
				+ ", paidAmount=" + paidAmount + "]";
	}
    
    
}

