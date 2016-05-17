package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.AgentieImobiliara;
import clase.Facade;
import clase.IImobile;
import clase.ImobileAdapter;
import clase.ImobiliareInterface;

public class TestClass6 {

	public AgentieImobiliara a1;
	public Facade f1;
	public IImobile garsoniera;
	public IImobile apartament;
	public IImobile casa;
	public ImobiliareInterface adaptedEstate;
	
	
	@Before
	public void init(){
		a1 = AgentieImobiliara.getInstance();
		garsoniera = a1.crateImobil("garsoniera");
		apartament = a1.crateImobil("apartament");
		casa = a1.crateImobil("casa");
		f1 = new Facade(null);
		adaptedEstate = new ImobileAdapter(casa);
		
	}
	
	@Test
	public void test1() {
		assertNotNull(adaptedEstate);
	}
	
	@Test
	public void test2() {
		assertNotEquals(adaptedEstate.getClass().toString(),casa.getClass().toString());
	}
	
	@Test
	public void test3() {
		assertEquals(adaptedEstate.getClass().toString(),"class clase.ImobileAdapter");
	}
	
	@Test
	public void test4() {
		assertNotEquals(adaptedEstate.getClass().toString(),apartament.getClass().toString());
	}
	
	@Test
	public void test5() {
		assertNotEquals(adaptedEstate.getClass().toString(),garsoniera.getClass().toString());
	}

}
