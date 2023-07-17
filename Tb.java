
class Tb{
	public int a;
	
	public Tb(int b) {
		a=b;
	}

	public int getA() {
		return a;
	}

	public static void main(String[] args) {
			Tb t1 = new Tb(1);
			Tb t2 = new Tb(2);
			if(t1.equals(t2)) {
				System.out.println("h");
			}
			else {
				System.out.println("h1");
			}
	}
	
	public boolean equals(Object o) {
		Tb t=(Tb)o;
		if((t instanceof Tb) && (t.getA() == this.a)) {
			return true;
		}
		else {
			return false;
		}		
	}
	
	public int hashCode() {
		return (a*2);
	}
}
