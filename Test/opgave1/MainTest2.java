package opgave1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest2 {

    @Test
    public void udskriv() {
        Main test = new Main();
        String res = test.udskriv(89, "ja");
        assertEquals("Godkendt 1", res);
    }

    @Test
    public void udskriv2(){
        Main test = new Main();
        String res= test.udskriv(101, "ja");
        assertEquals("Godkendt 2", res);
    }
    @Test
    public void udskriv3() {
        Main test = new Main();
        String res = test.udskriv(89, "nej");
        assertEquals("Ikke Godkendt 3", res);
    }

    @Test
    public void udskriv4(){
        Main test = new Main();
        String res= test.udskriv(101, "nej");
        assertEquals("Ikke Godkendt 4", res);
    }
    @Test
    public void udskriv5(){
        Main test = new Main();
        String res= test.udskriv(100, "hfkd");
        assertEquals("Godkendt", res);
    }

}