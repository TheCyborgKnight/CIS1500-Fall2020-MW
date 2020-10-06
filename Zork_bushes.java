
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
        /*creates varaibles that will be used later on in the code
        travlerName will be used to get the players Adventure name
        
        playersBalance is used when the player buys an item it acts as a makeshift bank for the player and it will also act as the hit points to the player
        
        playerAction will be used to figure out what action the player wants to do. The player will input a 1, 2, 3, or a 4 and then that number will be used
        to let the player take there next action.
        */
        String travlerName, endGame = "playing", checkout = "shopping";
        double playersBalance;
        playersBalance = 500;
        int playerAction, clerkAction;
        // Introduction. Tells the player the stage and what the theme of this will be
        System.out.print("Hello travler! Welcome to the mystical land of Buschs Market! \n");
        System.out.println("The place you should go if you want to go to a grocery store or work there!\n");
        System.out.println("Here at Buschs Market we only have 4 aisles and all the items cost 5$. Feel free to walk around and buy as much as you want!\n");
        System.out.println("Oh also another little side note that I am suppose to tell you, \n"
                + "all the items in our store are contained in there own individual black box, meaning you won't be able to see what you are buying.\n");
        System.out.println("But in my opinion that is fine cause you don't need what you are buying all you need to know is that you should be buying!");
        
        //Ask and gets the players name. It will then ask what the player wants to do
        System.out.println("\nWhat is your name travler?");
        Scanner keyboard = new Scanner(System.in);
        travlerName = keyboard.nextLine();
        System.out.println("Hello "+ travlerName + ". What aisle would you like to go down?"
            +" There are 4 aisles in total. If you want to go to an aisle say the aisle like 1, 2, 3, or 4");
        System.out.println("While you are in our store "+ travlerName+"You should think of your money as your hp!");
        System.out.println("If you want to leave the game, go down a lane then go to checkout.");
        // aisleNumber will be used to figure out which asile the player wants to do go down
        int aisleNumber;
        aisleNumber =keyboard.nextInt();
        while(!(endGame.equalsIgnoreCase("leave")))
        {
            if(aisleNumber < 4)
            {//beginning of the exit loop
                while(!(checkout.equalsIgnoreCase("checkout")))
                    {//beginning of shopping/checkout loop
                    if (aisleNumber == 1) 
                        { //beginning of aisle one. If statement
                        System.out.println("You go down aisle one"); 
                        //Option menu 1
                        System.out.println("Would you like to do next?\n" 
                            + "1) go to a new lane \n"
                            + "2) pick up an item \n"
                            + "3) go to check out \n"
                            + "4) put item away  \n"
                            + "5) Take a nap \n"
                            + "6) Talk to a store clerk \n"
                            + "7) check balance \n"
                            + "8) leave \n"
                            + "If you need help just say a random number bigger than 8");
                        playerAction = keyboard.nextInt();
                        keyboard.nextLine();
                            // anytime the player effects the amount of money that would be in there bank account they are shown their current balance
                            switch (playerAction)
                            { // beginning of aisle one action commands. Switch statement
                                case 1:
                                    System.out.println("Which lane do you want to go down now?");
                                    aisleNumber = keyboard.nextInt();
                                    break;
                                case 2:
                                    System.out.println("You picked small box and wonder what could be inside. Maybe it is a new CPU with 16 cores and 32 threads or maybe a spoiled egg!\n");
                                    System.out.println("This small mystery box cost 5$");
                                    playersBalance = playersBalance - 5;
                                    System.out.println("Your current balance is now $" + playersBalance);
                                    break;
                                case 3:
                                    System.out.println(" You go to checkout");
                                    checkout = "checkout";
                                    break;
                                case 4:
                                    System.out.println("You put an item back");
                                    playersBalance = playersBalance + 10;
                                    System.out.println("Your current balance is now $" + playersBalance);
                                    break;
                                case 5:
                                    System.out.println("You go take a nap in the store. You rest your head on a black hole and go to sleep for -10 hours. You feel a lot better now!");
                                    playersBalance = 500;
                                    System.out.println("Your current balance is now $" + playersBalance);
                                    break;
                                case 6:
                                    System.out.println("You talk to a store cleark, there name is Eduardo what do you want them to do for you? \n"
                                            + "1) Grab you an item \n"
                                            + "2) put back an item \n"
                                            + "3) punch you \n"
                                            + "4) play super smash brother ultimate\n ");
                                    clerkAction = keyboard.nextInt();
                                    switch(clerkAction) // beginning of switch statement for clerk action 1
                                    // This switch statement is used when the player talks to a store clerk. This switch statements purpose is to give the player more options when they play
                                    {// The things that will happen to the player when they talk to the store clerk are getting an item, putting back an item, losing all there money, doing a random activity
                                        case 1:// I used a random word generator to find what you would be buying
                                            System.out.println("They got you a very long box. You think that there might be a gate inside!");
                                            playersBalance = playersBalance - 35;
                                            System.out.println("Your current balance is now $" + playersBalance);
                                            break;
                                        case 2:
                                            System.out.println("They put back an item");
                                            playersBalance = playersBalance + 35;
                                            System.out.println("Your current balance is now $" + playersBalance);
                                            break;
                                        case 3:
                                            System.out.println("They punch you and take your money. That has really got to hurt");
                                            playersBalance = 0;
                                            System.out.println("Your current balance is now $" + playersBalance);
                                            break;
                                        case 4:
                                            System.out.println("You play 100 consecutive games of smash and 3 stocked him every single game");
                                            break;
                                        default:
                                            System.out.println("They go back to what ever it was they were donig before");
                                            break;
                                    }// end of clerk switch statement 1
                                    break;
                                case 7: // prints out players current balance
                                    System.out.println("Your current balance is now $" + playersBalance);
                                    break;
                                case 8: // lets them leave the game immediately
                                    endGame = "leave";
                                    checkout = "checkout";
                                    break;
                                default:// This will act as the help statement in case the user needs help or enters in an improper number
                                    System.out.println("lane one Sorry you didn't enter in a proper command! Please try again");
                                    //Option help menu 1
                                    System.out.println("Would you like to do next?\n"
                                        + "1) go to a new lane \n"
                                        + "2) pick up an item \n"
                                        + "3) go to check out \n"
                                        + "4) put item away  \n"
                                        + "5) Take a nap \n"
                                        + "6) Talk to a store clerk \n"
                                        + "7) check balance \n"
                                        + "8) leave \n"
                                        + "If you need help just say a random number bigger than 8");
                                    playerAction = keyboard.nextInt();
                                    break;
                            }//end of aisle one's actions. Switch statment
                        }//end of aisle one. If statement
                    
                    else if (aisleNumber == 2)
                        { //beginning of aisle two. If statement
                        System.out.println("You go down aisle two");
                        //Option help menu 2
                        System.out.println("Would you like to do next?\n"
                            + "1) go to a new lane \n"
                            + "2) pick up an item \n"
                            + "3) go to check out \n"
                            + "4) put item away  \n"
                            + "5) Take a nap \n"
                            + "6) Talk to a store clerk \n"
                            + "7) check balance \n"
                            + "8) leave \n"
                            + "If you need help just say a random number bigger than 8");
                        playerAction = keyboard.nextInt();
                            // anytime the player effects the amount of money that would be in there bank account they are shown their current balance
                            switch (playerAction)
                            {// beginning of aisle two action commands. Switch statement
                                case 1:
                                    System.out.println("Which lane do you want to go down now?");
                                    aisleNumber = keyboard.nextInt();
                                    break;
                                case 2:
                                    System.out.println("You picked up a very small box and you think that there is nothing in it at all");
                                    playersBalance = playersBalance - 100;
                                    System.out.println("Your current balance is now $" + playersBalance);
                                    break;
                                case 3:
                                    System.out.println(" You go to checkout");
                                    checkout = "checkout";
                                    break;
                                case 4:
                                    System.out.println("You put an item back");
                                    playersBalance = playersBalance + 100;
                                    System.out.println("Your current balance is now $" + playersBalance);
                                    break;
                                case 5:
                                    System.out.println("You go take a nap in the store. You rest your head on a government and go to sleep for 206920 hours (not including leap years). You feel a lot better now!");
                                    playersBalance = 500;
                                    System.out.println("Your current balance is now $" + playersBalance);
                                case 6: // Starts the store clerk interaction. This will prompt the player to do an action involving a store clerk
                                    System.out.println("You talk to a store clerk, there name is Danielle what do you want them to do for you? \n"
                                            + "1) Grab you an item \n"
                                            + "2) put back an item \n"
                                            + "3) Kick You \n"
                                            + "4) Play Volleyball with you \n ");
                                    clerkAction = keyboard.nextInt();
                                    switch(clerkAction) // This switch statement is used when the player talks to a store clerk. This switch statements purpose is to give the player more options when they play
                                    {// begining of clerkAction switch statement 2
                                        // The things that will happen to the player when they talk to the store clerk are getting an item, putting back an item, losing all there money, doing a random activity
                                        case 1:// I used a random word generator to find what you would be buying
                                            System.out.println("They got you a very large box. You think that there might be an elephant inside");
                                            playersBalance = playersBalance - 3;
                                            System.out.println("Your current balance is now $" + playersBalance);
                                            break;
                                        case 2:
                                            System.out.println("They put back an item");
                                            playersBalance = playersBalance + 3;
                                            System.out.println("Your current balance is now $" + playersBalance);
                                            break;
                                        case 3:
                                            System.out.println("She kicks you and you drop all of your money. That has really got to hurt");
                                            playersBalance = 0;
                                            System.out.println("Your current balance is now $" + playersBalance);
                                            break;
                                        case 4:
                                            System.out.println("She playes volleyball while you watch the first 2 seasons of Haikyuu on Netflix. She loses but you win because Haikuu is amazing!");
                                            break;
                                        default:
                                            System.out.println("They go back to what ever it was they were donig before");
                                            break;
                                    }// end of clerk switch statement 2
                                    break;
                                case 7:
                                    System.out.println("Your current balance is now $" + playersBalance);
                                    break;
                                case 8:
                                    endGame = "leave";
                                    checkout = "checkout";
                                    break;
                                default:// This will act as the help statement in case the user needs help or enters in an impoper number
                                    System.out.println("lane one Sorry you didn't enter in a proper command! Please try again");
                                    System.out.println("Would you like to do next?\n"
                                        + "1) go to a new lane \n"
                                        + "2) pick up an item \n"
                                        + "3) go to check out \n"
                                        + "4) put item away  \n"
                                        + "5) Take a nap \n"
                                        + "6) Talk to a store clerk \n"
                                        + "7) check balance \n"
                                        + "8) leave \n"
                                        + "If you need help just say a random number bigger than 8");
                                    playerAction = keyboard.nextInt();
                                    break;
                            }  //end of aisle two's actions. Switch statment   
                        } //end of aisle two. If statement


                    else if (aisleNumber == 3)
                        { //beginning of aisle three. If statement
                        System.out.println("You go down aisle three");
                        //Option menu 3
                        System.out.println("Would you like to do next?\n"
                            + "1) go to a new lane \n"
                            + "2) pick up an item \n"
                            + "3) go to check out \n"
                            + "4) put item away  \n"
                            + "5) Take a nap \n"
                            + "6) Talk to a store clerk \n"
                            + "7) check balance \n"
                            + "8) leave \n"
                            + "If you need help just say a random number bigger than 8");
                        playerAction = keyboard.nextInt();
                            switch (playerAction)
                            {// beginning of aisle three action commands. Switch statement
                                case 1:
                                    System.out.println("Which lane do you want to go down now?");
                                    aisleNumber = keyboard.nextInt();
                                    break;
                                case 2:
                                    System.out.println("You picked up a small item. You think there might be honey inside");
                                    playersBalance = playersBalance - 10;
                                    System.out.println("Your current balance is now $" + playersBalance);
                                    break;
                                case 3:
                                    System.out.println(" You go to checkout");
                                    checkout = "checkout";
                                    break;
                                case 4:
                                    System.out.println("You put an item back");
                                    playersBalance = playersBalance + 10;
                                    System.out.println("Your current balance is now $" + playersBalance);
                                    break;
                                case 5:
                                    System.out.println("You go take a nap in the store. You rest your head on a virus and go to sleep for 336 hours.  You feel a lot better now!");
                                    playersBalance = 500;
                                    System.out.println("Your current balance is now $" + playersBalance);
                                case 6:
                                    System.out.println("You talk to a store cleark, there name is Andy what do you want them to do for you? \n"
                                            + "1) Grab you an item \n"
                                            + "2) put back an item \n"
                                            + "3) punch you \n"
                                            + "4) Fish with you\n ");
                                    clerkAction = keyboard.nextInt();
                                    switch(clerkAction) // This switch statement is used when the player talks to a store clerk. This switch statements purpose is to give the player more options when they play
                                    {// begining of clerkAction switch statement
                                        case 1:// I used a random word generator to find what you would be buying
                                            System.out.println("They got you a very strangly shaped box. You think that there might be an imagination inside? What ever that means.");
                                            playersBalance = playersBalance - 20;
                                            System.out.println("Your current balance is now $" + playersBalance);
                                            break;
                                        case 2:
                                            System.out.println("They put back an item");
                                            playersBalance = playersBalance + 20;
                                            System.out.println("Your current balance is now $" + playersBalance);
                                            break;
                                        case 3:
                                            System.out.println("He play karate chops you and acidentlly knocks you out. He takes your money cause why not. That has really got to hurt");
                                            playersBalance = 0;
                                            System.out.println("Your current balance is now $" + playersBalance);
                                            break;
                                        case 4:
                                            System.out.println("You and Andy went fishing for 5 hours together caught 2 small fish ");
                                            break;
                                        default:
                                            System.out.println("They go back to what ever it was they were donig before");
                                            break;
                                    }// end of clerk switch statement 3
                                    break;
                                case 7:
                                    System.out.println("Your current balance is now $" + playersBalance);
                                    break;
                                case 8:
                                    endGame = "leave";
                                    checkout = "checkout";
                                    break;
                                default:// This will act as the help statement in case the user needs help or enters in an impoper number
                                    System.out.println("lane one Sorry you didn't enter in a proper command! Please try again");
                                    //Option help menu 3
                                    System.out.println("Would you like to do next?\n"
                                        + "1) go to a new lane \n"
                                        + "2) pick up an item \n"
                                        + "3) go to check out \n"
                                        + "4) put item away  \n"
                                        + "5) Take a nap \n"
                                        + "6) Talk to a store clerk \n"
                                        + "7) check balance \n"
                                        + "8) leave \n"
                                        + "If you need help just say a random number bigger than 8");
                                    playerAction = keyboard.nextInt();
                                    break;
                            }    //end of aisle three actions. Switch statment 
                        } // end of aisle number three if statement
                    else if (aisleNumber == 4) 
                        { //beginning of aisle 4. If statement
                        System.out.println("You go down aisle four");
                        //Option menu 4
                        System.out.println("Would you like to do next?\n"
                            + "1) go to a new lane \n"
                            + "2) pick up an item \n"
                            + "3) go to check out \n"
                            + "4) put item away  \n"
                            + "5) Take a nap \n"
                            + "6) Talk to a store clerk \n"
                            + "7) check balance \n"
                            + "8) leave \n"
                            + "If you need help just say a random number bigger than 8");
                        playerAction = keyboard.nextInt();
                        keyboard.nextLine();
                            switch (playerAction)
                            { // beginning of aisle four action commands. Switch statement
                                case 1:
                                    System.out.println("Which lane do you want to go down now?");
                                    aisleNumber = keyboard.nextInt();
                                    break;
                                case 2:
                                    System.out.println("You picked some candy\n");
                                    System.out.println("This small mystery box cost 5$");
                                    playersBalance = playersBalance -2;
                                    System.out.println("Your current balance is now $" + playersBalance);
                                    break;
                                case 3:
                                    System.out.println(" You go to checkout");
                                    checkout = "checkout";
                                    break;
                                case 4:
                                    System.out.println("You put an item back");
                                    playersBalance = playersBalance + 2;
                                    System.out.println("Your current balance is now $" + playersBalance);
                                    break;
                                case 5:
                                    System.out.println("You go take a nap in the store. You rest your head on a computer and go to sleep for 127 hours.  You feel a lot better now!");
                                    playersBalance = 500;
                                    System.out.println("Your current balance is now $" + playersBalance);
                                case 6:
                                    System.out.println("You talk to a store cleark, there name is Colette what do you want them to do for you? \n"
                                            + "1) Grab you an item \n"
                                            + "2) put back an item \n"
                                            + "3) Nurse you back to health \n"
                                            + "4) Watch anime\n ");
                                    clerkAction = keyboard.nextInt();
                                    switch(clerkAction)
                                    {// begining of clerkAction switch statement
                                        case 1: // I used a random word generator to find what you would be buying 
                                            System.out.println("They got you a  large box. You think that there might be a personal trainer inside! How they got their you don't want to think about however!");
                                            playersBalance = playersBalance - 7;
                                            System.out.println("Your current balance is now $" + playersBalance);
                                            break;
                                        case 2:
                                            System.out.println("They put back an item");
                                            playersBalance = playersBalance + 7;
                                            System.out.println("Your current balance is now $" + playersBalance);
                                            break;
                                        case 3:
                                            System.out.println("She sees how tried and hurt you are from your adventure and trys to nursing you back to health.\n "
                                                    + "Unfortaly for you she is new to nursing and hurts you more than she helps. \n"
                                                    + "She than takes all your money because 'america?'\n"
                                                    + "That has really got to hurt");
                                            playersBalance = 0;
                                            System.out.println("Your current balance is now $" + playersBalance);
                                            break;
                                        case 4:
                                            System.out.println("You watch anime");
                                            break;
                                        default:
                                            System.out.println("They go back to what ever it was they were donig before");
                                            break;
                                    }// end of clerk switch statement 4
                                    break;
                                case 7:
                                    System.out.println("Your current balance is now $" + playersBalance);
                                    break;
                                case 8:
                                    endGame = "leave";
                                    checkout = "checkout";
                                    break;
                                default: // This will act as the help statement in case the user needs help or enters in an impoper number
                                    System.out.println("lane one Sorry you didn't enter in a proper command! Please try again");
                                    //Option help menu 4
                                    System.out.println("Would you like to do next?\n"
                                        + "1) go to a new lane \n"
                                        + "2) pick up an item \n"
                                        + "3) go to check out \n"
                                        + "4) put item away  \n"
                                        + "5) Take a nap \n"
                                        + "6) Talk to a store clerk \n"
                                        + "7) check balance \n"
                                        + "8) leave \n"
                                        + "If you need help just say a random number bigger than 8");
                                    playerAction = keyboard.nextInt();
                                    break;
                            }//end of aisle 4's actions. Switch statment
                        }//end of aisle 4. If statement
                    } // the end of the shopping/checkout while loop
                System.out.println("You went to checkout and bought all the mystery boxes your current balance is " + playersBalance);
                System.out.println("What would you like to do now?");
                System.out.println(""
                        + "1) Leave \n"
                        + "2)contiune shopping");
                playerAction = keyboard.nextInt();
                        keyboard.nextLine();
                switch (playerAction)
                    {// beginning of checkout action commands. Switch statement
                    case 1:
                        endGame = "leave";
                    case 2:
                        checkout = "stay";
                        
                    }  //end of checkout actions. Switch statment
            }//end of the exit loop
            else
            {
                System.out.println("Sorry you did not enter a proper number can you please try again");
                aisleNumber = keyboard.nextInt();
            }
        }
        System.out.println("Thank you for shopping at bushes");
    }
    
}
