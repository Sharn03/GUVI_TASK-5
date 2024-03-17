package TASK_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class separatingStudentNames {
public static void main(String[] args) {
	//We are creating a list of Names
	List<String>names = Arrays.asList("Arjun","Chandhini","Randy","Yuvi","Bharat","Arvind","Shreya","Ajith");
	// Converting the List into Stream, that doesn't means the original object going to be changed
	// We can perform the logic via filter MEthod either by using Lambda Expression or by implementing the 
	// Predicate interface.
	Stream<String>s1 = names.stream();
	// Here we are Using Lambda Expression to reduce the lines of code for the Logic
	Stream<String>s2 = s1.filter(str -> (str.startsWith("A")));

	//filter method takes Predicate object, for that we have implement the Predicate interface
	//using Annoynomous inner class
	
//	Predicate<String>p = new Predicate<String>()
//			{
//		public boolean test(String str)
//		{
//			if(str.startsWith("A"))
//				return true;
//			else
//				return false;
//		}	
//			};
			
	//Stream<String>s2 = s1.filter(p);
	
	// Once the filter map is done we have Print the Stream using foreach method
	s2.forEach(str -> System.out.print(str + " "));
	
	}
}
