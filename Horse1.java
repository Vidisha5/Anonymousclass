
public class Horse1 {

	
	public static void main(String[] args) {
		class Horse{
			private String name;

			public Horse(String name) {
				super();
				this.name = name;
			}
			
			
		}
		Object object=new Horse("Zippo");
		Horse h=(Horse) object;
		System.out.println(h.name);
	}
}
