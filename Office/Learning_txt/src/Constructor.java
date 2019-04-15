
public class Constructor {

	String name;
	String team;
	int age;
	
	Constructor()
	{
		name ="";
		team ="";
		age = 0;
	}
	
	Constructor(String name,String team, int age)
	{
		this.name = name;
		this.age = age;
		this.team = team;		
	}
	
	Constructor( Constructor ckt	)
	{	
		name = ckt.name;
		team = ckt.team;
		age = ckt.age;
		
	}
	
	public String perint()
	{
		return ("This is "+ this.name + " of " + this.team);
	}
	
	public static void main(String []args) {
		Constructor Crickter1 = new Constructor();
		Constructor Crickter2 = new Constructor("Sachin", "India", 24);
		Constructor Crickter3 = new Constructor(Crickter2);
		
		System.out.println(Crickter2.perint());
		System.out.println(Crickter3.perint());
		Crickter1.name = "Virrat";
		Crickter1.team = "India";
		Crickter3.age = 25;
		
		System.out.println(Crickter1.perint());
	}
	
}
