package com.iwi.tests.world;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.iwi.vampus.world.Senses;
import com.iwi.vampus.world.World;

@RunWith(Parameterized.class)
public class WorldTurnLeftTests extends TestCase {

	private int map[][] = { { 0, 0, 0, 1 }, { 2, 3, 1, 0 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } };
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 3 }, { 1, 0 }, { 2, 1 },
				{ 3, 2 } });
	}

	private int inputDirrection;

	private int expectedDirrection;

	public WorldTurnLeftTests(int input, int expected) {
		inputDirrection = input;
		expectedDirrection = expected;
	}

	@Test
	public void test() {
		Senses s = new Senses();
		s.setDirection(inputDirrection);

		World w = new World(map, s);
		World newW = w.turnLeft();
		assertEquals(expectedDirrection, newW.getCurrentSenses().getDirection());
	}
}
