package br.unicesumar.aula;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        System.out.println("Informe o nome");
        pessoa.setNome(coletaDeDadosDoUsuario());
        do {
            try {
                System.out.println("Informe Idade");
                pessoa.setIdade(coletaDeDadosDoUsuario());
                break;
            } catch (IdadeException exception) {
                System.out.println(exception.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Você deve informar um número inteiro.");
            }
        }while (true);

        System.out.println(pessoa);

    }

    private static String coletaDeDadosDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();
        return resposta;
    }
}
