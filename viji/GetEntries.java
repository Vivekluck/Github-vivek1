import java.util.*;
public class GetEntries {
	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<>();
		m.put("Vivek", 95);
		m.put("karthik", 97);
		m.put("Ramu", 100);
		m.put("Vinay", 88);
		m.put("Jothi", 96);
		m.put("Guna", 97);
		System.out.println(m);
		
		Set s=m.keySet();
		System.out.println(s);
		
		Collection c=m.values();
		System.out.println(c);
		
		Set a=m.entrySet();
		System.out.println(s);
		
		Iterator i=a.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}