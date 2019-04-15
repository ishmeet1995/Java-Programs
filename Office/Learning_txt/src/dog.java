public class dog {
	String name;
	String type;
	int age;
	String color;
	
	public dog(String name1, String type1, int age1, String color1 ) {   //Constructor
		this.name = name1;
		this.age = age1;
		this.color = color1;
		this.type = type1;
		
		
	}	
	
	public String getName()			//Method 1
	{
		return name;
	}
	
	public String getColor()			//Method 2
	{
		return color;
	}
	public String getType()			//Method 3
	{
		return type;
	}
	public int getAge()			//Method 4
	{
		return age;
	}
	
	public String printf()
	{
		return ("Hi my name is " + this.getName() + " Type, Age, Color is"+ getType() + 
				this.getAge() + this.getColor());
	}
	
	public static void main(String []args)
	{
		dog bruno  = new dog("Bruno","Pamillion",5,"white");
		System.out.println(bruno.printf());
	}
	
	
	
	
	
	

	
	
	
}	
