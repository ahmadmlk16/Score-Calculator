package AhmadMalik;
/*
Algorithm
1. A main method that uses all methods made and prints out the score of diver to the console.
2. Declare a method name inputValidScore that inputs one valid score for one judge for one diver. This method will return the valid score.
3. Declare a method named inputAllScores that creates an array to store the scores for all judges for the diver. This method will fill the array with a valid score from each judge. This method does not take input arguments, but it does return the array of scores.
4. Declare a method named inputValidDegreeOfDifficulty that inputs a valid degree of difficulty for the dive. The valid degree of difficulty will be returned from the method.
5. Declare a method named calculateScore that will calculate the score for the diver based on the scores from all judges and the degree of difficulty. The score will be returned from the method.

 */
import java.util.Scanner;

class Main{

    public static void main(String [] args){

        System.out.println("The score for the diver is " + calculateScore());
    }
    public static double calculateScore(){
        double diff = inputValidDegreeOfDifficulty();
        double Score[] = inputAllScores();
        double max = Score[0];
        double min = Score[0];
        double sum = Score[0];
        for(int i= 1; i< 7; i++){
            if(Score[i] > max){
                max = Score[i];
            }
            if(Score[i] < min){
                min = Score[i];
            }
            sum += Score[i];
        }
        sum = sum - max - min;
        double score = sum*diff*0.6;
        return score;
    }
    public static double inputValidDegreeOfDifficulty(){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter degree of difficulty between 1.2 and 3.8 ");
        double diff = in.nextDouble();
        System.out.println("Enter Scores between 0 and 10");

        return diff;
    }
    public static double[] inputAllScores(){
        double Score[] = new double[7];
        for(int i=0; i< 7; i++){
            Score[i] = inputValidScore(i);
        }
        return Score;
    }

    public static double inputValidScore(int i){
        Scanner in = new Scanner(System.in);
        double score;

            System.out.print("Enter Judge #" + (i+1) + " score ");
            score = in.nextDouble();

        return score;
    }




}