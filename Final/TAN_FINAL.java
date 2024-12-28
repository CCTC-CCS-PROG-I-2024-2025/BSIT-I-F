import java.util.Scanner;

// This is an allowance tracker to know kung asa napadulong ang imong money for a week.

/*As someone nga pataka lang ug gasto basta naay gusto paliton niya mahibulong nalang nga wala na diay sulod ang pitaka para allowance 
 the next day nya mangayo na dayun additional allowance ni mama, need need jud kaayo ni ang tracker to track your allowance for the whole week. 
 I took the inspo in making this tracker from the functions of excel nga when you insert a certain value sa cell kay pwede nimo automatic na
matotal ang tanan nga cell using a certain function. I was an ABM student before and we were asked to make an allowance breakdown for a month
and we need to add a lot of cells on what we are spending, so the more we spend on a lot of things, the more scattered our table for the tracker. 
With this kay dali ra kaayo sya kay pili raman ka sa sample categories kung unsa ra ang imong expenses within the day so kung transpo ug dine out ra 
imoha within the day kay pwede ra ka mopili sa choice nga "Done for Today" and the system will provide you with the total amount nga imong naspend sa 
mga categories and how much money imong nahabilin sa wallet. so that's all para sa overview sa akong code*/

 class TAN_AllowanceTracker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variables for total spending and savings
        double totalTransport = 0.0;
        double totalFood = 0.0;
        double totalProjects = 0.0;
        double totalNecessities = 0.0;
        double totalSavings = 0.0;
        double weeklyTotal = 0.0; // Total spending for the week

        // Ask the user for their initial amount for the week
        System.out.print("Enter your total amount for the week: ");
        double initialAmount = scanner.nextDouble();
        double remainingAmount = initialAmount; // Remaining amount after expenses
        
        // Loop through each day of the 5-day workweek
        for (int day = 1; day <= 5; day++) {
            System.out.println("\nDay " + day + ":");

            // Use a while loop to enter expenses for the day
            boolean enteringExpenses = true; // Flag to control the while loop

            // Reset daily totals
            double dailyTransport = 0.0;
            double dailyFood = 0.0;
            double dailyProjects = 0.0;
            double dailyNecessities = 0.0;
            double dailySavings = 0.0;

            while (enteringExpenses) {
                // Ask user for spending category
                System.out.println("Select the spending category:");
                System.out.println("1. Public Transport");
                System.out.println("2. Groceries");
                System.out.println("3. Dining Out");
                System.out.println("4. Project Materials");
                System.out.println("5. Skincare");
                System.out.println("6. Savings");
                System.out.println("7. Done for today"); // Option to finish entering expenses
                System.out.print("Enter your choice (1-7): ");
                int choice = scanner.nextInt();

                double amountSpent = 0.0; // Variable to hold the amount spent for the chosen category

                // Switch statement to handle different categories
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount spent on Public Transport: ");
                        amountSpent = scanner.nextDouble();
                        dailyTransport += amountSpent;
                        break;
                    case 2:
                        System.out.print("Enter amount spent on Groceries: ");
                        amountSpent = scanner.nextDouble();
                        dailyFood += amountSpent;
                        break;
                    case 3:
                        System.out.print("Enter amount spent on Dining Out: ");
                        amountSpent = scanner.nextDouble();
                        dailyFood += amountSpent;
                        break;
                    case 4:
                        System.out.print("Enter amount spent on Project Materials: ");
                        amountSpent = scanner.nextDouble();
                        dailyProjects += amountSpent;
                        break;
                    case 5:
                        System.out.print("Enter amount spent on Skincare: ");
                        amountSpent = scanner.nextDouble();
                        dailyNecessities += amountSpent;
                        break;
                    case 6:
                        System.out.print("Enter amount saved today: ");
                        amountSpent = scanner.nextDouble();
                        dailySavings += amountSpent;
                        break;
                    case 7:
                        enteringExpenses = false; // Exit the while loop
                        continue; // Skip to the next iteration of the for loop
                    default:
                        System.out.println("Invalid choice! Please select a valid category.");
                        continue; // Skip to the next iteration of the while loop
                }

                // Calculate daily total excluding savings
                weeklyTotal += amountSpent; // Add the amount spent to the weekly total

                // Deduct spending from remaining amount (excluding savings)
                remainingAmount -= amountSpent;

                // Provide comments based on spending
                System.out.println("Amount spent: " + amountSpent);
                
                // Conditional comments based on spending
                if (amountSpent > 100) {
                    System.out.println("You spent quite a lot today!");
                } else if (amountSpent > 50) {
                    System.out.println("Your spending is moderate.");
                } else {
                    System.out.println("You spent very little today.");
                }
                System.out.println("------------------------------");
            }

            // Display daily breakdown of expenses after finishing entering expenses
            System.out.println("\nDaily Breakdown for Day " + day + ":");
            System.out.println("Total Public Transport: " + dailyTransport);
            System.out.println("Total Groceries: " + dailyFood);
            System.out.println("Total Dining Out: " + dailyFood); // Note: This will print groceries as dining out
            System.out.println("Total Project Materials: " + dailyProjects);
            System.out.println("Total Skincare: " + dailyNecessities);
            System.out.println("Total Savings: " + dailySavings);
            
            // Calculate remaining amount after daily expenses
            double dailyTotalExpenses = dailyTransport + dailyFood + dailyProjects + dailyNecessities;
            remainingAmount += dailySavings; // Add savings back to remaining amount
            System.out.println("Total Daily Expenses: " + dailyTotalExpenses);
            System.out.println("Remaining amount after Day " + day + ": " + remainingAmount);
            System.out.println("------------------------------");
        }
        
        // Final summary of the week
        System.out.println("Weekly spending summary:");
        System.out.println("Total Transport: " + totalTransport);
        System.out.println("Total Food: " + totalFood);
        System.out.println("Total Projects: " + totalProjects);
        System.out.println("Total Daily Necessities: " + totalNecessities);
        System.out.println("Total Savings: " + totalSavings);
        System.out.println("Total Spending for the Week: " + weeklyTotal);
        
        // Calculate remaining amount at the end of the week
        System.out.println("Remaining amount at the end of the week: " + remainingAmount);
        
        // Provide feedback based on total weekly spending
        if (weeklyTotal > 500) {
            System.out.println("You spent a significant amount this week. Consider budgeting!");
        } else if (weeklyTotal > 300) {
            System.out.println("Your spending is moderate this week. Keep an eye on it!");
        } else {
            System.out.println("Great job! You spent wisely this week.");
        }

        // Close the scanner
        scanner.close();
    }
}