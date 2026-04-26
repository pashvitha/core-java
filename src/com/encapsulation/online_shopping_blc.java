package com.encapsulation;

public class online_shopping_blc { 
	private int productid;
    private String productname;
    private double price;
    private int quantity;

    public online_shopping_blc(int productid,String productname,double price,int quantity) { 
        this.productid=productid;
        this.productname=productname;
        this.price=price;
        this.quantity=quantity;

    } 

    public void setProductid(int productid){
        this.productid=productid;
    } 

    public void setProductname(String productname){
        this.productname=productname;
    } 
    public void setPrice(double price){
        this.price=price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    } 

    public int getProductid(){
        return productid;
    } 
    public String getProducctname(){
        return productname;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

}
