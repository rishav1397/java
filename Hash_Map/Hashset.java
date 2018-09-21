import java.util.HashSet;

public class Hashset{

	public static void main(String a[]){
		HashSet<Integer> h1 = new HashSet<>();
		for(int i = 0; i < 5; i++)
		{
			h1.add(i * 10);
		}
		System.out.println("First Set");
		System.out.println(h1);
		HashSet<Integer> h2 = new HashSet<>();
		for(int i = 3; i < 6; i++)
		{
			h2.add(i * 10);
		}		
		System.out.println("Second Set");
		System.out.println(h2);

		h1.retainAll(h2);
		System.out.println("Retaining values");
		System.out.println(h1);
	}
}