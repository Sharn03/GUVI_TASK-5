package TASK_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class printingtheNonEmptyString {
public static void main(String[] args) {
	List<String>list = Arrays.asList("abc","","bc","efg","abcd","","jkl");
	List<String>result = new LinkedList<>();
	// Here we are using the foreach loop to iterate over the list
	// with the condition stating that if the list value is empty or not
	// if the list empty the method will return false, By using the Not operator 
	// we are converting it into true and printing the value
	
	for(String list1 : list )
	{
		if(!list1.isEmpty())
			
		{
			result.add(list1);
		}
	}
	System.out.println(result);
	
	
}
}

/* OUTPUT 
  
 [abc, bc, efg, abcd, jkl]
 
 */
