package org.angelssoftware.utilities;

import java.util.ArrayList;

public class StringUtils {


	@SuppressWarnings("unused")
	private static void testValues() {
		ArrayList<String> arrX = new ArrayList<String>();
		arrX.add(null);
		arrX.add("");
		arrX.add(" ");
		arrX.add("  d");
		arrX.add(" x ");
		arrX.add("null");
		
		System.out.println("~~~~ isNullOrEmpty");
		for (String value : arrX) {
			System.out.println(value + " = " + isNullOrEmpty(value));
		}
		
		System.out.println("~~~~ isNullOrWhiteSpace");
		for (String value : arrX) {
			System.out.println(value + " = " + isNullOrWhiteSpace(value));
		}
	}
	
	public static boolean isNullOrEmpty(String value) {
		if(value == null) return true;
		if(value.isEmpty()) return true;
		return false;
	}
	
	public static boolean isNullOrWhiteSpace(String value) {
		if(isNullOrEmpty(value)) return true;
		if(value.matches("[\\s]+")) return true;
		return false;
	}
	
	
	
}
