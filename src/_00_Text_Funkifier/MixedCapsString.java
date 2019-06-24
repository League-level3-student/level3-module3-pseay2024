package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String r = "";
		for (int i = 0; i < s.length(); i++)
		{
			switch (i%2)
			{
			case 1:
				//capital
				r += s.toUpperCase().charAt(i);
				break;
			case 0:
				//lowercase
				r += s.toLowerCase().charAt(i);
				break;
			}
		}
		return r;
	}
}
