package Chapter6;

public class Katas {

    public char calculateGradeFor(int score) {
        if(score>=90) return 'A';
        if(score>=80) return 'B';
        if(score>=70) return 'C';
        if(score>=60) return 'D';
        return 'F';
    }

    public int givePrice( int copy){
        if(copy <= 4) return copy * 2000;
        if (copy >4 && copy <=9) return copy * 1800;
        if (copy >9 && copy <= 29) return copy * 1600;
        if(copy > 29 && copy <= 49) return copy * 1500;
        if(copy > 49 && copy <= 99) return copy * 1300;
        if(copy > 99 && copy <= 199) return copy * 1200;
        if(copy > 199 && copy<= 499) return copy * 1100;
        return copy * 1000;
    }
}
