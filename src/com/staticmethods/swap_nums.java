package com.staticmethods;

public class swap_nums { 
	static int x=10;
    static int y=20;

    public static void swap(){
        int a=x;
        x=y;
        y=a;
        System.out.println("num are "+x+" "+y);
    }
    public static void main(String[] args) {
        swap();
    }

}
