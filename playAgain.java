  String answer = "Y";
         while (answer.equalsIgnoreCase("Y"))
         {
            System.out.println("Welcome to Rock, Paper, Scissors!");
            System.out.println();
            System.out.println("Please choose an option to play (1, 2, or 3): ");
            System.out.println();
            showRoundOptions();
            System.out.println();
            int option = input.nextInt();
            while (option != 1 && option != 2 && option != 3)
            {
               System.out.println(" That isn't an option. Please pick one of the options: ");
               option = input.nextInt();
            }
            int rounds = 0;
            if (option ==1 )
            {
        	    rounds = 3;
            }
            else if (option == 2)
            {
        	    rounds = 5;
            }
            else if (option == 3)
            {
        	    rounds = 7;
            }
            System.out.println();
            System.out.println(rounds+" rounds - Excellent Choice! ");
            System.out.println();
            playRounds(input,rounds);
            System.out.println();
           System.out.println("Do you want to play again? Y or N");
           answer = input.next();
           System.out.println();
           while (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N"))
           {
               System.out.println("That is not an option. Please type Y or N. "); 
               answer = input.nextLine();
           }
            if (answer.equalsIgnoreCase("N"))
             System.out.println("Thanks for playing! Goodbye."); 
         }  
