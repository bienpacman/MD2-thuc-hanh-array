import java.util.Scanner;
//  tìm giá trị nhỏ nhất trong mảng

public class Main4 {
    public static void main (String[]args){
int size ;
int [] array ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("size should not exceed 10 ");
        }while (size > 10);
        array = new int[size];
        int i = 0 ;
        while (i < array.length){
            System.out.print("Enter element " +(i+1)+ " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("danh sách phần tử");
        for (int j = 0 ; j < array.length; j++){
            System.out.print(array[j] + "\t" );
        }
        int min = array[0];
        int index = 1 ;
        for (int j = 0 ; j < array.length; j++){
            if (array[j]<min){
                min = array[j];
                index = j +1 ;
            }
        }
        System.out.print(" Giá trị nhỏ nhất trong mảng là : " + min + " tại vị trí  "+ index);
    }

}
