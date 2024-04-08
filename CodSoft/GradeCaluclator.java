import java.util.*;
public class GradeCaluclator {
    public static void main(String[] args) {
        // Task 1 is to take no of subjects 
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the total no of subject's : ");
        int tSubjects = input.nextInt();
        int tMarks = 0;

        // Task 2 -: Take the marks for each subjects  and sum the marks to calculate totalmarks ;
        int i =0;
        while(i<tSubjects) {
            System.out.print("Enter marks for subject "+ (i+1)+":");
            int marks = input.nextInt();
            if(marks<100 && marks>0) {
                tMarks +=marks;
                i++;
            }
            else {
                System.out.println("Warning ! Please enter marks between 0-100");
            }
        }

        // Task 3 : Calcualte the percentage 
        int percentage = tMarks /tSubjects;
        System.out.println("Total Percentage is : "+percentage+"%");

        // Task 4 : Calculate the grade 
        String grade = null;
        int avgp = percentage/10;
        switch (avgp) {
            case 10:
                grade = "A+";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B+";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
                grade = "C";
                break;
            case 5:
                grade = "D";
                break;
            default:
                break;
        }
        System.out.println("Grade is : "+grade);
    }
}
