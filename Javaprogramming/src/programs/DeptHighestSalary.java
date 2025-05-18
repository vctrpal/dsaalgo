package programs;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeptHighestSalary {

	public static void main(String[] args) {
		
		List<Employee> listEmployee = Stream.of(
				new Employee(1,"Raju","Dev",8000.0),
				new Employee(2,"Ramu","Dev",9000.0),
				new Employee(3,"Rakhal","Test",8000.0),
				new Employee(4,"Ratan","admin",11000.0),
				new Employee(5,"Rahin","admin",10000.0)				
				).collect(Collectors.toList());
		
		/*System.out.println(
				listEmployee.stream().collect(
						Collectors.groupingBy(Employee::getDept,
								Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)														
								)));*/
		
		listEmployee.stream().collect(Collectors.groupingBy(Employee))

	}

}
