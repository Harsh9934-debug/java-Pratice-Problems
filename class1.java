class sum{
    int add(int a,int b){
        return a+b;
    }
}

class subtract{
    int subtract(int a,int b){
        return a-b;
    }
}


class class1{
    public static void main(String[] args) {
        int a=1;
        int b=2;
        sum objSum = new sum();
        int result = objSum.add(a,b);
        System.out.println("The sum of " + a + " and " + b + " is: " + result);

        subtract objsub = new subtract();
        int subresult=  objsub.subtract(a,b);

        
        System.out.println("The subtraction of " + a + " and " + b + " is: " + subresult);

    }
}