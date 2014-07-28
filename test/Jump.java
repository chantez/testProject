public class Jump{
	static Paratropper p;
	static { p = new Paratropper(); }
	{ Thread t1 = new Thread(p, "bob"); t1.start(); }
	{ ; }
	{ ; }
	
	public static void main(String[] args){
		new Jump();
		new Thread(new Runnable(){
						public void run(){ ; } },
						"carol").start();
		new Thread(new Paratropper(), "alice").start();
	}
	Jump(){
		Thread t2 = new Thread(p, "ted");
		t2.start();
	}
}