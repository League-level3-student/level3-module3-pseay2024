package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String r = "";
		String[] words = s.split(" ");
		for (int j = words.length - 1; j >= 0; j--)
		{
			String word = words[j];
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			r += sb;
			r += " ";
		}
		return r.trim();
	}

}
