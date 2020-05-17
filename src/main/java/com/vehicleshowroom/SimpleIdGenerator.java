package com.vehicleshowroom;

import java.util.concurrent.atomic.AtomicInteger;

public class SimpleIdGenerator implements IdGenerator {

	private static final String PREFIX = "V-";
	
	private AtomicInteger ids = new AtomicInteger(0);
	
	public String nextId() {
		return PREFIX + ids.incrementAndGet();
	}

}
