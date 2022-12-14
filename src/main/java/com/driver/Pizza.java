package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private  int extraCheesePrice;
    private int extraToppingsPrice;
    private int takeAwayPrice;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isCheeseAdded=false;
        this.extraCheesePrice=80;
        this.takeAwayPrice=20;
        this.isToppingAdded=false;
        this.isTakeAwayAdded=false;
        this.isBillGenerated=false;
        if(isVeg){
            this.price=300;
            this.extraToppingsPrice=70;
        }
        else{
            this.price=400;
            this.extraToppingsPrice=120;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price=this.price+this.extraCheesePrice;
            isCheeseAdded=true;  //  I dont want to added repeatedly
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false){
            this.price=this.price+this.extraToppingsPrice;
            isToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            this.price=this.price+this.takeAwayPrice;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false) {
            if (isCheeseAdded) {
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }
            if (isToppingAdded) {
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
            }
            if (isTakeAwayAdded) {
                this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
            }
            this.bill=this.bill + "Total Price: " + this.price + "\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}
