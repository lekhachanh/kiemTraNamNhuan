import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter year you want to check!");
        year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0) {
                    System.out.printf("%d la nam nhuan", year);
                }else {
                    System.out.printf("%d khong phai nam nhuan", year);
                }
            }else {
                System.out.printf("%d la nam nhuan", year);
            }
        }else {
            System.out.printf("%d khong phai nam nhuan", year);
        }
    }
}
