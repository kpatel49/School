package Arrays;

public class GradeExam {
    public static void main(String[] args) {
        char[][] studentAnswers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        	int i = 0;
         for(char[] innerArray : studentAnswers){
             int correctCount = 0;
             for(int e : innerArray){
                 if(innerArray[e] == keys[e]){
                     correctCount++;
                 }
             }

             System.out.println("Student " + (i + 1 )   + " got " + correctCount + " items correct. ");
         }
    }
}


//you are going to change this for loop to for-each loop and send your code to me by email.
//please do not send the file. Please just send the code in the email.