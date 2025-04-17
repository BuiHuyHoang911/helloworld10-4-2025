import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        
        System.out.print("Nhập năm sinh của bạn: ");
        int birthYear = scanner.nextInt();
        int age = 2025 - birthYear; // Giả sử năm hiện tại là 2025
        
        if (age < 16) {
            System.out.println("Bạn " + name + " ở độ tuổi vị thành niên.");
        } else if (age >= 16 && age < 18) {
            System.out.println("Bạn " + name + " ở độ tuổi trưởng thành.");
        } else {
            System.out.println("Bạn " + name + " đã già.");
        }
        
        scanner.close();
    }
}
    
