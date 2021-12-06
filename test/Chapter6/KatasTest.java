package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KatasTest {

        @Test
        public void aGradeCanBeCalculateTest() {
            Katas gradeSomething = new Katas();
            char result = gradeSomething.calculateGradeFor(92);
            assertEquals('A', result);
        }

        @Test
        public void bGradeCanBeCalculateTest() {
            Katas gradeSomething = new Katas();
            char result = gradeSomething.calculateGradeFor(87);
            assertEquals('B', result);
        }

        @Test
        public void cGradeCanBeCalculateTest() {
            Katas gradeSomething = new Katas();
            char cResult = gradeSomething.calculateGradeFor(75);
            assertEquals('C', cResult);
        }

        @Test
        public void dGradeCanBeCalculateTest() {
            Katas gradeSomething = new Katas();
            char dResult = gradeSomething.calculateGradeFor(65);
            assertEquals('D', dResult);
        }

        @Test
        public void fGradeCanBeCalculateTest() {
            Katas gradeSomething = new Katas();
            char fResult = gradeSomething.calculateGradeFor(45);
            assertEquals('F', fResult);
        }
        @Test
        public void givePriceTest1(){
            Katas priceCopy = new Katas();
            int copy = 2;
            int aAmount = priceCopy.givePrice(copy);
            assertEquals(copy*2000,aAmount);
        }
        @Test
        public void givePriceTest2(){
            Katas priceCopy = new Katas();
            int copy =6;
            int bAmount =  priceCopy.givePrice(copy);
            assertEquals(copy * 1800,bAmount);
        }
        @Test
    public void givePriceTest3(){
            Katas priceCopy = new Katas();
            int copy =20;
            int cAmount = priceCopy.givePrice(copy);
            assertEquals(copy * 1600, cAmount);
        }
        @Test
    public void givePriceTest4(){
            Katas priceCopy = new Katas();
            int copy =42;
            int dAmount = priceCopy.givePrice(copy);
            assertEquals(copy * 1500,dAmount);
        }
    @Test
    public void givePriceTest5() {
        Katas priceCopy = new Katas();
        int copy = 63;
        int eAmount = priceCopy.givePrice(copy);
        assertEquals(copy * 1300, eAmount);

    }
    @Test
    public void givePriceTest6() {
        Katas priceCopy = new Katas();
        int copy = 115;
        int fAmount = priceCopy.givePrice(copy);
        assertEquals(copy * 1200, fAmount);

    }
    @Test
    public void givePriceTest7() {
        Katas priceCopy = new Katas();
        int copy = 300;
        int gAmount = priceCopy.givePrice(copy);
        assertEquals(copy * 1100,gAmount);

    }
    @Test
    public void givePriceTest8() {
        Katas priceCopy = new Katas();
        int copy = 610;
        int hAmount = priceCopy.givePrice(copy);
        assertEquals(copy * 1000, hAmount);

    }
}
