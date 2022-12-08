package com.example.lab3;

public class Test
{
   private int x;
   private boolean y;

   Test(int x, boolean y) {
       this.x = x;
       this.y = y;
   }

    public int getX() {
        System.out.println(this.x);
        return x;

    }

    public boolean isY() {
        return y;
    }

    public static void main(String[] args) {
        Test myTest = new Test(10,true);
        myTest.getX();
        myTest.isY();
    }


}