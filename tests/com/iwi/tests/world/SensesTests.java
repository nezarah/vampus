package com.iwi.tests.world;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.iwi.vampus.world.Senses;
import com.iwi.vampus.world.World;

public class SensesTests {

	private int map[][] = { { 0, 0, 0, 1 }, { 2, 3, 1, 0 }, { 0, 0, 0, 0 },
			{ 0, 0, 1, 0 } };
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
	public void stenchTest1() {

		World newW = w.forward();

		assertEquals(0, newW.getCurrentSenses().getX());
		assertEquals(2, newW.getCurrentSenses().getY());
		assertEquals(true, newW.getCurrentSenses().isSmelly());

	}

	@Test
	public void stenchTest2() {

		World newW = w.forward();
		assertEquals(true, newW.getCurrentSenses().isSmelly());
		newW = newW.turnLeft();
		assertEquals(true, newW.getCurrentSenses().isSmelly());
		newW = newW.turnRight();
		assertEquals(true, newW.getCurrentSenses().isSmelly());
		newW = newW.turnLeft();
		assertEquals(true, newW.getCurrentSenses().isSmelly());

	}
	@Test
	public void breezyTest() {

		
		World newW = w.turnRight();
		newW=newW.forward();
		
		assertEquals(true, newW.getCurrentSenses().isBreezy());

	}

}
