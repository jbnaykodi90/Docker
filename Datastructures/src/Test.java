import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    static class Employee{
        int id;
        String name;
        String designation;

        public Employee(int id, String name, String designation) {
            this.id = id;
            this.name = name;
            this.designation = designation;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", designation='" + designation + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        /*Employee e1 = new Employee(1,"A","Manager");
        Employee e1 = new Employee(2,"B","Lead");
        Employee e1 = new Employee(3,"C","Lead");
        Employee e1 = new Employee(4,"D","Manager");
        Employee e1 = new Employee(5,"E","Director");*/

        List<Employee> employeeList = Arrays.asList(new Employee(1, "A", "Manager"), new Employee(2, "B", "Lead"), new Employee(3, "C", "Lead"),new Employee(4,"D","Manager"),new Employee(5,"E","Director"));
        //employeeList.forEach(System.out::println);
        Map<String,Long> map =  employeeList.stream().collect(Collectors.groupingBy(emp -> emp.designation,Collectors.counting()));
        //System.out.println(map);


        List<String> strList = Arrays.asList("AA","BB","CC","BB");
        List<Integer> intList = Arrays.asList(3,6,2,9,1);

        System.out.println(intList.stream().max(Integer::compare).get());
        System.out.println(intList.stream().min(Integer::compare).get());
        //System.out.println(intList.stream().sorted(Comparator.reverseOrder().skip(1).findFirst().get());

        /*List<Integer> intList = Arrays.asList(3,6,2,9,1);
        List<Integer> intList1 = Arrays.asList(4,6,7,9,8);*/

        //intList.stream().filter(n -> intList1.stream().anyMatch(n1 -> n == n1)).sorted().;

        //intList.stream().sorted((a,b) -> b.compareTo(a)).forEach(n -> System.out.print(n + " "));
        //System.out.println(intList.stream().min(Integer::compareTo).get());
        //System.out.println(intList.stream().findAny().get());

        //System.out.println(intList.stream().reduce((a,b)-> a+b).get());
        //System.out.println(intList.stream().distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Illegal")));

        /*        String str = "abcdabciiillsh";
        Map<String,Long> map =  Arrays.stream(str.split("")).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);*/

/*        System.out.println(Arrays.toString("abcdabciiillsh".split("")));
        List<String> strList = Arrays.asList("AA","BB","CC","BB");
        Map<String,Long> map = strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);*/
/*
        List<Integer> list = Arrays.asList(1,5,8,9,23,16);
        list.stream().max(Integer::compareTo).ifPresent(System.out::println);*/

        //int arr1[] = {3,6,2,9,1};
        /*int arr2[] = {4,6,7,9,8};
        Arrays.stream(arr1).filter(n -> Arrays.stream(arr2).anyMatch(n2 -> n == n2)).boxed().forEach(System.out::println);*/

        //Integer arr2[] = IntStream.rangeClosed(1,arr1.length).mapToObj(n -> arr1[arr1.length-n]).map(Integer::parseInt).toArray();
        //System.out.println(arr2);

        int arr1[] = {3,6,2,9,1};
        int arr2[] = {4,6,7,9,8};
        Arrays.stream(arr1).filter(n -> Arrays.stream(arr2).anyMatch(n2 -> n== n2)).boxed().forEach(System.out::println);

    }
}
