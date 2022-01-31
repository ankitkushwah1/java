package comonocept.model.test;

import com.monocept.model.Cricket;
import com.monocept.model.Football;
import com.monocept.model.Game;

public class TemplateMethodPatternTest {
	
	public static void main(String [] args) {
		
		Game game = new Cricket();
		game.play();
		System.out.println();
		
		game = new Football();
		game.play();
	}
}
