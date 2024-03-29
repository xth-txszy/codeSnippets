package stackoverflow;

import java.util.Arrays;

/**
 * StatckOverFlow的一万种方法?
 */
public class StackOverFlowTest {
    public static void main(String[] args) {
        constructSelf();
    }


    /**
     * 递归
     */
    private static void recursion(int i){
        recursion(i);
    }

    /**
     * 相互调用
     */
    private static void abUse(){
        A a = new A();
    }

    /**
     * 无意识递归调用,Java 编程思想
     */
    private static void recursionString(){
        Nothing nothing = new Nothing();
        nothing.toString();
    }

    /**
     * 实际上也是递归
     * 构造方法互相调用
     */
    private static void constructSelf(){
        new C();
    }
}
