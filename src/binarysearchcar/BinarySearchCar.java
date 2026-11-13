
package binarysearchcar;
import java.util.Scanner;
public class BinarySearchCar {

    public static void main(String[] args) {
        //Audi, BMW, Ford, Toyota, Volkswagen
        //Looking for Toyota
        Scanner input = new Scanner(System.in);
        String[] cars = {"Audi", "BMW", "Ford", "Toyota", "Volkswagen"};
        
        System.out.print("Enter a car to search: ");
        String target = input.nextLine();
        
        int low = 0;
        int high = cars.length -1;
        boolean found = false;
        
        while(low<=high){
            int mid = (low + high)/2;
            int result = cars[mid].compareToIgnoreCase(target);
            if(result == 0){
                System.out.println(target + " found at index:" + mid);
                found =true;
                break;
                
            }else if(result < 0){//The right and left sides
                low = mid + 1;
            }else{
                high = mid -1;
            }//end else
        }//end while
        if(!found){
            System.out.println(target + " was not found");
        }//end if
        input.close();
                
    }//end main
    
}//end class
