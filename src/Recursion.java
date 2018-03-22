import java.util.ArrayList;
import java.util.List;

public class Recursion {

	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
	 * will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
	 * Objects are compared using their own equals method.
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List<?> unique(List<?> list) {
		if(list.size()<=1) return list;
		if(list.get(0).equals(list.get(1))) {
			list.remove(1);
			unique(list);
		}
		else unique(list.subList(1, list.size()));
		return list;
	}
	
	/**
	 * 
	 * @param value of fibonacci
	 * @return result of fibonacci
	 */
	public static long fibonacci(int value) {
		return fibonacciHelper(value,0,1);
	}
	
	/**
	 * This helper compute the value in index first then call recursive. 
	 * @param value of fibonacci.
	 * @param startIndex of fibonacci.
	 * @param nextIndex of fibonacci.
	 * @return final result of fibonacci after terminal case.
	 */
	public static long fibonacciHelper(int value,long startIndex,long nextIndex) {
		if(value==0) return 0;
		if(value==1) return nextIndex;
		return fibonacciHelper(value-1,nextIndex,startIndex+nextIndex);
	}
	
	/**
	 * Test run.
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("c");
		list.add("c");
		
		for(Object o : list) {
			System.out.print(o+", ");
		}
		System.out.println("\n==========================");
		for(Object o : unique(list)) {
			System.out.print(o+", ");
		}
		System.out.println("\n==========================");
		System.out.println(fibonacci(10));
		
	}
}
