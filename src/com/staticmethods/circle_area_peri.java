package com.staticmethods;

public class circle_area_peri { 
	static int  radius=5;
    double p=3.14;
    public static void area(){
        circle_area_peri obj=new circle_area_peri();
        System.out.println("area is"+ (obj.p*radius*radius));
    } 

    public static void perimeter(){
        circle_area_peri obj=new circle_area_peri();
        System.out.println("perimeter is"+(2*radius*obj.p));;
    } 
    public static void main(String[] args) {
        area();
        perimeter();
    }

}
