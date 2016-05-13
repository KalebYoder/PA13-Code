package assaultonpa13;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class MoneyTests {
	
	int originalMoney;
	int originalCost;
	PA13GUI game;
	
	@Before
	public void setUp() throws Exception {
		game = new PA13GUI();
	}
	
	@Test
	public void appeaseTest() throws IOException {		
		//Testing with more than enough money
		game.Status.setMoney(game.Status.getAppCost()+1);
		originalCost = game.Status.getAppCost();
		game.appeaseActionPerformed();
		assertNotEquals(originalCost, game.Status.getAppCost());
		assertEquals(1, game.Status.getMoney());
		
		//Testing with exactly enough money
		game.Status.setMoney(game.Status.getAppCost());
		originalCost = game.Status.getAppCost();
		game.appeaseActionPerformed();
		assertNotEquals(originalCost, game.Status.getAppCost());
		assertEquals(0, game.Status.getMoney());
		
		//Testing with not enough money
		game.Status.setMoney(game.Status.getAppCost()-1);
		originalCost = game.Status.getAppCost();
		game.appeaseActionPerformed();
		originalMoney = game.Status.getMoney();
		assertEquals(originalCost, game.Status.getAppCost());
		assertEquals(originalMoney, game.Status.getMoney());
	}
	
	@Test
	public void fixTest() throws IOException {
		PA13GUI game = new PA13GUI();
		
		//Testing with more than enough money
		game.Status.setMoney(game.Status.getFixCost()+1);
		game.Status.setHealth(1);
		game.fixBarrActionPerformed();
		assertEquals(1, game.Status.getMoney());
		assertEquals(game.Status.getHealthMax(), game.Status.getHealth());
		
		//Testing with exactly enough money
		game.Status.setMoney(game.Status.getFixCost());
		game.Status.setHealth(1);
		game.fixBarrActionPerformed();
		assertEquals(0, game.Status.getMoney());
		assertEquals(game.Status.getHealthMax(), game.Status.getHealth());
		
		//Testing with not enough money
		game.Status.setMoney(game.Status.getFixCost()-1);
		game.Status.setHealth(1);
		originalMoney = game.Status.getMoney();
		game.fixBarrActionPerformed();
		assertEquals(originalMoney, game.Status.getMoney());
		assertEquals(1, game.Status.getHealth());
	}
	
	@Test
	public void hireTest() throws IOException {
		PA13GUI game = new PA13GUI();
		
		//Testing with more than enough money
		game.Status.setMoney(game.Status.getHireCost()+1);
		originalCost = game.Status.getHireCost();
		game.hireActionPerformed();
		assertNotEquals(originalCost, game.Status.getHireCost());
		assertEquals(1, game.Status.getMoney());
		
		//Testing with exactly enough money
		game.Status.setMoney(game.Status.getHireCost());
		originalCost = game.Status.getHireCost();
		game.hireActionPerformed();
		assertNotEquals(originalCost, game.Status.getHireCost());
		assertEquals(0, game.Status.getMoney());
		
		//Testing with not enough money
		game.Status.setMoney(game.Status.getHireCost()-1);
		originalCost = game.Status.getHireCost();
		game.hireActionPerformed();
		originalMoney = game.Status.getMoney();
		assertEquals(originalCost, game.Status.getHireCost());
		assertEquals(originalMoney, game.Status.getMoney());
	}
	
	@Test
	public void improveTest() throws IOException {
		PA13GUI game = new PA13GUI();
		
		//Testing with more than enough money
		game.Status.setMoney(game.Status.getImpBarrCost()+1);
		originalCost = game.Status.getImpBarrCost();
		game.impBarrActionPerformed();
		assertNotEquals(originalCost, game.Status.getImpBarrCost());
		assertEquals(1, game.Status.getMoney());
		
		//Testing with exactly enough money
		game.Status.setMoney(game.Status.getImpBarrCost());
		originalCost = game.Status.getImpBarrCost();
		game.impBarrActionPerformed();
		assertNotEquals(originalCost, game.Status.getImpBarrCost());
		assertEquals(0, game.Status.getMoney());
		
		//Testing with not enough money
		game.Status.setMoney(game.Status.getImpBarrCost()-1);
		originalCost = game.Status.getImpBarrCost();
		game.impBarrActionPerformed();
		originalMoney = game.Status.getMoney();
		assertEquals(originalCost, game.Status.getImpBarrCost());
		assertEquals(originalMoney, game.Status.getMoney());
	}

}
