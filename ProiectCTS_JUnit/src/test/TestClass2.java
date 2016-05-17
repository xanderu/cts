package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.AgentieImobiliara;
import clase.IImobile;

public class TestClass2 {
	public AgentieImobiliara a1;
	IImobile im1;
	IImobile im2;
	
	@Before
	public void init(){
		
		a1 = AgentieImobiliara.getInstance();
		im1 = a1.crateImobil("garsoniera");
		im2 = a1.crateImobil("garsoniera");
		
	}

	@Test
	public void test1() {
		assertNotEquals(im1, a1.crateImobil("garsoniera"));
	}
	
	@Test
	public void test2() {
		assertNotNull(im1);
	}
	
	@Test
	public void test3() {
		assertNotNull(im2);
	}
	
	@Test
	public void test4() {
		assertNotEquals(im1, im2);
	}
	
	@Test
	public void test5() {
		assertEquals(im1.getClass(), im2.getClass());
	}
	

}
