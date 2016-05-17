package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.AgentieImobiliara;
import clase.Facade;
import clase.IImobile;

public class TestClass4 {

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
		assertNotEquals(garsoniera, apartament);
	}
	
	@Test
	public void test2() {
		assertNotEquals(garsoniera, casa);
	}
	
	@Test
	public void test3() {
		assertNotEquals(apartament, casa);
	}
	
	@Test
	public void test4() {
		assertEquals(apartament.getClass().toString(), "class clase.Apartament");
	}
	
	@Test
	public void test5() {
		assertEquals(casa.getClass().toString(), "class clase.Casa");
	}
	
	@Test
	public void test6() {
		assertEquals(garsoniera.getClass().toString(), "class clase.Garsoniera");
	}

}
