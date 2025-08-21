
 public class Arithmatic1 {
	int z;
	int num=49;
	
	 void add(int x,int y)
	{
		z=x+y;
		System.out.println("addition = "+z);
	}
	void sub(int x,int y)
	{
		z=x-y;
		System.out.println("Subtraction = "+z);
	}
	void display()
	{
		System.out.println("Base class");
	}
	public static void main(String[] a)
	{
		Arithmatic1 a1=new Arithmatic1();
		a1.add(7,5);
		a1.sub(7,5);
	    a1.display();	

}
}

