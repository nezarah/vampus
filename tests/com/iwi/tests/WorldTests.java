package com.iwi.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.iwi.tests.world.BumpAndForward;
import com.iwi.tests.world.DeathPointsTest;
import com.iwi.tests.world.GoldReturnTest;
import com.iwi.tests.world.MovePointsTest;
import com.iwi.tests.world.SensesTests;
import com.iwi.tests.world.ShootingTests;
import com.iwi.tests.world.WorldForwardTestsHappyScenarios;
import com.iwi.tests.world.WorldForwardTestsUnhappy;
import com.iwi.tests.world.WorldGlitterTests;
import com.iwi.tests.world.WorldTestsRightTurn;
import com.iwi.tests.world.WorldTurnLeftTests;

@RunWith(Suite.class)
@SuiteClasses({ WorldForwardTestsHappyScenarios.class,
		ShootingTests.class,
		WorldTestsRightTurn.class, WorldTurnLeftTests.class,
		WorldForwardTestsUnhappy.class, WorldGlitterTests.class,
		SensesTests.class, MovePointsTest.class, DeathPointsTest.class,GoldReturnTest.class,BumpAndForward.class })
public class WorldTests {

}
