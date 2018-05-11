package com.job.card.management.system.daoImpl;

import com.job.card.management.system.dao.TestInterface;

public class TestInterfaceImpl implements TestInterface {

	@Override
	public String testFlowMethod() {
		System.out.println("This is database layer...");
		return "From Database layers";
	}

}
