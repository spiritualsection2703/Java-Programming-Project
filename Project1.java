import java.util.Scanner;

public class Project1
{   
public static double calculateCeiPiccolo(int totalCostCeiPiccolo)
{
    
if(totalCostCeiPiccolo >= 1 && totalCostCeiPiccolo <= 3)
{
    final double COST_Piccolo = 1.5 * Math.pow(10, 6);
    return totalCostCeiPiccolo * COST_Piccolo;
    }
        else if (totalCostCeiPiccolo >= 4 && totalCostCeiPiccolo <= 6)
    {
        final double COST_Piccolo = 1.2 * Math.pow(10, 6);
        return totalCostCeiPiccolo * COST_Piccolo;
    }
        else if (totalCostCeiPiccolo >= 7)
    {
        final double COST_Piccolo = 1.0 * Math.pow(10,6);
        return  totalCostCeiPiccolo * COST_Piccolo;
    }

return 0;
}


public static double calculateCeiGrande(int totalCostCeiGrande)
{
    
if(totalCostCeiGrande >= 1 && totalCostCeiGrande <= 3)
{
    final double COST_GRANDE = 2.0 * Math.pow(10, 6);
    return totalCostCeiGrande * COST_GRANDE;
    }
        else if (totalCostCeiGrande >= 4 && totalCostCeiGrande <= 6)
    {
        final double COST_GRANDE = 1.7 * Math.pow(10, 6);
        return totalCostCeiGrande * COST_GRANDE;
    }
        else if (totalCostCeiGrande >= 7)
    {
        final double COST_GRANDE = 1.5 * Math.pow(10,6);
        return  totalCostCeiGrande * COST_GRANDE;
    }

return 0;
}
    

public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    
    System.out.println("     Welcome to Cosmic Explorer Inc. Online Store!");
    System.out.println("---------------------------------------------------------");
 
    int options = 0;
    int warningChoice = 0;
    

    while(warningChoice < 5)
    {
    System.out.print("Please Enter one of the Following: \n");
    System.out.print("1- Purchase CEI PICCOLO RSs \n");
    System.out.print("2- Purchase CEI Grande RSs \n");
    System.out.print("3- Halt \n");
    
      
    
    
    if (input.hasNextInt()) 
            {
                options = input.nextInt();
                if (options >= 1 && options <= 3) 
                {
                    break;
                }
            } 
            else 
            {
                input.next();
            }

            System.out.println("Incorrect choice. Please use the following options 1 - 3! Warning #" + (warningChoice + 1));
            warningChoice++;
        }

        if (warningChoice == 5) 
        {
            System.out.println("Program shutting down due to many invalid inputs!");
            System.exit(0);
        }
    
    
   
switch (options)
{
        
        case 1:
             System.out.println("You've chosen to Purchase CEI PICCOLO RSs!");
             System.out.println("How many CEI PICCOLO RSs would you like to purchase?");
             int totalCostCeiPiccolo = input.nextInt();
             double amountPiccolo = calculateCeiPiccolo(totalCostCeiPiccolo);
             System.out.println("The total cost for " + totalCostCeiPiccolo + " CEI Piccolo RSs is $" + String.format("%.2f",amountPiccolo));
             break;
        case 2:
             System.out.println("You've chosen to Purchase CEI GRANDE RSs!");
             System.out.println("How many CEI GRANDE RSs would you like to purchase?");
             int totalCostCeiGrande = input.nextInt();
             double amountGrande = calculateCeiGrande(totalCostCeiGrande);
             System.out.println("The total cost for " + totalCostCeiGrande + " CEI GRANDE RSs is $" + String.format("%.2f",amountGrande));
             break;
        case 3:
             System.out.println("You've chosen to halt our program! Thank you for visiting!");
             System.exit(0);
             break;          
        default:
            break;
    
    }
  } 


}

