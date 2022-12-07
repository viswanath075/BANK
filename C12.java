class C12
{

int a;
int b;
int c;

C12()
{
System.out.println("no arg is constr");
}


C12(int a)
{
this();
this.a =a;
System.out.println("single arg constr");
}

C12(int a, int b)
{

this(a);
this.b=b;
System.out.println("two arg constr");

}


public static void main(String [] ars)
{
C12 c = new C12(1,2);

}

}
