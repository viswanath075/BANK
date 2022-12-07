class P11
{

int a;
int b;

P11(int a, int b)
{
this.a =a;
this.b =b;

}



}

class C11 extends P11
{

int c;
int d;
C11(int a, int b, int c, int d)
{
super(a,b);
this.c=c;
this.d =d;

}

C11()
{

this();
}


}