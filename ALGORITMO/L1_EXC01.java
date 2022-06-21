package ALGORITMO;

import java.util.Scanner;

//1) Solicitar o nome e o salário de uma pessoa. No final,
// apresente o nome e seu novo salário como aumento de 28,5%.
public class L1_EXC01 {
    public static void main(String[] args) {
        String nome;
        double salario;
        double salarionovo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome do funcionario:");
        nome = sc.nextLine();
        System.out.print("Informe o seu salario atual:");
        salario = sc.nextDouble();

        salarionovo = salario*1.285;
                System.out.printf("O seu novo salario com aumento de 28,5%% é de R$: %.2f",salarionovo);


    }
}
