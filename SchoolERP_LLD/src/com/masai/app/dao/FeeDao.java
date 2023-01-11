package com.masai.app.dao;

import java.util.List;

import com.masai.app.model.FeeRecord;

public interface FeeDao {
    void create(FeeRecord feeRecord);
    FeeRecord read(int studentId);
    void update(FeeRecord feeRecord);
    List<FeeRecord> getByClass(String className);
	int getTotalFeesPaidThisMonth(int currentMonth, int currentYear);
}
