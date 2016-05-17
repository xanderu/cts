package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.AgentieImobiliara;
import clase.Facade;
import clase.IImobile;

public class TestClass5 {

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
		assertNotEquals(apartament.getClass().toString(), "class clase.Casa");
	}
	
	@Test
	public void test2() {
		assertNotEquals(casa.getClass().toString(), "class clase.Apartament");
	}
	
	@Test
	public void test3() {
		assertNotEquals(garsoniera.getClass().toString(), "class clase.Casa");
	}
	
	@Test
	public void test4() {
		assertNotEquals(garsoniera.getClass().toString(), casa.getClass().toString());
	}

}
