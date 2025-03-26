class C
{
    int p, q;
    C()
    {
        p = 10;
        q = 20;
        System.out.println("Non-Parameterized Constructor");
        System.out.println("p=" + p + "  q=" + q);
    }
    C(int x, int y) {
        p = x;
        q = y;
    }
    int add(int i, int j)
    {
        return (i + j);
    }
    int add(int i, int j, int k)
    {
        return (i + j + k);
    }
    float add(float f1, float f2)
    {
        return (f1 + f2);
    }
    void printData()
    {
        System.out.println("\nParameterized Constructor");
        System.out.println("p=" + p + "  q=" + q);
    }
}
class MCOverlaoding
{
    public static void main(String args[])
    {
        int x = 2, y = 3, z = 4;
        C c = new C();
        C c1 = new C(x, z);
        c1.printData();
        float m = 7.2F, n = 5.2F;
        int k = c.add(x, y);
        int t = c.add(x, y, z);
        float ft = c.add(m, n);
        System.out.print("Method Overloading\n");
        System.out.println("k=" + k);
        System.out.println("t=" + t);
        System.out.println("ft=" + ft);
    }
}
