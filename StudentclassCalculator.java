import java.util.Scanner;

public class StudentclassCalculator{
    public static void main(String[] args) {
        float Maths,Accounts, Business_Studies,Economics,InformaticsPractices;
        float MarksObtained;
        float TotalMarks = 500;
        float AvgPercentage;
        char grade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Marks");

        System.out.print("Maths : ");
        Maths= sc.nextFloat();

        System.out.print("Accounts : ");
        Accounts= sc.nextFloat();

        System.out.print("BST : ");
        Business_Studies= sc.nextFloat();

        System.out.print("Economics : ");
        Economics= sc.nextFloat();

        System.out.print("IP : ");
        InformaticsPractices= sc.nextFloat();

        System.out.println();
        System.out.println("RESULT   !");
        MarksObtained = Maths + Accounts + Business_Studies + Economics + InformaticsPractices;
        System.out.println("Marks = " + MarksObtained + "/ " +TotalMarks);

        System.out.println();
        AvgPercentage = (MarksObtained/TotalMarks)*100;
        System.out.println("Average Percentage : "+AvgPercentage );

        if(AvgPercentage >=95.00 && AvgPercentage <= 100){
            System.out.println("Average Grade = A+");
        }

        else if(AvgPercentage >=90.00 && AvgPercentage <= 94.99){
            System.out.println("Grade : A");
        }

        else if(AvgPercentage >=85.00 && AvgPercentage <= 89.99){
            System.out.println("Grade : B+");
        }

        else if(AvgPercentage >=80.00 && AvgPercentage <= 84.99){
            System.out.println("Grade : B");;
        }

        else if (AvgPercentage >=75.00 && AvgPercentage <= 79.99){
            System.out.println("Grade : C+");
        }

         else if (AvgPercentage >=70.00 && AvgPercentage <= 74.99){
            System.out.println("Grade : C");
         }

         else if (AvgPercentage >=65.00 && AvgPercentage <= 69.99){
            System.out.println("Grade : D+");
        }

         else if (AvgPercentage >=60.00 && AvgPercentage <= 64.99){
            System.out.println("Grade : D");
        }
        else{
            System.out.println("Fai:");
        }
    }
}