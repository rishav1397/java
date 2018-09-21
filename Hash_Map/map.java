import java.util.*;
class Student
{
	private int id;
	private String name;
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	int getId()
	{
		return id;
	}

}
public class map
{
	public static void main(String args[])
	{
		Map<Integer,Student> m = new HashMap<>();
		m.put(1,new Student(10,"abc"));
		m.put(2,new Student(11,"def"));
		m.put(3,new Student(12,"ijk"));
		m.put(4,new Student(13,"lmn"));
		 
		for(Map.Entry<Integer, Student> e : m.entrySet())
		{  

        int key = e.getKey();  
        Student b = e.getValue();  

        System.out.print(" Details for key "+key);  
        System.out.println(" id "+b.getId()+" name "+b.getName());   
    }    

	}
}