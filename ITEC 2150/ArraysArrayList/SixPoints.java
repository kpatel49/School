package ArraysArrayList;

import java.util.Scanner;
public class SixPoints {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double[][] points = getArray();
        shortestDistance(points);

    }


    public static void shortestDistance(double[][] points)
    {
        //p1 and p2 as the indices in the points array
        //first points of x and  y and second points of x and y to measure the distance between two points
        int p1 = 0;//initialized index value of the first point  
        int p2 = 1;//initialized index value of the seocnd point
        
      //  double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]); 
        double shortestDistance = distance(); 
        
        //compute distance for every two points
        for(int i = 0; i < points.length; i++){
            for(int j = i + 1; j < points.length; j++){
                
                //you are going to find the distance
              double distance =   distance(points[i][0], points[i][1], points[j][0], points[j][1]);
              if(shortestDistance > distance){
                  p1 = i; 
                  p2 = j; 
              }
            }
        }
        
        //display the result
        System.out.println("The closest tww points are (" + points[p1][0] + ", " + points[p1][1] + 
                ") and (" + points[p2][0] + ", " + points[p2][1] + ")");
        
    }

    private static double[][] getArray(){
        double[][] points = new double[6][2];
        System.out.println("Enter six points of x and y");
        for(int i = 0; i < 6; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        return points;
    }

    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2 - y1, 2));
    }

    public static double distance(){
        int p1 = 0; // first point row index - 1st row of index is 0 because the index starts from 0
        int p2 = 1; //second point row index

        /**
         * point1  1   1
         * point2  2   0.5
         */
        double[][] points =  new double[2][2];
        return Math.sqrt(Math.pow((points[p2][0] - points[p1][0]),2) + Math.pow((points[p2][1] - points[p1][1]),2));

    }
}