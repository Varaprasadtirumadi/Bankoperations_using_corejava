import java.util.*;
class A
{
	int m1()
	{
		int a=10;
		return a;
	}
	static void m2()
	{
		int a=new A().m1();
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		m2();
	}
}