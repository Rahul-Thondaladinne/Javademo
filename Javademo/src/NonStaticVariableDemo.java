
public class NonStaticVariableDemo {
	int num;
	{
		System.out.println("Inside non static block");
	}
	NonStaticVariableDemo(int x){
		System.out.println("Inside the constructor");
		this.num = x;
	}
	
	public static void main(String[] srgs) {
		System.out.println("Inside main method");
		NonStaticVariableDemo nsvd = new NonStaticVariableDemo(20);
	    System.out.println(nsvd.num);
		
	}

}
