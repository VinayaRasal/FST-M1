package activities;

public class Activity2 {
    public static void main(String[] args) {
        
        int[] ar1 = {10, 77, 10, 54, -11, 10};
        
      
        //verify sum of 10's is 30
        System.out.println("Verify the sum of 10's is 30");
        System.out.println("Result is :"+ checkSum(ar1));
        
    }

    public static boolean checkSum(int[] num) {
        int sum = 0;
        
        for (int number : num) {
            
            if (number == 10) {
                //Add to sum
                sum += number;
            }

           
        }
        
        if(sum == 30) {
        	return true;
        }else {
        	return false;
        }
        
    }    
}