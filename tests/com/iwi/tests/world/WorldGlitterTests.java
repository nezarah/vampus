package com.iwi.tests.world;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.iwi.vampus.world.Senses;
import com.iwi.vampus.world.World;

public class WorldGlitterTests {

	private int map[][] = { { 0, 0, 0, 1 }, { 2, 3, 1, 0 }, { 0, 0, 0, 0 },
			{ 0, 0, 1, 0 } };
	World w;

	@Before
	public void setUp() throws Exception {
		Senses s = new Senses();
		s.setX(1);
		s.setY(1);
		s.setDirection(0);

		w = new World(map, s);
		w.startUp();
	}

	@Test
	public void happyTest() {
		assertEquals(true, w.getCurrentSenses().isGlitter());
	}

	@Test
	public void unHappyTest() {
		w = w.forward();
		assertEquals(false, w.getCurrentSenses().isGlitter());
	}
	@Test
	public void happyGrabTest() {
		assertEquals(false, w.getCurrentSenses().hasGold());
		assertEquals(true, w.getCurrentSenses().isGlitter());
		w.grab();
		assertEquals(false, w.getCurrentSenses().isGlitter());
		assertEquals(true, w.getCurrentSenses().hasGold());
	}
	

}
