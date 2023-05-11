public class Order {
    private static int count = 1;
    private int ID;
    private Food orderedFood;
    private double portion;
    private double totalPrice;

    public Order(double aPortion ,String foodName,double aPrice){
        this.ID =count;
        addOrder();
        this.portion = aPortion;
        orderedFood = new Food(foodName , aPrice);
        this.totalPrice = 0.0;
    }

    public Order(double aPortion, Food anOrderedFood){
        this.ID = count;
        addOrder();
        this.orderedFood = anOrderedFood;
        this.totalPrice = 0.0;
        this.portion = aPortion;

    }
    //getters
    public int getID(){return this.ID;}
    public Food getOrderedFood(){return this.orderedFood;}
    public double getPortion(){return this.portion;}
    public double getTotalPrice(){return this.totalPrice;}
    public int getCount(){return Order.count;}
    //setters
    
    public void setID(int newID){this.ID = newID;}
    public void setOrderedFood(Food newFood){this.orderedFood = newFood;}
    public void setPortion(double newPortion){this.portion = newPortion;}
    public void setTotalPrice(double aTotalPrice){this.totalPrice = aTotalPrice;}
    //other methods
    public void addOrder(){count++;}
    public boolean equals(Order order)
    {
        if(this.ID == order.getID())
        {
            return true;
        }else{return false;}
    }
    public void checkout()
    {
        this.totalPrice = this.portion * this.orderedFood.getPrice();
    }
    public void increasePortion(int extraPortion){this.portion+= extraPortion;}
    public String toString()
    {
        if(this.totalPrice== 0.0){
            return "\n"+">> Warning: This order is incomplete.\n"+
            "Details for Order "+this.ID+":\n"+
            this.orderedFood.getName()+"(x "+this.portion+")\n"+
            "TOTAL = "+this.totalPrice+"\n";

        }else
        {
            return "\n"+"Details for Order "+this.ID+":\n"+
            this.orderedFood.getName()+"(x "+this.portion+")\n"+
            "TOTAL = "+this.totalPrice+"\n";
        }
    }



    
}
