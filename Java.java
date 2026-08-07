
import java.util.*;
class ArrayCalculation{
    ArrayList <Integer> arr;
    ArrayCalculation(ArrayList<Integer> arr){
        this.arr=arr;
    }
    int getSum(){
        int sum=0;
        for(int k:arr){
            sum+=k;
        }
        return sum;
    }
    int getLargest(){
        int largest=arr.getFirst();
        for(int k:arr){
            if(k>largest){
                largest=k;
            }
        }
        return largest;
    }
    int getSmallest(){
        int smallest=arr.getFirst();
        for(int k:arr){
            if(k<smallest){
                smallest=k;
            }
        }
        return smallest;
    }
    int getAverage(){
        int sum=0;
        for(int k:arr){
            sum+=k;
        }
        sum=sum/arr.size();
        return sum;
    }
}
class Practice{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        ArrayCalculation obj=new ArrayCalculation(arr);
        System.out.println("Array of sum is "+obj.getSum());
        System.out.println("Largest value of"+obj.getLargest());
        System.out.println("Smallest value of "+obj.getSmallest());
        System.out.println("Average value of "+obj.getAverage());

    }
}
