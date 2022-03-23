import java.util.Scanner;
//Tìm vị trí trong mảng
public class Main {

    public static void main(String[] args) {
        String[] students = {"jon", "potter", "hom", "simp", "yasuo"};
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a name's student:");
        String input_name = myObj.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí các sinh viên trong danh sách: " + input_name + " là " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("không tìm thấy " + input_name + " trong danh sách");
        }
    }

}
