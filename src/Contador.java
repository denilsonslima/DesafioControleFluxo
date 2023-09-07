import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametro1 = sc.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametro2 = sc.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        } finally {
            sc.close();
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException(null);
        }

        int result =parametro2 - parametro1;
        for(int i = 1; i <= result; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
