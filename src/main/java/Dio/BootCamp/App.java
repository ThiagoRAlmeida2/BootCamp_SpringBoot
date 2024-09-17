package Dio.BootCamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class App implements CommandLineRunner {
    @Autowired
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("O resultado da soma é: " + calculadora.soma(num1, num2));
        System.out.println("O resultado da subtração é: " + calculadora.subtracao(num1, num2));
        System.out.println("O resultado é multiplicação é: " + calculadora.multiplicacao(num1, num2));
        System.out.println("O resultado da divisão é: " + calculadora.divisao(num1, num2));
    }

}
