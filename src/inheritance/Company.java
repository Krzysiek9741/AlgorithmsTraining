package inheritance;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 23, 2300);
        Employee employee2 = new Employee("Andrew", 33, 3500);
        Employee employee3 = new Employee("Dorothy", 30, 2300);
        Employee employee4 = new Employee("Jim", 29, 3000);
        Employee employee5 = new Employee("Anna", 40, 3200);
        Employee employee6 = new Employee("Mike", 27, 2950);

        Manager manager1 = new Manager("Frank", 45, 5500);
        Manager manager2 = new Manager("Peter", 47, 6200);

        manager1.addSubordinate(employee1);
        manager1.addSubordinate(employee3);
        manager1.addSubordinate(employee4);

        manager2.addSubordinate(employee2);
        manager2.addSubordinate(employee5);
        manager2.addSubordinate(employee6);

        System.out.println(employee1.getManager());

        System.out.println("--------------------------------");

        manager1.getSubordinates().stream()
                .forEach(System.out::println);
    }
}
