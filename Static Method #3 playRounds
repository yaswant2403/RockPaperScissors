public static void playRounds(Scanner pInput, int pRounds)
      {
           String x = " Rock breaks scissors! ";
           String y = " Paper covers rock! ";
           String z = " Scissors cuts paper! ";
           String lsUserName = "You win";
           String lsAppName = "The bot wins";
           String lsWinner = null;
           String lsTie = "It's a draw! No one gets a point! ";
           String lsPlayedPhrase = null;
           int botscore = 0;
           int userscore = 0;
           String userOption = null;
           String compOption = null;
           for (int i = 0; i <pRounds ; i ++) 
           {  
        	     lsWinner = null;
        	     lsPlayedPhrase = null;
              showCountdown();               
              System.out.println(" Enter your option: Rock, Paper, or Scissors? ");
              System.out.println();
              userOption = pInput.next();
              while (!userOption.equalsIgnoreCase("Rock") && !userOption.equalsIgnoreCase("Paper") && !userOption.equalsIgnoreCase("Scissors"))
              {
                    System.out.println("That is not an option. Please choose one of the options: ");
                    userOption = pInput.next();
              }
              compOption = getComputerChoice();
              System.out.println();
              System.out.println(" You chose " + userOption + " and the Bot chose " + compOption + ".");
              System.out.println();
              if (compOption.equalsIgnoreCase("Rock") && userOption.equalsIgnoreCase("Scissors"))
              {
					lsPlayedPhrase = x;
					lsWinner = lsAppName;
              }
              else if (compOption.equalsIgnoreCase("Scissors") && userOption.equalsIgnoreCase("Rock"))
              {
                  lsPlayedPhrase = x;
                  lsWinner = lsUserName;
              }
              else if (compOption.equalsIgnoreCase("Paper") && userOption.equalsIgnoreCase("Rock"))
              {
                  lsPlayedPhrase = y;
                  lsWinner = lsAppName;
               }
               else if (compOption.equalsIgnoreCase("Rock") && userOption.equalsIgnoreCase("Paper"))
               {
                   lsPlayedPhrase = y;
                   lsWinner = lsUserName;
               }
               else  if (compOption.equalsIgnoreCase("Scissors") && userOption.equalsIgnoreCase("Paper"))
               {
                   lsPlayedPhrase = z;
                   lsWinner = lsAppName;
               }
               else if (compOption.equalsIgnoreCase("Paper") && userOption.equalsIgnoreCase("Scissors"))
              {
                   lsPlayedPhrase = z;
                   lsWinner = lsUserName;
              }
               else if (compOption.equalsIgnoreCase(userOption) || userOption.equalsIgnoreCase(compOption))
              {
	           	   lsWinner = null;
	           	   lsPlayedPhrase = lsTie;
              }
              
              if (lsWinner!=null)
              { //If it's not a tie
            	  if(lsWinner.equals(lsAppName))
            	  {
            		 botscore++;
            	  }
            	  else
            	  {
            		 userscore++; 
            	  }
            	  System.out.println(lsPlayedPhrase + lsWinner+" this round!");
               System.out.println();
              }
              else
              {
            	  System.out.println(lsPlayedPhrase);
                System.out.println();
              }
              System.out.println(" Bot's Score: " + botscore);
              System.out.println(" Your Score: " + userscore);
              System.out.println();             
               try 
              {
                   Thread.sleep(4000);                 
               } 
               catch(InterruptedException ex) {
            	   Thread.currentThread().interrupt();
              }
				if (i<(pRounds-1))
				{
					System.out.println(" Next Round! "); 
					System.out.println();
				}
           }
		  System.out.println(" All Rounds Are Over! ");
		  System.out.println();
		  System.out.println(" Here's the final score: ");
           System.out.println();
		  System.out.println(" Bot's Score: " + botscore);
		  System.out.println(" Your Score: " + userscore);
           System.out.println();
           if (botscore > userscore)
           {
               System.out.println(" The bot won! D: ");
            }
            else if (botscore < userscore)
            {
               System.out.println(" You won!! :D ");
            }
            else if (botscore == userscore)
            {
               System.out.println(" No one won! Draw game! ");
            }
       }    
