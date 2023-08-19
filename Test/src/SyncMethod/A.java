package SyncMethod;

public class A {
    synchronized void f1()
    {
        System.out.println("f1");
    }
    synchronized void f2()
    {
        System.out.println("f2");
    }
    void f3(){}
}
