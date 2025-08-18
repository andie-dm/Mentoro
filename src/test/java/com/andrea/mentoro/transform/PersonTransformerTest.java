package com.andrea.mentoro.transform;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTransformerTest {
	
	private PersonTransformer personTransformer = new PersonTransformer();
	
	@Test 
	public void phoneNumberToLongTest () {
		String input = "(101) 555-5555";
		Long expected = 1015555555L;
	
//		this left side is how we are going to store the return value from the method
//		the right side of the = is how we call the method
		Long actual = personTransformer.phoneNumberToLong(input); 
		assertEquals(expected, actual);
		
		input = "202.555.5555";
		expected = 2025555555L;
		
		actual = personTransformer.phoneNumberToLong(input);
		assertEquals(expected, actual);
		
		input = "801-555-5555";
		expected = 8015555555L;
		
		actual = personTransformer.phoneNumberToLong(input);
		assertEquals(expected, actual);
	}

	@Test
	public void phoneNumberToStringTest () {
		Long input = 9015555555L;
		String expected = "(901) 555-5555";
		
		String actual = personTransformer.phoneNumberToString(input);
		assertEquals(expected, actual);
		
		
	}
	
}

