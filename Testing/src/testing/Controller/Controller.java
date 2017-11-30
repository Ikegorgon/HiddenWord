package testing.Controller;

import testing.Model.*;

public class Controller {
	public void start() {
		String x = "Hello!";
		System.out.println(x);
		HiddenWord puzzle = new HiddenWord("Harps");
		System.out.println(puzzle.getHint("AAAAA"));
	}
}
