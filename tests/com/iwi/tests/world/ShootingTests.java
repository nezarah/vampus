package com.iwi.tests.world;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.iwi.vampus.Constants;
import com.iwi.vampus.world.Senses;
import com.iwi.vampus.world.World;


public class ShootingTests {
	
	private int map[][] = { { 0, 0, 0, 1 }, { 2, 3, 1, 0 }, { 0, 0, 0, 0 },
			{ 0, 0, 1, 0 } };
	

	@Test
	public void northTest() {
		Senses s = new Senses();
		s.setX(0);
		s.setY(3);
		s.setDirection(0);

		

		World w = new World(map, s);

		System.out.println(w);

		w = w.shoot();
		System.out.println(w);
		assertEquals(Constants.FREE,map[1][0]);
		assertEquals(true, w.getCurrentSenses().isScream());
		assertFalse(w.getCurrentSenses().hasArrow());

	}
	@Test
	public void southTest() {
		Senses s = new Senses();
		s.setX(0);
		s.setY(0);
		s.setDirection(2);

		

		World w = new World(map, s);

		System.out.println(w);

		w = w.shoot();
		System.out.println(w);
		assertEquals(Constants.FREE,map[1][0]);
		assertEquals(true, w.getCurrentSenses().isScream());
		assertFalse(w.getCurrentSenses().hasArrow());

	}
	@Test
	public void westTest() {
		Senses s = new Senses();
		s.setX(3);
		s.setY(1);
		s.setDirection(3);
		
		

		World w = new World(map, s);

		System.out.println(w);

		w = w.shoot();
		System.out.println(w);
		assertEquals(Constants.FREE,map[1][0]);
		assertEquals(true, w.getCurrentSenses().isScream());
		assertFalse(w.getCurrentSenses().hasArrow());

	}
	@Test
	public void eastTest() {
		Senses s = new Senses();
		s.setX(0);
		s.setY(2);
		s.setDirection(1);
		map[1][0] = Constants.FREE;
		map[2][2] = Constants.VAMPUS;
		
		
		

		World w = new World(map, s);

		System.out.println(w);

		w = w.shoot();
		System.out.println(w);
		assertEquals(Constants.FREE,map[2][2]);
		assertEquals(true, w.getCurrentSenses().isScream());
		assertFalse(w.getCurrentSenses().hasArrow());

	}
	
	@Test
	public void wallShoot() {
		
		Senses s = new Senses();
		s.setX(0);
		s.setY(3);
		s.setDirection(3);
		
		
		
		

		World w = new World(map, s);

		System.out.println(w);

		w = w.shoot();
		System.out.println(w);
		assertEquals(Constants.VAMPUS,map[1][0]);
		assertEquals(false, w.getCurrentSenses().isScream());
		assertFalse(w.getCurrentSenses().hasArrow());

	}




}
