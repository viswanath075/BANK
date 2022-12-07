class A
{
int a=3;
}

class B extends A
{
int a = 25;
int b =30;

void m1()
{
System.out.print(b + "    " + a + "    " + super.a);
}

public static void main(String[] args)
{
B b = new B();
b.m1();
}


}