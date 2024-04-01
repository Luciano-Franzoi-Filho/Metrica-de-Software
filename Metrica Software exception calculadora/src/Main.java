import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Logger logger = LoggerFactory.getLogger(Main.class);
        Scanner scanner = new Scanner(System.in);

        try {
            double num1 = obterNumero(scanner, logger);
            double num2 = obterNumero(scanner, logger);

            Calculadora calc = new Calculadora();
            System.out.println("Soma: " + calc.add(num1, num2));
            System.out.println("Subtração: " + calc.sub(num1, num2));
            System.out.println("Multiplicação: " + calc.mul(num1, num2));
            System.out.println("Divisão: " + calc.div(num1, num2));

        } catch (ExceptionCalculadora exceptionCalculadora) {
            logger.info("teste, isto é um log");
            throw new RuntimeException(exceptionCalculadora);

        } catch (InputMismatchException erroAoInformarLetra) {
            logger.error("Não faço conta com letras", erroAoInformarLetra);
            System.out.println("\nErro ao ler entrada, utilize somente numeros. O programa será encerrado.\n");
            Thread.sleep(1500);
            throw new RuntimeException(erroAoInformarLetra);
        }
    }
    private static double obterNumero(Scanner scanner, Logger logger) throws InputMismatchException {
        System.out.println("\nInforme um número:");
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Não faço conta com letras ou caracteres especiais");
        }
    }
}