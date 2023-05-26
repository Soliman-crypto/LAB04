public class Main {
    public static void main(String[] args) {
// Create some Person objects and print out their details
        Person person1 = new Person("John Doe", 30, true);
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Married: " + person1.isMarried());
        System.out.println();


        Person person2 = new Person("Jane Smith", 25, false);
        System.out.println("Person 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Married: " + person2.isMarried());
        System.out.println(); }
}
