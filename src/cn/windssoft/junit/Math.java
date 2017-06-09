package cn.windssoft.junit;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Math {
    public int factorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("less than zero.");
        } else if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
