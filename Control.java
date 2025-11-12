import java.util.Scanner;

class Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int num1 = 7;

        System.out.print("Enter an integer: ");
        int num1 = scanner.nextInt();

        if (num1 >= 10) {
            System.out.println("The number is more than or equal to 10.");
        } else {
            System.out.println("The number is less than 10.");
        }

        switch (num1) {
            case 1:
                System.out.println("You are first.");
                break;
            case 2:
                System.out.println("You are second.");
                break;
            default:
                System.out.println("You are later.");
        }

        scanner.close();
    }
}