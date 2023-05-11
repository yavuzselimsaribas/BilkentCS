import java.util.Scanner;
    public class Main {


        public static void main(String[] args) {
    
            String choice = "";
    
    
            while ( !choice.equals("3")) {
    
                Scanner input = new Scanner(System.in);
                displayMenu();
                System.out.println("Enter choice: ");
    
                choice = input.nextLine();
    
                if(choice.equals("1")){
    
                    System.out.println("Enter credit card number to validate:");
                    long ccnuminput = input.nextLong();
                    System.out.println(isValidCard(ccnuminput));
    
    
                }
                else if(choice.equals("2")){
                    System.out.println( "Sample valid credit card:"+generateValidCard());
                }else{
                    System.out.println("Invalid choice - try again");
                }

                input.close();
            }

            
    
        }
        /**reversenumber
         * reverse digits of number
         * @param long number
         * @return long reversed number
         */
        public static long reversenumber(long num) {
    
            long reversed = 0;
            while (num != 0) {
    
                long digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
    
            }
            return reversed;
        }
    
        /**sumDigits
         * Sum all digits of number
         * @param   digit and lenght of digit int
         * @return long sum of digits
         */
        public static long sumDigits(long digit, int length) {
            long sum = 0;
            long digits = 0;
    
    
            for (int i = 0; i < length; i++) {
                String digitstr = String.valueOf(digit);
                digits = digitstr.charAt(i);
                digits = digits - 48;
    
                /*                           //when i try to do without string, because of the digits come in reverse order
                while (digit > 0) {          // i couldn't find a way.I tried reverse the input number and i tried solve with
                    digits = (digit % 10);   //  is last digit odd or even in order but still get wrong results.
                    digit = digit / 10;
                }
                */
                if (i % 2 == 0) {
                        digits *= 2;
                        if (digits > 9) {
                            digits = digits - 9;
                        }
                        sum = digits + sum;
                    }
    
    
            }
            return sum;
        }
    
    
        /**isValidCard
         * Check if a number obey the luhn algorithm
         * @param ccnum positive long
         * @return boolean
         */
        public static boolean isValidCard(long ccnum){
    
            long sum = 0;
            long ccnumReversed;
            int lastdigit;
    
            sum = sum + (ccnum % 10);
    
            String ccnumStr = String.valueOf(ccnum);
            lastdigit = (ccnumStr.charAt(ccnumStr.length()-1)) - 48 ;
            ccnumStr = ccnumStr.substring(0,(ccnumStr.length() - 1));
    
            ccnum = Long.parseLong(ccnumStr);
            ccnumReversed = reversenumber(ccnum);
            sum = sumDigits(ccnumReversed,ccnumStr.length());
    
    
            if ((sum * 9) % 10 == lastdigit){
                return true;
            }else{
                return false;
            }
        }
        /**generateValidCard
         * Generate a valid credit card number
         * @param no parameter
         * @return long credit card number
         */
        public static long generateValidCard(){
            // define the range
            long max = 9999999999999999L;
            long min = 100000000000000L;
            long range = max - min + 1;
            long randomnum;
    
            // generate random numbers within 1 to 10
    
            do {
                 randomnum = (long) (Math.random() * range) + min;
    
            }while(!isValidCard(randomnum));
    
    
            return randomnum;
        }
        /**displayMenu
         * Displaying menu
         * @param no param
         */
        public static void displayMenu(){
            System.out.println("---------------MENU---------------\n" +
                    "1 - Validate Credit Card Number\n" +
                    "2 - Generate Valid Credit Card Number\n" +
                    "3 - Exit");
        }
        /**isValidCard
         * count the digits of number
         * @param num positive int
         * @return count int
         */
        public static int countDigits(long num) {
            int count = 0;
            while (num != 0) {
                num = num / 10;
                ++count;
            }
            return count;
        }

      
    
    
    }
    
    

