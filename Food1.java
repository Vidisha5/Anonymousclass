interface Cookable{
	public void cook();
}
public class Food1 {
	
	Cookable c=new Cookable() {

		@Override
		public void cook() {
			System.out.println("cook");
			
		}
		
	};
	
	
	
	public void cook1() {
		c.cook();
	}
	public static void main(String[] args) {
		Food1 food1=new Food1();
		food1.cook1();
		
	
	
	}
}
