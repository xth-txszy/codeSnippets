package stackoverflow;

/**
 * StatckOverFlow的一万种方法?
 */
public class StackOverFlowTest {
    public static void main(String[] args) {
        cycle();
    }

    /**
     * 极大循环????
     */
    private static void cycle(){
        while(true){
           Nothing n = new Nothing();
        }
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
}
