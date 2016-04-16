package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
    	String specificationVersion = System.getProperty("java.specification.version");
    	return Double.parseDouble(specificationVersion);
    }

    public static void main(String[] args) {
	    System.out.println(getVersion());
    }
}
