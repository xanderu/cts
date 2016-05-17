package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.AgentieImobiliara;
import clase.Facade;
import clase.IImobile;

public class TestClass3 {
	
	public AgentieImobiliara a1;
	public Facade f1;
	public IImobile garsoniera;
	public IImobile apartament;
	public IImobile casa;
	

	@Before
	public void init(){
		a1 = AgentieImobiliara.getInstance();
		garsoniera = a1.crateImobil("garsoniera");
		apartament = a1.crateImobil("apartament");
		casa = a1.crateImobil("casa");
		f1 = new Facade(null);

		
	}
	
	@Test
	public void test1() {
		assertNotNull(f1);
	}
	
	@Test
	public void test2() {
		assertNotNull(garsoniera);
	}
	
	@Test
	public void test3() {
		assertNotNull(apartament);
	}
	
	@Test
	public void test4() {
		assertNotNull(casa);
	}
	
	@Test
	public void test5() {
		assertEquals(f1.getClass().toString(),"class clase.Facade");
	}

}
