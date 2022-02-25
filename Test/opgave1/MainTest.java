package opgave1;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void f() {
        Main test = new Main();
        int res = test.f(5);
        assertEquals(1, res);
    }

    @org.junit.Test
    public void f2() {
        Main test = new Main();
        int res = test.f(8);
        assertEquals(2, res);
    }

    @org.junit.Test
    public void f3() {
        Main test = new Main();
        int res = test.f(10);
        assertEquals(3, res);
    }

    @org.junit.Test
    public void f4() {
        Main test = new Main();
        int res = test.f(27);
        assertEquals(4, res);
    }
}