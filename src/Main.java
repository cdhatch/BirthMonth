import java.util.Scanner;
    void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter birth month: ");
        int month = input.nextInt();

        if (month >= 1 && month <= 12) {
            System.out.println("Your birth month is: " + month);
        } else {
            System.out.println("You entered an incorrect month value: " + month);
        }
    }
