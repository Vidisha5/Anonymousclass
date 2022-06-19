class Popcorn{
	public void pop() {
		System.out.println("popcorn");
	}
}
public class Food {
	
	Popcorn p=new Popcorn() {
		public void pop() {
			System.out.println("popcorn1");
		}
	};
	public void popup() {
		p.pop();
	}
	
	
	public static void main(String[] args) {
	  Food food=new Food();
	  food.popup();
	  
	  
	   /*Popcorn p=new Popcorn() {
		public void pop() {
			System.out.println("popcorn1");
		}
	   };
	   p.pop();*/
	}
}
