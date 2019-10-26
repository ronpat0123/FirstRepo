import java.util.ArrayList;
import java.util.HashSet;

public class Test {
	
	
	//write a method takes an array list of numbers and return wheather a list is unique or not
	
	
	
	public static ArrayList<Integer> uniqueList(ArrayList<Integer> numbers) {
		HashSet<Integer> hSetNumbers = new HashSet<Integer>(numbers);
		ArrayList<Integer> uniquenum = new ArrayList<Integer>();
		for(Integer strNumber : hSetNumbers) {
			uniquenum.add(strNumber);
            //System.out.println(strNumber);
    }
		
		return uniquenum;
	}
	
	
	public static void main(String []arg) {
		
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(5);
		test.add(2);
		test.add(5);
		test.add(4);
		
		for(Integer num:test) {
			System.out.println(num);
		}
		
		ArrayList<Integer> numbers = uniqueList(test);
		System.out.println(numbers);
		
	}

}
