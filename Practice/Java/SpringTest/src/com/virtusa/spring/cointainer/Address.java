package com.virtusa.spring.cointainer;

public class Address {
	private String houseNo;

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + "]";
	}
	
	
}
