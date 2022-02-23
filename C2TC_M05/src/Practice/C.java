package Practice;

class A
{
    public void showA ()
    {
        System.out.println("a class method");
        
    }
}
class B extends A
{
    public void showB ()
    {
      System.out.println("b class method");  
    }
}
class C extends B
{
    void showC ()
    {
        System.out.println("c class method");
    }
    public static void main (String[] args)
    {
        A ob1=new A();
        ob1.showA();
        
        B ob2=new B();
        ob2.showA();
        ob2.showB();
        		
        		
        C ob3=new C();
        ob3.showA ();
        ob3.showB ();
        ob3.showC ();
    }
}