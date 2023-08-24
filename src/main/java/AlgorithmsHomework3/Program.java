package AlgorithmsHomework3;

public class Program {
    public static void main(String[] args) {
        Employee employee1 = new Employee("CCC", 40);
        Employee employee2 = new Employee("MMM", 38);

        LinkedList<Employee> employeeLinkedList = new LinkedList<>();
        employeeLinkedList.addFirst(new Employee("AAA", 21));
        employeeLinkedList.addFirst(new Employee("BBB", 33));
        employeeLinkedList.addFirst(new Employee("DDD", 33));
        employeeLinkedList.addFirst(new Employee("EEE", 33));
        employeeLinkedList.addFirst(new Employee("MMMMMM", 33));
        employeeLinkedList.addFirst(new Employee("AAA", 32));
        employeeLinkedList.addFirst(employee1);
        employeeLinkedList.addFirst(employee2);
        System.out.println(employeeLinkedList);
        System.out.println();
//        boolean res = employeeLinkedList.contains(employee1);
//        employeeLinkedList.sort(new EmployeeNameComparator(SortType.Ascending));
//        System.out.println(employeeLinkedList);
//        System.out.println();
//        employeeLinkedList.sort(new EmployeeNameComparator(SortType.Descending));
//        System.out.println(employeeLinkedList);
//        System.out.println();
        employeeLinkedList.rotate(employeeLinkedList);
        System.out.println(employeeLinkedList);
        System.out.println();
    }
}
