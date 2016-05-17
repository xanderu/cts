package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Abonat;
import clase.AgentieImobiliara;

public class TestAgentieImobiliara {
	
	public AgentieImobiliara a1;
	public AgentieImobiliara a2;
	public Abonat a;
	
	@Before
	public void init(){
		a1 = AgentieImobiliara.getInstance();
		a2 = AgentieImobiliara.getInstance(); 
		a = new Abonat("Cristi", "Petre", "1920718450021");
		
	}

	@Test
	public void TestInstance1() {
		assertNotNull(AgentieImobiliara.getInstance());
	}
	
	@Test
	public void TestInstance2() {

		AgentieImobiliara a1 = AgentieImobiliara.getInstance();
		AgentieImobiliara a2 = AgentieImobiliara.getInstance(); 
		assertEquals(a1,a2);
	}
	
	@Test
	public void TestAbonat3() {

		assertNotNull(a);
	}	
	
	@Test
	public void TestAbonat4() {

		Abonat a = new Abonat("Cristi", "Petre", "1920718450021");
		assertTrue(a.cnpLength());
	}
	
	@Test
	public void TestAbonat5() {

		Abonat a = new Abonat("Cristi", "Petre", "1920718450021");
		assertTrue(a.verifyCnp());
	}

}
