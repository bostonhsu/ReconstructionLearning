package cn.windssoft.junit;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/6/9.
 */
public class MathTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testFactorial() throws Exception {
        assertEquals(120, new Math().factorial(5));
    }

}