package adapter;
/*
*
*
* */
public class MyMath implements IMath {
    Third third = new Third();
    @Override
    public int add(int a, int b) {
        //非常复杂的逻辑
        System.out.println(66666);
        System.out.println(a+b);
        return third.addFun(a,b);
    }
}
