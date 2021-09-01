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

    public void setIdade(int idade) throws IdadeException {
        if ((idade<=0) || (idade>120))
            throw new IdadeException("Idade informada deve estar entre 0 e 120 anos");
        this.idade = idade;
    }
    public void setIdade(String idadeStr) throws IdadeException {
        this.setIdade(Integer.parseInt(idadeStr));
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
