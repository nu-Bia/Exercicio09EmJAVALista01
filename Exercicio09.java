//9) Escreva um algoritmo para ler as dimens�es de um quadrado (lado), calcular e escrever a �rea do quadrado. Dica a=l�

import java.util.Scanner;
public class Exercicio09 {

public static void main (String[]args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite o valor do lado do quadrado");

int lado= sc.nextInt();

System.out.println(lado*lado);

}
}
