import java.util.Scanner;

class ans5 {
    public static void votingAge(int a) {
        if (a > 17) {
            System.out.println("person can vote");
        } else {
            System.out.println("person cannot vote");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        votingAge(a);
    }
}
