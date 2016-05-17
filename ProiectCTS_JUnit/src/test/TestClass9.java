package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Abonat;
import clase.AbonatBuilder;
import clase.AgentieImobiliara;
import clase.Facade;
import clase.IImobile;
import clase.ImobileAdapter;
import clase.ImobiliareInterface;
import clase.NotificatorAbonati;
import clase.PlataCash;
import clase.PlataCredit;
import clase.Plateste;

public class TestClass9 {

	public AgentieImobiliara a1;
	public Facade f1;
	public IImobile garsoniera;
	public IImobile apartament;
	public IImobile casa;
	public ImobiliareInterface adaptedEstate;
	public Plateste p;
	public Plateste p2;
	public NotificatorAbonati notificatorAbonati;
	Abonat ab1;
	Abonat ab2;
	Abonat ab3;
	Abonat abn;
	
	
	@Before
	public void init(){
		notificatorAbonati = new NotificatorAbonati();
		a1 = AgentieImobiliara.getInstance();
		garsoniera = a1.crateImobil("garsoniera");
		apartament = a1.crateImobil("apartament");
		casa = a1.crateImobil("casa");
		f1 = new Facade(null);
		adaptedEstate = new ImobileAdapter(casa);
		
		p = new Plateste(new PlataCash());
		p2 = new Plateste(new PlataCredit());
		ab1 = new Abonat("Cristi", "Petre", "1920712870021");
		ab2 = new Abonat("Mihai", "Petre", "1920714320021");
		ab3 = ab2.copiaza();
		abn = new AbonatBuilder().setNume("Cristi").setPrenume("Petre").setCnp("1920718450021").build();
		
	}
	
	@Test
	public void test1() {
		assertNotNull(abn);
	}
	
	@Test
	public void test2() {
		assertNotEquals(ab3, ab2);
	}
	
	@Test
	public void test3() {
		assertNotEquals(abn, ab2);
	}
	
	@Test
	public void test4() {
		assertEquals(abn.getClass(), ab2.getClass());
	}
	
	@Test
	public void test5() {
		assertNotNull(abn.getClass().getName());
	}

}
