package Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfInteger {

	public static Map<String,Integre> countFrequenequencies(){
		// TODO Auto-generated method stub
		
		List<Integer> integerList = Arrays.asList(1,2,2,3,3,3);
		
		System.out.println(integerList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		

	}
	
	
	

}
