import java.util.Scanner;

public class exercises_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tọa độ A: ");
        String a = sc.nextLine();
        System.out.print("Nhập vào tọa độ B: ");
        String b = sc.nextLine();
        System.out.print("Nhập vào tọa độ C: ");
        String c = sc.nextLine();
        System.out.print("Nhập vào tọa độ M: ");
        String m =  sc.nextLine();
        double aX = Double.parseDouble(a.split(" ")[0]);
        double aY = Double.parseDouble(a.split(" ")[1]);
        double bX = Double.parseDouble(b.split(" ")[0]);
        double bY = Double.parseDouble(b.split(" ")[1]);
        double cX = Double.parseDouble(c.split(" ")[0]);
        double cY = Double.parseDouble(c.split(" ")[1]);
        double mX = Double.parseDouble(m.split(" ")[0]);
        double mY = Double.parseDouble(m.split(" ")[1]);

        double Sabc = ((double) 1 /2)*Math.sqrt(aX*bY - bX*aY + bX*cY - cX*bY + cX*aY - aX*cY);
        double Smab = ((double) 1 /2)*Math.sqrt(mX*aY - mX*bY - mY*aX + mY*bX + aX*bY - bX*aY);
        double Smbc = ((double) 1 /2)*Math.sqrt(mX*bY - mX*cY - mY*bX + mY*cX + bX*cY - cX*bY);
        double Smca = ((double) 1 /2)*Math.sqrt(mX*cY - mX*aY - mY*cX + mY*aX + cX*aY - aX*cY);
         if (Sabc == Smab + Smbc + Smca) System.out.println("M nằm trong tam giác ABC");
         else if (Smab == 0 || Smbc == 0 || Smca == 0) {
             System.out.println("M nằm trên cạnh của tam giác ABC");
         }else System.out.println("M nằm ngoài tam giác ABC");
    }
}
