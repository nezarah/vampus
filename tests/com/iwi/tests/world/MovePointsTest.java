package com.iwi.tests.world;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.iwi.vampus.Constants;
import com.iwi.vampus.world.Senses;
import com.iwi.vampus.world.World;

public class MovePointsTest {

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
	public void testForward() {
		int points1 = w.getCurrentSenses().getPoints();
		w = w.forward();
		int points2 = w.getCurrentSenses().getPoints();

		assertEquals(Constants.ACTION_COST, points1 - points2);

	}
	
	@Test
	public void testLeft() {
		int points1 = w.getCurrentSenses().getPoints();
		w = w.turnLeft();
		int points2 = w.getCurrentSenses().getPoints();

		assertEquals(Constants.ACTION_COST, points1 - points2);

	}
	
	@Test
	public void testRight() {
		int points1 = w.getCurrentSenses().getPoints();
		w = w.turnRight();
		int points2 = w.getCurrentSenses().getPoints();

		assertEquals(Constants.ACTION_COST, points1 - points2);

	}
	@Test
	public void testGrab() {
		int points1 = w.getCurrentSenses().getPoints();
		w = w.grab();
		int points2 = w.getCurrentSenses().getPoints();

		assertEquals(Constants.ACTION_COST, points1 - points2);

	}
	
	@Test
	public void turnAndForward() {
		int points1 = w.getCurrentSenses().getPoints();
		w = w.turnRight();
		int points2 = w.getCurrentSenses().getPoints();
		w = w.forward();
		int points3 = w.getCurrentSenses().getPoints();
		assertEquals(Constants.ACTION_COST, points1 - points2);
		assertEquals(Constants.ACTION_COST, points2 - points3);
		assertEquals(2*Constants.ACTION_COST, points1 - points3);
	}
	
	
	

}
