package com.iwi.tests.world;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.iwi.vampus.Constants;
import com.iwi.vampus.world.Senses;
import com.iwi.vampus.world.World;

public class DeathPointsTest {

	private int map[][] = { { 0, 0, 0, 1 }, { 0, 3, 1, 0 }, { 2, 0, 0, 0 },
			{ 0, 1, 1, 0 } };
	World w;

	@Before
	public void setUp() throws Exception {
		Senses s = new Senses();
		s.setX(0);
		s.setY(3);
		s.setDirection(0);

		w = new World(map, s);
	}

	@Test
	public void testVampusDeath() {
		int points1 = w.getCurrentSenses().getPoints();

		w = w.forward();

		int points2 = w.getCurrentSenses().getPoints();

		assertEquals(Constants.DEATH_COST + Constants.ACTION_COST, points1
				- points2);
		assertFalse(w.getCurrentSenses().isAlive());

	}

	@Test
	public void testPitDeath() {

		w = w.turnRight();

		int points1 = w.getCurrentSenses().getPoints();
		w = w.forward();
		int points2 = w.getCurrentSenses().getPoints();

		assertEquals(Constants.DEATH_COST + Constants.ACTION_COST, points1
				- points2);
		assertFalse(w.getCurrentSenses().isAlive());

	}

}
