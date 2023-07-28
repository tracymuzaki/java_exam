package Question4;
//(ii)
//created a class Person
public class Person {
    //declared the class attributes using private modifiers
    private int age;
    private double salary;
    //Created a constructor to initialise the class attributes
    public Person(int age, double salary){
        this.age=age;
        this.salary=salary;
    }
    //created the getter method to get the attribute values
    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
    //created the setter method to update the attribute values
    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //method to display output
    public static void main(String[] args) {
        //created an instance of the class
        Person person= new Person(23,200000.0);
        //getting the values of the class attributes
        System.out.println(person.getAge());
        System.out.println(person.getSalary());
        //setting the values of the class attributes
        person.setAge(40);
        person.setSalary(250000.0);
        //getting set values
        System.out.println("set values: " + "\n" + person.getAge() + "\n" + person.getSalary());
    }
}
