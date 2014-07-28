import java.lang.Override;

public class Thistle extends Weed{
	@Override
	void grow(){ s += "5-grow "; }
	@Override
	 void growFast() { s += "t-fast "; }
}

class Weed{
	protected static String s = "";
	
	 void grow(){ s += "grow "; }
	
	 void growFast() { s += "fast ";}
}