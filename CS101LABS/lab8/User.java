public class User {
    //data members
    private static int count = 0;
    private int ID;
    private String name;
    private int age;
    private String orders;
    private int numberOfOrders;
    private String eatenFoods;

    public void addUser(){count++;}

    public User(String aName,int anAge){
        ID = count;
        addUser();   
        name = aName;
        age = anAge;
        numberOfOrders = 0;
        eatenFoods = "";
        orders = "";               
    }

    //getters
    public int getId(){return ID;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getOrders(){return orders;}
    public int getNumOfOrders(){return numberOfOrders;}
    public String getEatenFoods(){return eatenFoods;}
    public int getCount(){return User.count;}
    //setters
    public void setId(int anId){this.ID=anId;}
    public void setName(String aName){this.name = aName;}
    public void setAge(int newAge){this.age=newAge;}
    public void setOrders(String newOrders){this.orders=newOrders;}
    public void setNumberOfOrders(int newNumberOfOrder){this.numberOfOrders = newNumberOfOrder;}
    public void setEatenFoods(String newEaten){this.eatenFoods = newEaten;}

    public boolean equals(User user)
    {
        if(user.getId()==this.ID && user.getName()==this.name
        && user.getAge() == this.age){
            return true;
        }else{return false;}
    }
    public boolean didEat(Food food){
        if(this.getEatenFoods().contains(food.getName())){
            return true;
        }else{return false;}

    }
    public void addOrders(Order order){
        this.orders +=  "-"+ Integer.toString(order.getID()) ;
        numberOfOrders++;
        eatenFoods += order.getOrderedFood().getName() + "-"; 
    }
    public String pickOrderbyIndex(int index)
    {
        if(index == 1){return this.orders.substring(index,index+1);}
        else
        {
            index++;
            return this.orders.substring(index,index+1);
        }
    }
    public String toString()
    {
        return "User ID: "+this.ID+", User Name: "+ this.name+", Age: "+this.age;
    }
    
    
    
}
