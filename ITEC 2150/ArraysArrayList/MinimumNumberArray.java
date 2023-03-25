package ArraysArrayList;

public class MinimumNumberArray {
    public static void main(String[] args) {
        MinimumNumberArray obj1 = new MinimumNumberArray();

        double[] arr = { 1,4,5,2,56.2,-1,2.1};
        double result = obj1.findMinimum(arr);
        System.out.println(result);
    }

    public double findMinimum(double[] arr){

        //you will first declare the minimum variable with initial value
        double min = 0.0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        return min;

    }
}

