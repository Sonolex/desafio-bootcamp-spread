package Testes;
import java.util.Scanner;

public class graosdetrigo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // variavel
        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt();  // variavel
            System.out.printf((x/12) + "kg");   //Complete o código aqui.
        }
        sc.close();
    }
}

