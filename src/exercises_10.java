import java.util.Scanner;

public class exercises_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Nhập SIN (0 để thoát): ");
            String SIN = sc.nextLine();
            if (SIN.equals("0")) break;
            long lastNumber = Long.parseLong(SIN) % 10;
            long totalOdd = 0;
            long totalEvenNumber = 0;
            String[] arrSIN = SIN.split("");
            String[] arrEvenNumbers;
            String[] arrTotalEvenNumbers;
            String evenNumbers = "";
            for (int i = 0; i < arrSIN.length - 1; i++) {
                if (i % 2 == 0) {
                    totalOdd += Long.parseLong(arrSIN[i]);
                }else evenNumbers += arrSIN[i];
            }
            arrEvenNumbers = evenNumbers.split("");
            evenNumbers = "";
            for (int i = 0; i < arrEvenNumbers.length; i++) {
                int index = Integer.parseInt(arrEvenNumbers[i])*2;
                evenNumbers += String.valueOf(index);
            }
            arrTotalEvenNumbers = evenNumbers.split("");
            for (int i = 0; i < arrTotalEvenNumbers.length; i++) {
                totalEvenNumber += Long.parseLong(arrTotalEvenNumbers[i]);
            }
            if ((totalOdd + totalEvenNumber + lastNumber) % 10 == 0) {
                System.out.println("SIN hợp lệ");
            }else System.out.println("SIN không hợp lệ");
        }
    }
}
