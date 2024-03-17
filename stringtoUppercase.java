
//QUESTION 1

package TASK_5;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class stringtoUppercase {
public static void main(String[] args) {
	Stream <String>names = Stream.of("aBc","d","ef");
	
//	Function<String,String>fun = new Function<String,String>()
//			{
//				public String apply(String str)
//				{
//					return str.toUpperCase();
//				}
//			};
	//Stream <String> s1 =names.map(fun);
	
	// Here we are performing a logic (i.e) converting the String to Uppercase
	// Since we are Performing a logic on the stream we used Map() and providing a logic to it
	// map internally calls Function interface, Thus we can use either lambda expression or implement the Function
	Stream <String> s1 =names.map(str -> str.toUpperCase());		
	s1.forEach(str -> System.out.print(str +" ")); 
	
	
}
}
//OUTPUT
/* ABC D EF  */
