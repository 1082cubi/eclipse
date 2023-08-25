package Basic_06_E;

public class Ele {


	public static void main (String[]args) {
		Com com = new Com();
		System.out.println("무게 : " + com.weight);
		com.play();
	}
}
class Element {
	int weight = 100;
	int power = 220;
	int price = 300;
	Element() {}
	void play() {
		
		}
	
	}


class Com extends Element {

	
}
