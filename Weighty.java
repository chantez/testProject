import java.lang.Override;

public class Weighty{
}

class Big{
	void doStuff(int x){}
}

class Heavy extends Big{
	//@Override
	//void doStuff(int b){ }
	
	@Override
	protected void doStuff(int x) throws RuntimeException{}
	
	private int doStuff(char c) throws Exception{return 1;}
}