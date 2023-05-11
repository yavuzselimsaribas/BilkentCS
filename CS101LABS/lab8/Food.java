public class Food {
    String name;
    String ingredients;
    int caloriesPerProduct;
    String type;
    double price;
    public Food(String aName, double aPrice){
        name = aName;
        price = aPrice;
        this.ingredients = null;
        this.type = null;
        this.caloriesPerProduct =0;        

    }
    public Food(String aName,String theIngredients,int calorieNum,String aType,double aPrice){
        name = aName;
        ingredients = theIngredients;
        caloriesPerProduct = calorieNum;
        type = aType;
        price = aPrice;
    }

    //setters

    public void setIngredients(String anIngredients){this.ingredients = anIngredients;}
    public void setCalories(int n){this.caloriesPerProduct = n;}
    public void setType(String aType){this.type = aType;}
    public void setName(String aName){this.name = aName;}
    public void setPrice(double aPrice){this.price= aPrice;}

    
    //getters
    public String getName(){return this.name;}
    public double getPrice(){return this.price;}
    public String getType(){return this.type;}
    public int getCalories(){return this.caloriesPerProduct;}
    public String getIngredients(){return this.ingredients;}

    //Other Methods

    public boolean equals(Food food){
        if(this.name.equals(food.getName())&& this.ingredients.equals(food.getIngredients())){
            return true;
        }else{return false;}
    }
    public void addNewIngredients(String newIngredient)
    {
        this.ingredients +=", " + newIngredient;
    }
    public boolean doesContain(String ingredient)
    {
        if(this.ingredients.contains(ingredient)){
            return true;
        }else{return false;}        
    }

    public String toString()
    {
        return "*".repeat(30)+"\n"
        +this.name+" is a "+this.type+" dish."+"\n"
        +"It includes "+this.ingredients+".\n"+
        "Single portion contains "+this.caloriesPerProduct+" calories.\n"+
        "Single serving cost = "+this.price+"\n";

    }

    
    
}
