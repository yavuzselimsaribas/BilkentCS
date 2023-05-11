//@author Yavuz Selim Sarıbaş
// BlackJack21
import java.util.Scanner;
import java.util.Random;



public class Lab05_Q2 {
    
    public static void main(String[] args)
    {
             
        Scanner in = new Scanner(System.in);
        // Construct a card deck with a string 
        String deck = "";
        System.out.println("Starting the game with the following deck:");
        for(int i=1; i<= 9 ; i++){
            for(int j =1 ; j<= 4 ; j++ ){
                
              deck = deck.concat(Integer.toString(i));
              
                            
            }
            
        }
        System.out.println(deck); 
        //System.out.printf("Dealer is now dealing cards...\nPlayer's hand:\n%s\nDealer's hand:\n%s",deck,deck);
        //deal the cards save into strings
        String player,dealer ="";
        player ="";
        
    

        Random rand = new Random();
        int deckIndex = 0;
        int randomChoice;

        
        for(int i= 0; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
                randomChoice = rand.nextInt(35-deckIndex);
                if (j == 0){
                 player = player.concat(deck.substring(randomChoice,randomChoice+1));
                 deck = deck.substring(0,randomChoice)+deck.substring(randomChoice+1,deck.length());
                 deckIndex++;
               }
               else if (j == 1){
                dealer = dealer.concat(deck.substring(randomChoice,randomChoice+1));
                deck = deck.substring(0,randomChoice)+deck.substring(randomChoice+1,deck.length());
                deckIndex++;                 
               }
                


            }          
        }
        
    
        String secretDealers = dealer.charAt(0) + "?";
        System.out.println("Dealer is now dealing cards...");
        System.out.printf("Player's hand:\n%s\nDealer's hand:\n%s\n",player,secretDealers);

        // Player's turn 
                
        
        
        
        int choice;
        int i = 2;
        int sumplayer = Character.getNumericValue(player.charAt(0))+Character.getNumericValue(player.charAt(1)); 
             
         
        
            System.out.println("Please enter your choice:");
            System.out.println("1) Hit");
            System.out.println("2) Stand");
            choice = in.nextInt();
            int breakLoop = 4;

            

                do{
                    if(choice == 2){

                        System.out.printf("Stand! Player's turn is now over. Player's hand sums to %d.\n",sumplayer);                
                        i++;
                        breakLoop++;
                    }else if(choice == 1){
                        randomChoice = rand.nextInt(35-deckIndex);
                        player = player.concat(deck.substring(randomChoice,randomChoice+1));
                    
                        deck = deck.substring(0,randomChoice)+deck.substring(randomChoice+1,deck.length());
                        deckIndex++;
    
                        System.out.printf("Hit! Dealer is giving the player a card...\nPlayer's hand:\n%s\n",player);
                        sumplayer = sumplayer + Character.getNumericValue(player.charAt(i));
                        i++;
                        if (sumplayer == 21){
                            System.out.println("Player scored 21. Player wins!");
                            choice = 3;
                            System.out.printf("\nEnding the game with the following deck:\n%s",deck);
                        }
                        else if (sumplayer > 21){
                            System.out.println("Player scored over 21. Player lost!");
                            System.out.printf("\nEnding the game with the following deck:\n%s",deck);
                            choice = 3;
                        
                        }
                        if (sumplayer < 21){
                            System.out.println("Please enter your choice:");
                            System.out.println("1) Hit");
                            System.out.println("2) Stand");
                            choice = in.nextInt();
                        
                        }



                   }
                    
                    
                }while (choice == 1  || choice == 2 && breakLoop == 4);




            
            
            
                

            

            int sumdealer = Character.getNumericValue(dealer.charAt(0))+Character.getNumericValue(dealer.charAt(1));
            if (choice == 2)
            {
                System.out.println("Dealer is drawing cards...");
                if (sumplayer< sumdealer){
                    System.out.println("Dealer scored more than player. Dealer wins!");
                }
                int k = 2;
                do{
                    randomChoice = rand.nextInt(35-deckIndex);
                    dealer = dealer.concat(deck.substring(randomChoice,randomChoice+1));
                    
                    deck = deck.substring(0,randomChoice)+deck.substring(randomChoice+1,deck.length());
                    deckIndex++;    
                    System.out.printf("\nDealer's hand:\n%s",dealer);
                    sumdealer = sumdealer + Character.getNumericValue(dealer.charAt(k));
                    k++;
                
                    if( sumplayer < sumdealer && sumdealer < 21){
                        System.out.printf("\nDealer scored more than player. Dealer wins!");
                        System.out.printf("\n\nEnding the game with the following deck:\n%s",deck);
                    }
                     if (sumdealer == 21){
                        System.out.printf("\nDealer scored 21. Dealer wins!"); 
                        System.out.printf("\n\nEnding the game with the following deck:\n%s",deck);                   
                    }
                    if (sumdealer > 21){
                        
                        System.out.printf("\nDealer scored over 21. Dealer lost!");
                        System.out.printf("\n\nEnding the game with the following deck:\n%s",deck);
                    }
                }while (sumdealer <= sumplayer);


                
            }
                        
            
                      


            
             
            
                   
            

        
                  
            


        


        in.close();



        }

    

    
}
