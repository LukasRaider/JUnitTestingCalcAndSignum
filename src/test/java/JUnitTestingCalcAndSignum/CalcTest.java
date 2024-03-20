package JUnitTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    Calc calc;
    @BeforeEach
    void setUp(){
        Calc calc = new Calc();
    }
    @Test
    void sectiDveKladna(){
        Calc calc = new Calc();
        int actual = calc.Secti(10,5);
        assertEquals(15,actual);
    }
    @Test
    void sectiKladneZaporne(){
        Calc calc = new Calc();
        int actual = calc.Secti(10,-5);
        assertEquals(5,actual);
    }
    @Test
    void sectiZaporneKladne(){
        Calc calc = new Calc();
        int actual = calc.Secti(-10,5);
        assertEquals(-5,actual);
    }
    @Test
    void sectiDveZaporna(){
        Calc calc = new Calc();
        int actual = calc.Secti(-2,-5);
        assertEquals(-7,actual);
    }
    @Test
    void sectiDveNuly(){
        Calc calc = new Calc();
        assertEquals(0, calc.Secti(0,0));
    }
    @Test
    void odectiDveKladna(){
        Calc calc = new Calc();
        assertEquals(2,calc.Odecti(5,3));
    }
    @Test
    void odectiKladneZaporne(){
        Calc calc = new Calc();
        assertEquals(8,calc.Odecti(5,-3));
    }
    @Test
    void odectiZaporneKladne(){
        Calc calc = new Calc();
        assertEquals(-8,calc.Odecti(-5,3));
    }
    @Test
    void odectiDveZaporne(){
        Calc calc = new Calc();
        assertEquals(-2,calc.Odecti(-5,-3));
    }
    @Test
    void odectiDveNuly(){
        Calc calc = new Calc();
        assertEquals(0,calc.Odecti(0,0));
    }
    @Test
    void nasobitDveKladna(){
        Calc calc = new Calc();
        assertEquals(50,calc.Nasobit(10,5));
    }
    @Test
    void nasobitKladneZaporne(){
        Calc calc = new Calc();
        assertEquals(-50,calc.Nasobit(10,-5));
    }
    @Test
    void nasobitZaporneKladne(){
        Calc calc = new Calc();
        assertEquals(-50,calc.Nasobit(-10,5));
    }
    @Test
    void nasobitDveZaporna(){
        Calc calc = new Calc();
        assertEquals(10,calc.Nasobit(-2,-5));
    }
    @Test
    void nasobitDveNuly(){
        Calc calc = new Calc();
        assertEquals(0, calc.Nasobit(0,0));
    }
    @Test
    void delitDveKladna(){
        Calc calc = new Calc();
        assertEquals(2,calc.Delit(10,5));
    }
    @Test
    void delitKladneZaporne(){
        Calc calc = new Calc();
        assertEquals(-2,calc.Delit(10,-5));
    }
    @Test
    void delitZaporneKladne(){
        Calc calc = new Calc();
        assertEquals(-2,calc.Delit(-10,5));
    }
    @Test
    void delitDveZaporna(){
        Calc calc = new Calc();
        assertEquals(2,calc.Delit(-10,-5));
    }

}