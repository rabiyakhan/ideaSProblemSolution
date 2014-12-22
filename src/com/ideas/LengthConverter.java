/**
 * 
 */
package com.ideas;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rkhan
 *
 */



public class LengthConverter {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Convert(LengthUnits.CENTIMETER, LengthUnits.KILOMETER, 1000);
		Convert(LengthUnits.FOOT, LengthUnits.KILOMETER, 20);
//		System.out.println(Convert(LengthUnits.CENTIMETER, LengthUnits.KILOMETER, 1000));
//		System.out.println(Convert(LengthUnits.CENTIMETER, LengthUnits.KILOMETER, 1000));
//		System.out.println(Convert(LengthUnits.CENTIMETER, LengthUnits.KILOMETER, 1000));

	}

	
	public static double Convert(LengthUnits source, LengthUnits destination, int i) {
		// TODO Auto-generated method stub
		
		return i*source.standardConversion()*destination.reverseConversion();
	}
	
	

}
