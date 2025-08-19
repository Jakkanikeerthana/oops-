
public class finalkeyword1 {
	
		   final void display()
		   {	  
		      System.out.println("hi");
		    }
		}


		class B extends A
		{
		      void display()
		        {
			super.display();
			System.out.println("hello");
		          }


	public static void main(String[] args) {
		B b=new B();
	    b.display();
	}

}
