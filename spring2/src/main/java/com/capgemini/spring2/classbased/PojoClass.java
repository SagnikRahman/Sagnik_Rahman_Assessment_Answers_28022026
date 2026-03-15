package com.capgemini.spring2.classbased;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PojoClass {

	@Autowired
	private Bike bike;
	
	@Autowired
    @Qualifier("honda")
    private Bike hondaBike;

	@Autowired
	private People people;
	
	@Autowired
	private List<Integer> peopleNo;

	@Override
	public String toString() {
		return "PojoClass [bike=" + bike + ", hondaBike=" + hondaBike + ", people=" + people + ", peopleNo=" + peopleNo
				+ "]";
	}

	
	
}
