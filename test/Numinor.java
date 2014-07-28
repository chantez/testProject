public class Numinor{
	enum Members{
		HOBBITS(48), ELVES(74), DWARVES(40);
		int height;
		Members(int h) { height = h; }
		int getHeight(){ return height;}
	}
}