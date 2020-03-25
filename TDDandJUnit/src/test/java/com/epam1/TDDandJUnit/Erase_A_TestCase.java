package com.epam1.TDDandJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Erase_A_TestCase {
    /* TODO List of my project
     1.empty string -success
     2.1 char and 1 char other than A-success
     3.2 chars-success
     3.3 chars-success
     4.4 chars-success
     5.5 chars-success
     6.n chars-success
     7.string without A-success
	 */
	@Test
	void TestZeroChar()
	{
		Erase_A erase=new Erase_A();
		String result=erase.removeA("");
		assertEquals("", result);
	}
	@Test
	void Test1Char()
	{
		Erase_A erase=new Erase_A();
		String result=erase.removeA("A");
		assertEquals("", result);
	}
	@Test
	void Test1Char_2()
	{
		Erase_A erase=new Erase_A();
		String result=erase.removeA("B");
		assertEquals("B", result);
	}
	@Test
	void Test2Char()
	{
		Erase_A erase=new Erase_A();
		String result=erase.removeA("BA");
		assertEquals("B", result);
	}
	@Test
	void Test3Char()
	{
		Erase_A erase=new Erase_A();
		String result=erase.removeA("ABC");
		assertEquals("BC", result);
	}
	@Test
	void Test4Char()
	{
		Erase_A erase=new Erase_A();
		String result=erase.removeA("BACD");
		assertEquals("BCD", result);
	}
	@Test
	void Test5Char()
	{
		Erase_A erase=new Erase_A();
		String result=erase.removeA("AASAD");
		assertEquals("SAD", result);
	}
	@Test
	void TestNChar()
	{
		Erase_A erase=new Erase_A();
		String result=erase.removeA("GHAASEL");
		assertEquals("GHAASEL", result);
	}
	@Test
	void TestStringwithoutA()
	{
		Erase_A erase=new Erase_A();
		String result=erase.removeA("GHSEL");
		assertEquals("GHSEL", result);
	}
	
	
	

}
