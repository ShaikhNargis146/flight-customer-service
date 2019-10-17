package com.luv2code.springboot.flightList.system;

public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 5962898215276911029L;

	public ResourceNotFoundException(String resourceType, String keyName, int keyValue) {
		super(resourceType + " with " + keyName + "[" + keyValue + "] not found in the system!");
	}

}
