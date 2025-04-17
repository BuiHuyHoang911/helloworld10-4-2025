import java.util.Scanner;

public class WeekdayCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập vào số ngày (0-6): ");
        int dayNumber = scanner.nextInt();
        
        String dayName;
        
        switch (dayNumber) {
            case 0:
                dayName = "Chủ nhật";
                break;
            case 1:
                dayName = "Thứ hai";
                break;
            case 2:
                dayName = "Thứ ba";
                break;
            case 3:
                dayName = "Thứ tư";
                break;
            case 4:
                dayName = "Thứ năm";
                break;
            case 5:
                dayName = "Thứ sáu";
                break;
            case 6:
                dayName = "Thứ bảy";
                break;
            default:
                dayName = "Số ngày không hợp lệ! Vui lòng nhập từ 0 đến 6.";
        }
        
        System.out.println("Ngày tương ứng là: " + dayName);
        
        scanner.close();
    }
}