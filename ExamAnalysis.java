import java.util.*;
import java.io.*;
public class ExamAnalysis {
    public static void main(String [] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Exam Analysis.  Let’s begin ...");
        System.out.println();
        System.out.println("Please type the correct answers to the exam questions, ");
        System.out.print("one right after the other:      ");
        String answerkey = keyboard.next();
        System.out.println();
        System.out.println("What is the name of the file containing each student's");
        System.out.print(" responses to the 10 questions?  ");
        String responses = keyboard.next();
        Scanner in = new Scanner(new File(responses));
        System.out.println();
        System.out.println("We have reached \"end of file!\"\n");

        int count = 0;
        while (in.hasNextLine()){
            String x = in.nextLine();
            count++;
            System.out.println("Student #" + count + "'s responses: " + x);
        }
        String [] studentData = new String [count];
        int [][] answers = new int [answerkey.length()][6];
        System.out.println("Thank you for the data on " + count + " students.  Here's the analysis: \n");


        Scanner in2 = new Scanner(new File(responses));
        for(int i = 0; i < count; i ++) {
            studentData[i] = in2.nextLine();
            System.out.println(studentData[i]);
        }
        System.out.println("Student #\t\tCorrect\t\tIncorrect\t\tBlank");
        System.out.println("~~~~~~~~~\t\t~~~~~~~\t\t~~~~~~~~~\t\t~~~~~");
        int correctTotal = 0;
        int incorrectTotal = 0;
        int blankTotal = 0;
        for(int i = 0; i < count; i++){
            int correct = 0;
            int incorrect = 0;
            int blank = 0;
            for(int j = 0; j < answerkey.length(); j++) {
                if(studentData[i].charAt(j) == answerkey.charAt(j)){
                    correct ++;
                }
                else if(studentData[i].charAt(j) == ' '){
                    blank ++;
                }
                else{
                    incorrect++;
                }
                if(studentData[i].charAt(j) == 'A'){
                    answers[j][0] ++;
                }else if(studentData[i].charAt(j) == 'B'){
                    answers[j][1] ++;
                }else if(studentData[i].charAt(j) == 'C') {
                    answers[j][2] ++;
                }else if(studentData[i].charAt(j) == 'D') {
                    answers[j][3] ++;
                }else if(studentData[i].charAt(j) == 'E') {
                    answers[j][4] ++;
                }else{
                    answers[j][5] ++;
                }

            }
            System.out.println(i + "\t\t" + correct + "\t\t" + incorrect + "\t\t" + blank);
        }
        System.out.println("QUESTION ANALYSIS");
        System.out.println("~~~~~~~~~~~~~~~~~");
        for(int i = 1; i <= count; i++) {
            System.out.println("Question #" + i);
            System.out.println("\tA\tB\tC\tD\tE\tBlank");
            double total = 0;
            for(int j = 0; j < 6; j++){
                System.out.print("\t" + answers[i][j]);
                total += answers[i][j];
            }
            System.out.println();
            for(int k = 0; k < 6; k++){
                System.out.print("\t");
                System.out.printf("%.2f", answers[i][k]/total);
                System.out.print("%");
            }
            System.out.println();
        }
    }
}