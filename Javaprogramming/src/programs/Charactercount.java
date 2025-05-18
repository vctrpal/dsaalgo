package programs;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Charactercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "victorpalv";
		System.out.println(Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

	}

}
