package com.iwi.tests.world;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.iwi.vampus.Constants;
import com.iwi.vampus.world.Senses;
import com.iwi.vampus.world.World;

public class BumpAndForward {


	private int map[][] = { { 0, 0, 0, 1 }, { 2, 3, 1, 0 }, { 0, 0, 0, 0 },
			{ 0, 0, 1, 0 } };
	World w;

	@Before
	public void setUp() throws Exception {
		Senses s = new Senses();
		s.setX(0);
		s.setY(3);
		s.setDirection(3);

		w = new World(map, s);
	}

	@Test
	public void testForward() {
		
		
		w = w.forward();
		assertEquals(true, w.getCurrentSenses().isBump());
		w=w.turnRight();
		assertEquals(false, w.getCurrentSenses().isBump());
		w=w.forward();
		assertEquals(false, w.getCurrentSenses().isBump());
		
	}

}
