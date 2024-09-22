import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Num = sc.nextInt();

        System.out.print(pibo(Num));
    }

    public static int pibo(int Num) {

        if(Num == 1 || Num == 2) {
            return 1;
        }
        if(Num == 0) {
            return 0;
        }

        return pibo(Num - 1) + pibo(Num - 2);
    }

}