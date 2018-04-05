package main;

import absctract.OperacaoMatematica;
import java.util.Scanner;
import operacoes.Soma;
import operacoes.Subtracao;
import operacoes.Divisao;
import operacoes.Multiplicacao;


public class Start {

    
    //OperacaoMatematica op define a operação que vai ser usada.
    public static void mostrarCalculo(OperacaoMatematica op, double x, double y) {
        System.out.println("Resultado da operação: " + op.calcular(x, y));
    }

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Informe dois valores: ");
        double x = e.nextDouble();
        double y = e.nextDouble();
        
        //Instancia new Soma(), em op para passar o objeto instanciado ficado : new Soma().calcular(x,y) lá no método mostrarCalculo.
        System.out.println("A soma é: ");
        mostrarCalculo(new Soma(), x, y);
        
        //Instancia new Subtracao(), em op para passar o objeto instanciado ficado : new Soma().calcular(x,y) lá no método mostrarCalculo.
        System.out.println("A subtração é: ");
        mostrarCalculo(new Subtracao(), x, y);
        
        System.out.println("A multiplicação é: ");
        mostrarCalculo(new Multiplicacao(), x, y);
        
        System.out.println("A divisão é: ");
        mostrarCalculo(new Divisao(), x, y);
    }

}
