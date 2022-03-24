import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a height: ");
        double height = sc.nextDouble();
        System.out.print("\nEnter a width: ");
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Diện tích bằng " + rectangle.getArea());
        System.out.println("Hình chữ nhật của bạn \n" + rectangle.display());
        System.out.println("Chu vi hình chữ nhật bằng " + rectangle.getPerimeter());
    }
}
