
public class MyOuter {

	
	private int x=7;
	
	class MyInner{
		public void seeOuter() {
			System.out.println("Value of x is:"+x);
			System.out.println("this reference"+this);
			System.out.println("this reference"+MyOuter.this);
		}
	}
	
	public void view() {
		MyInner innerobj=new MyInner();
		innerobj.seeOuter();
	}
	
	public static void main(String[] args) {
		MyOuter.MyInner obj=new MyOuter().new MyInner();
		obj.seeOuter();
		
		MyOuter outerobj=new MyOuter();
		outerobj.view();
	}
}
