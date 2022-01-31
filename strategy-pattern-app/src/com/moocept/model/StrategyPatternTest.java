package com.moocept.model;

import com.monocept.model.test.Context;
import com.monocept.model.test.Jump;
import com.monocept.model.test.Kick;
import com.monocept.model.test.OverHand;
import com.monocept.model.test.Punch;
import com.monocept.model.test.Roll;
import com.monocept.model.test.Slaps;

public class StrategyPatternTest {

	public static void main (String [] args) {
		
		Context context = new Context(new Jump());
		context.executeStrategy();
		
		context = new Context(new Kick());
		context.executeStrategy();
		
		context = new Context(new OverHand());
		context.executeStrategy();
		
		context = new Context(new Punch());
		context.executeStrategy();
		
		context = new Context(new Roll());
		context.executeStrategy();
		
		context = new Context(new Slaps());
		context.executeStrategy();
	}
}
