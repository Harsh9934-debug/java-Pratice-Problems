class Employee
{
    int empId;
    String empName;
    // Parameterized constructor with two parameters
    Employee(int id, String name)
    {
        this.empId = id;
        this.empName = name;
    }
    void info()
    {
        System.out.println("EmpId: " + empId + " EmpName: " + empName);
    }
}

class EmpInfo
{
    public static void main(String args[])
    {
        Employee obj1 = new Employee(12345, "Arvind");
        Employee obj2 = new Employee(12346, "Rizwan");
        obj1.info();
        obj2.info();
    }
}