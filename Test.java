class A
{	
	void add(){
	System.out.println("A class add method");}
}
class B extends A
{
	void run(){
	System.out.println("B class add method");}

}

class C extends A
{
	
	void fan(){
	System.out.println("C class add method");}

	
}

class D extends B
{

}
class Test{
	public static void main(String[] args){
	
		A a = new C();
		B b = new C();
		C c = new C();

		//c.add : c code
		//c.run : b code
		//b.
	}
}



/*A reference A()
B reference B()
A reference B()
B referece A() wrong


with parent ref, we can call the methods that are known to parent */