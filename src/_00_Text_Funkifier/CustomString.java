package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String pt2 = s.substring(1).toLowerCase();
		String pt1 = s.substring(0,1).toUpperCase();
		String pt3 = ".";
		return pt1 + pt2 + pt3;
	}

}
