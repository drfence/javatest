
import java.util.*;

public class Test
{

	public Test()
	{
		Thingy a = new Thingy("a"); 
		Thingy b = new Thingy("b"); 
		Thingy c = new Thingy("c");


		Map<Integer, Thingy> map = new HashMap<Integer, Thingy>();
		map.put(1, a);
		map.put(2, b);
		map.put(3, c);

		System.out.println("get = " + map.get(1));
		System.out.println("get = " + map.get(2));
		System.out.println("get = " + map.get(3));
	}

	class Thingy {
    private final String name;

    public Thingy(String name) {
         this.name = name;
    }

    public int hashcode() {
       //not the worlds best idea
       return 1;
    }

		public boolean Equals(Object o) {
			return false;	
		}

		public String toString() { return name; };
	}


	public static void main(String argv[])
	{
		Test t = new Test();
	}
}

