import java.util.Arrays;
import java.util.Scanner;

public class TDEE {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = input.nextLine();
        System.out.print("Enter your BMR: ");
        int bmr = input.nextInt();
        System.out.print("Enter your gender(M/F): ");
        input.nextLine();
        String gender = input.nextLine();

        System.out.println();
        System.out.println("Select your activity level: ");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Bicycling)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");


        System.out.println();
        System.out.println("Enter the letter corresponding to your activity level: ");
        String activityLevel = input.nextLine();
        activityLevel = activityLevel.toUpperCase();
        // array created male - female order
        double[][]activityFactor = {{1.0,1.3,1.6,1.7,2.1,2.4},{1.0,1.3,1.5,1.6,1.9,2.2}};
        int genderNum;
        if(gender.toUpperCase() == "M"){
            genderNum = 0;
        }
        else{
            genderNum = 1;
        }
        double totalAF = -1;

        if (genderNum == 0 && "A".equals(activityLevel)){
            totalAF = activityFactor[0][0];
        } else if (genderNum == 0 && "B".equals(activityLevel)){
            totalAF = activityFactor[0][1];
        } else if (genderNum == 0 && "C".equals(activityLevel)){
            totalAF = activityFactor[0][2];
        } else if (genderNum == 0 && "D".equals(activityLevel)){
            totalAF = activityFactor[0][3];
        } else if (genderNum == 0 && "E".equals(activityLevel)){
            totalAF = activityFactor[0][4];
        } else if (genderNum == 0 && "F".equals(activityLevel)){
            totalAF = activityFactor[0][5];
        } else if (genderNum == 1 && "A".equals(activityLevel)){
            totalAF = activityFactor[1][0];
        } else if (genderNum == 1 && "B".equals(activityLevel)){
            totalAF = activityFactor[1][1];
        }else if (genderNum == 1 && "C".equals(activityLevel)){
            totalAF = activityFactor[1][2];
        }else if (genderNum == 1 && "D".equals(activityLevel)){
            totalAF = activityFactor[1][3];
        }else if (genderNum == 1 && "E".equals(activityLevel)){
            totalAF = activityFactor[1][4];
        }else if (genderNum == 1 && "F".equals(activityLevel)){
            totalAF = activityFactor[1][5];
        }

        double TDEE = bmr*totalAF;

        System.out.println();
        System.out.println();
        System.out.println("Your Results: ");
        System.out.print("Name: " + name);
        System.out.println("\t\tGender: " + gender);
        System.out.print("BMR: "+ bmr + " calories");
        System.out.println("\t\tActivity Factor: " + totalAF);
        System.out.println("TDEE: "+ TDEE+ " calories.");



    }
}
