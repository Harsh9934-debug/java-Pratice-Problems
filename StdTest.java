class Student {
    String name, city;
    int age;

    void printData() {
        System.out.println("Student name = " + name);
        System.out.println("Student city = " + city);
        System.out.println("Student age = " + age);
    }
}

class StdTest {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Arun";
        s1.city = "Dehli";
        s1.age = 20;

        s2.name = "Rahul";
        s2.city = "Bengaluru";
        s2.age = 19;

        s1.printData();
        s2.printData();
    }
}