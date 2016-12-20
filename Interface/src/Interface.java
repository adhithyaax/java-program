
public interface Interface {  
	  
}		
		  
		class A6 implements Interface{  
		  
		  
		public static void main(String args[]){  
		A6 obj = new A6();  
		if(obj instanceof Interface)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		   
		if(obj instanceof A6)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		 
		Interface object=new A6();
		if(object instanceof Interface)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	if(object instanceof A6)	   
	{
		System.out.println("true");
	}
	else
		System.out.println("false");
}}