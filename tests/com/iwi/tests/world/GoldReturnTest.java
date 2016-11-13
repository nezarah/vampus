package com.iwi.tests.world;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.iwi.vampus.Constants;
import com.iwi.vampus.world.Senses;
import com.iwi.vampus.world.World;

public class GoldReturnTest {

	private int map[][] = { { 0, 0, 0, 1 }, { 2, 3, 1, 0 }, { 0, 0, 0, 0 },
			{ 0, 0, 1, 0 } };
	World w;

	@Before
	public void setUp() throws Exception {
		Senses s = new Senses();
		s.setX(1);
		s.setY(3);
		s.setDirection(3);
		s.setHasGold(true);
		w = new World(map, s);
	}

	@Test
	public void testForward() {

		int points1 = w.getCurrentSenses().getPoints();
		w = w.forward();

		int points2 = w.getCurrentSenses().getPoints();

		assertEquals(Constants.ACTION_COST + Constants.GOLD_RETURN_COST,
				points1 - points2);
		assertFalse(w.getCurrentSenses().isAlive());
	}

}
