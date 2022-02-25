package opgave2;

import org.junit.Test;

import javax.crypto.MacSpi;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void mindsteTalAfTo() {
        Main test = new Main();
        int res = test.mindsteTalAfTo(3, 1);
        assertEquals(1, res);
    }
    @Test
    public void mindsteTalAfTo2() {
        Main test = new Main();
        int res = test.mindsteTalAfTo(2, 3);
        assertEquals(2, res);

    }
    @Test
    public void mindsteTalAfTo3() {
        Main test = new Main();
        int res = test.mindsteTalAfTo(3, 3);
        assertEquals(3, res);

    }

    @Test
    public void størsteTalAfTo() {
        Main test = new Main();
        int res = test.størsteTalAfTo(2, 4);
        assertEquals(4,res);
    }
    @Test
    public void størsteTalAfTo2() {
        Main test = new Main();
        int res = test.størsteTalAfTo(7, 5);
        assertEquals(7,res);
    }
    @Test
    public void størsteTalAfTo3() {
        Main test = new Main();
        int res = test.størsteTalAfTo(30, 30);
        assertEquals(30,res);
    }

    @Test
    public void mindsteAfTreTal() {
        Main test = new Main();
        int res = test.mindsteAfTreTal(5, 10, 15);
        assertEquals(5, res);
    }
    @Test
    public void mindsteAfTreTal1() {
        Main test = new Main();
        int res = test.mindsteAfTreTal(5, 10, 15);
        assertEquals(5, res);
    }
    @Test
    public void mindsteAfTreTal2() {
        Main test = new Main();
        int res = test.mindsteAfTreTal(5, 1, 15);
        assertEquals(1, res);
    }
    @Test
    public void mindsteAfTreTal3() {
        Main test = new Main();
        int res = test.mindsteAfTreTal(5, 10, 1);
        assertEquals(1, res);
    }

    @Test
    public void størsteAfTreTal() {
        Main test = new Main();
        int res = test.størsteAfTreTal(10, 2, 3);
        assertEquals(10, res);
    }
    @Test
    public void størsteAfTreTal1() {
        Main test = new Main();
        int res = test.størsteAfTreTal(1, 20, 3);
        assertEquals(20, res);
    }
    @Test
    public void størsteAfTreTal2() {
        Main test = new Main();
        int res = test.størsteAfTreTal(1, 2, 30);
        assertEquals(30, res);
    }

    @Test
    public void mindsteTalAfArray() {
        Main test = new Main();
        //int [] tabel = new int[30];
        int[] tabel = {1,23,56,25};
        int res = test.mindsteTalAfArray(tabel, 4);
        assertEquals(1, res);
    }
    @Test
    public void mindsteTalAfArray2() {
        Main test = new Main();
        //int [] tabel = new int[30];
        int[] tabel = {10,2,56,25};
        int res = test.mindsteTalAfArray(tabel, 4);
        assertEquals(2, res);
    }/* @Test
    public void mindsteTalAfArray3() {
        Main test = new Main();
        //int [] tabel = new int[30];
        int[] tabel = {10,23,5,25};
        int res = test.mindsteTalAfArray(tabel, 4);
        assertEquals(5, res);
    } */@Test
    public void mindsteTalAfArray4() {
        Main test = new Main();
        //int [] tabel = new int[30];
        int[] tabel = {10,23,56,2};
        int res = test.mindsteTalAfArray(tabel, 4);
        assertEquals(2, res);
    }
//________________________________________________________________
    @Test
    public void starsteTalIArray() {
        Main test = new Main();
        int[] tabel = {100,23,56,25};
        int res = test.starsteTalIArray(tabel, 4);
        assertEquals(100, res);
    }

    @Test
    public void starsteTalIArray1() {
        Main test = new Main();
        int[] tabel = {41,230,56,2};
        int res = test.starsteTalIArray(tabel, 4);
        assertEquals(230, res);
    }

    @Test
    public void starsteTalIArray2() {
        Main test = new Main();
        int[] tabel = {14,2,56,25};
        int res = test.starsteTalIArray(tabel, 4);
        assertEquals(56, res);
    }
//_________________________________________________________________________

    @Test
    public void sumAfArray() {
        Main test = new Main();
        int[] tabel = {2, 7, 8, 6};
        int res = test.sumAfArray(tabel, 4);
        assertEquals(23, res);
    }

    @Test
    public void snitAfArray() {
        Main test = new Main();
        int[] tabel = {5, 10, 3, 2};
        double res = test.snitAfArray(tabel, 4);
        assertEquals(5, res,0.000);
        // Man skal bruge en delta-value når man skal have long eller double

    }
}