interface Sum {
    int x = 100; // Constant variable
    void sum();  // Abstract method
}

interface Add {
    int y = 200; // Constant variable
    void add();  // Abstract method
}

class A1 implements Add, Sum {
    // Implementation of the sum() method from the Sum interface
    public void sum() {
        System.out.println("Value of x: " + x);
    }

    // Implementation of the add() method from the Add interface
    public void add() {
        System.out.println("Value of y: " + y);
    }
}

class InterfaceDemo {
    public static void main(String args[]) {
        A1 a = new A1();
        a.add(); // Calls the add() method
        a.sum(); // Calls the sum() method
    }
}