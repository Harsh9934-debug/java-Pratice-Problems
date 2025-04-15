
//this is a simple program to demonstrate method overloading in Java

class a{
int add(int n1, int n2) {
    return n1 + n2;
}
int add(int n1,int n2,int n3) {
        return n1 + n2 + n3;
    }
}


public class over {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;    
        int n3 = 30;
        a objSum = new a();
        int result = objSum.add(n1, n2);
        int result2= objSum.add(n1, n2, n3);
        System.out.println(result);
        System.out.println(result2);
    }

}







//Method overloading is a feature that allows a class to have more than one method with the same name, as long as the parameter lists are different.
//This is useful when you want to perform similar operations with different types or numbers of inputs.
//In this example, we have a class 'a' with two methods named 'add'. The first method takes two integers as parameters and returns their sum, while the second method takes three integers and returns their sum.