import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class SortNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();

        try {
            Scanner file = new Scanner(new File("marks.txt"));
            while(file.hasNextInt()){
                marks.add(file.nextInt());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Unsorted: " + marks);
        
        ArrayList<Integer> collectionSort = new ArrayList<Integer>();
        collectionSort = marks;
        Collections.sort(collectionSort);
        System.out.println("Collections Sort: " + collectionSort);
        
        marks = bubbleSort(marks);
        System.out.println("Bubble Sort: " + marks);
    }


    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list){
        int n = list.size();
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(list.get(j) > list.get(j+1)){
                    //swap
                    int tmp = list.get(j+1);
                    list.set(j+1,list.get(j));
                    list.set(j, tmp);
                }
            }
        }
        return list;
    }
}
