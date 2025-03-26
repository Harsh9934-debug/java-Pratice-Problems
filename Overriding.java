import java.lang.*;

class Parent
{
    int x = 100;
    void show()
    {
        System.out.println("x=" + x);
    }
}

class Child extends Parent 
{
    int x = 200;
    void show()
    {
        System.out.println("x=" + x);
    }
}

class Overriding
{
    public static void main(String args[])
    {
        Parent obj1 = new Parent();
        System.out.println("From Parent Class:");
        obj1.show();
        Parent obj2 = new Child();
        System.out.println("From Child Class:");
        obj2.show();
    }
}