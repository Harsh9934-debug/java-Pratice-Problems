class A{
    int x=100;
    void display(){
    System.out.println("x="+x);}}
    
    class B extends A{
    int y=200;
    void display(){
    System.out.println("x="+x);
    System.out.println("y="+y);}}
    
    class C extends B{
    int z=200;
    void display(){
    System.out.println("x="+x);
    System.out.println("y="+y);
    System.out.println("z="+z);}}
    
    class ABCDemo{
    public static void main(String args[]){
    A a=new A();
    B b=new B();
    C  c=new C();
    System.out.println("From Class A:");
    a.display();
    System.out.println("From Class B:");
    b.display();
    System.out.println("From Class C:");
    c.display();
}}
        