/////////////////////////////////// dddddd
/////////////////////////////////// eeeeeeeee
/////////////////////////////////// eeeeeeeee
interface Gadget{}
class Watch{
	class Workings implements Gadget{
		Workings(){ System.out.print("2 ");}
		{System.out.print("3 ");}
	}
	Watch(){ System.out.print("1 "); }
}

public class Timer{
	public static void main(String[] args){
		Watch w = new Watch();
		Watch.Workings ww = w.new Workings();
	}
}

