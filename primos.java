import java.util.Scanner;

public class primos {
    static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        int num;
        System.out.print("digite seu numero: ");
            num = sc.nextInt();
        System.out.println(primo(num));
    }

    public static String primo(int num){
        boolean primo = true;
        int resultado = num%2;
        int serie = 3;

            if(num == 2 || num == 3){
                return "é primo";
            }
            if(resultado == 0 || num == 1){
                return "não é primo";
            }
            while (primo) {
                resultado = num % serie;
                serie+=2;
                if(resultado == 0){
                    return "não é primo";
                }
                if(serie >= num){
                    primo = false;
                }
            }
        return "é primo";
    }
}