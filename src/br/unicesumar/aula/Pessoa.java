package br.unicesumar.aula;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IdadeException{
        if ((idade <= 0) || (idade > 120)) {
            throw new IdadeException();
        }
        this.idade = idade;
    }
    public void setIdade(String stringIdade) throws IdadeException, NumberFormatException{
        setIdade(Integer.parseInt(stringIdade));
    }
}
