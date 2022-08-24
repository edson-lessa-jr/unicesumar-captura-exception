package br.unicesumar.aula;



public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        try {
            pessoa.setIdade("300");
        } catch (IdadeException e){
            exibirMensagem(e.getMessage());
        } catch (NumberFormatException e){
            exibirMensagem("Número inválido");
        } finally {
            exibirMensagem("Final do programa");
        }
    }


    private static void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
