package assaultonpa13;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShowSelectionTests {

	PA13GUI game;
	
	@Before
	public void setUp() throws Exception {
		game = new PA13GUI();
	}
	
	@Test
	public void CookTest() {
		game.cookCheckActionPerformed();
		assertTrue(game.Setlist.contains(game.Cooking));
		game.cookCheckActionPerformed();
		assertFalse(game.Setlist.contains(game.Cooking));
	}
	
	@Test
	public void DriveTest() {
		game.driveCheckActionPerformed();
		assertTrue(game.Setlist.contains(game.Driving));
		game.driveCheckActionPerformed();
		assertFalse(game.Setlist.contains(game.Driving));
	}
	
	@Test
	public void FishTest() {
		game.fishCheckActionPerformed();
		assertTrue(game.Setlist.contains(game.Fishing));
		game.fishCheckActionPerformed();
		assertFalse(game.Setlist.contains(game.Fishing));
	}
	
	@Test
	public void JazzTest() {
		game.jazzCheckActionPerformed();
		assertTrue(game.Setlist.contains(game.Jazz));
		game.jazzCheckActionPerformed();
		assertFalse(game.Setlist.contains(game.Jazz));
	}
	
	@Test
	public void SciFiTest() {
		game.sciFiCheckActionPerformed();
		assertTrue(game.Setlist.contains(game.SciFi));
		game.sciFiCheckActionPerformed();
		assertFalse(game.Setlist.contains(game.SciFi));
	}
	
	@Test
	public void SurvivalTest() {
		game.survivalCheckActionPerformed();
		assertTrue(game.Setlist.contains(game.Survival));
		game.survivalCheckActionPerformed();
		assertFalse(game.Setlist.contains(game.Survival));
	}

}
