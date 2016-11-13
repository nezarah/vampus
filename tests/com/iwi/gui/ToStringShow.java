package com.iwi.gui;

import static org.junit.Assert.*;

import org.junit.Test;

import com.iwi.vampus.world.Senses;
import com.iwi.vampus.world.World;

public class ToStringShow {

	@Test
	public void test() {

		int map[][] = { { 0, 0, 0, 1 }, { 2, 3, 1, 0 }, { 0, 0, 0, 0 },
				{ 0, 0, 1, 0 } };

		Senses s = new Senses();
		s.setDirection(0);
		s.setY(3);
		s.setX(0);

		World w = new World(map, s);
		System.out.println(w);

		World newW = w.forward();

		System.out.println(newW);

		assertTrue(true);
	}

}
