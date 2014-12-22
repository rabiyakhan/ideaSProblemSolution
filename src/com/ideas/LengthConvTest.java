package com.ideas;

import static org.junit.Assert.*;

import org.junit.Test;

public class LengthConvTest {

	@Test
	public void testConvert() {
		Double result = LengthConverter.Convert(LengthUnits.METER, LengthUnits.CENTIMETER, 25) ;
		Double expected = Double.valueOf(2500.0);
		assertEquals(expected, result);
	}
	
	@Test
	public void testFtoKm() {
		Double result = LengthConverter.Convert(LengthUnits.FOOT, LengthUnits.KILOMETER, 20) ;
		Double expected = Double.valueOf(0.00608);
		assertEquals(expected, result);
	}

}
