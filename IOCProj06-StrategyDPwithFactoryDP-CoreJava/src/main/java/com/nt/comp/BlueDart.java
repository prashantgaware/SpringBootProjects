package com.nt.comp;

public final class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("Bluedart::0-param cstor");
	}

	@Override
	public String deliver(int oid) {
		return oid + "order id order delivered";
	}

}
