package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.AgentieImobiliara;
import clase.Facade;
import clase.IImobile;
import clase.ImobileAdapter;
import clase.ImobiliareInterface;
import clase.PlataCash;
import clase.PlataCredit;
import clase.Plateste;

public class TestClass7 {

	public AgentieImobiliara a1;
	public Facade f1;
	public IImobile garsoniera;
	public IImobile apartament;
	public IImobile casa;
	public ImobiliareInterface adaptedEstate;
	public Plateste p;
	public Plateste p2;
	
	
	@Before
	public void init(){
		a1 = AgentieImobiliara.getInstance();
		garsoniera = a1.crateImobil("garsoniera");
		apartament = a1.crateImobil("apartament");
		casa = a1.crateImobil("casa");
		f1 = new Facade(null);
		adaptedEstate = new ImobileAdapter(casa);
		
		p = new Plateste(new PlataCash());
		p2 = new Plateste(new PlataCredit());
		
	}
	
	@Test
	public void test1() {
		assertNotNull(p);
	}
	
	@Test
	public void test2() {
		assertNotNull(p2);
	}
	
	@Test
	public void test3() {
		assertNotEquals(p,p2);
	}
	
	@Test
	public void test4() {
		assertEquals(p.getClass().toString(),p2.getClass().toString());
	}
	
	@Test
	public void test5() {
		assertEquals(p.getClass().toString(),"class clase.Plateste");
	}

}
