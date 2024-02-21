package Jobsheet2;

public class Dragon04 {
    int x , y, width, height;

    void moveLeft(){
        x = x-1;
    }

    void moveRight(){
        x = x+1;
    }

    void moveUp(){
        y = y-1;
    }

    void moveDown(){
        y = y+1;
    
    }

    void PrintPosition(){
        System.out.printf("(%d %d)\n", x, y);
    }


    public static void main(String[] args) {
        Dragon04 d = new Dragon04();
        d.PrintPosition();
        d.moveRight();
        d.moveDown();
    }
}