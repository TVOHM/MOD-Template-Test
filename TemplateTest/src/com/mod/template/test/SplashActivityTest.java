package com.mod.template.test;

import com.mod.template.SplashActivity;

import android.test.ActivityInstrumentationTestCase2;

public class SplashActivityTest extends ActivityInstrumentationTestCase2<SplashActivity> {
	public SplashActivityTest() {
		super("com.mod.tempplate.SplashActivity", SplashActivity.class);
	}
	
	@Override
	  protected void setUp() throws Exception {
	    super.setUp();
	}
	
	public void testPreconditions() {
	}
	
	public void testSomething(){
		assertTrue(false);
	}
	
	@Override
	  protected void tearDown() throws Exception {
	    super.tearDown();
	}
}
