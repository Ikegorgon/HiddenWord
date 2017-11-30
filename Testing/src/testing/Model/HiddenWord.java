package testing.Model;

public class HiddenWord {
	private String puzzle;
	public HiddenWord(String word) {
		this.puzzle = word;
	}
	public String getHint(String Guess) {
		String response = "";
		for (int i = 0; i < puzzle.length(); i++) {
			if (puzzle.substring(i, i+1).equalsIgnoreCase(Guess.substring(i,i+1))) {
				response += puzzle.charAt(i);
			}
			else if (puzzle.toLowerCase().contains(Guess.substring(i,i+1).toLowerCase())) {
				response += "+";
			}
			else if (!puzzle.toLowerCase().contains(Guess.substring(i, i+1))) {
				response += "*";
			}
		}
		return response;
	}
}
