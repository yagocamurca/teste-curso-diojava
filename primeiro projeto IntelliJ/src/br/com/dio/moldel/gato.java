package br.com.dio.moldel;

import java.util.Objects;

public class gato {
    private String nome;
    private String cor;
    private Integer idade;

    public gato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof gato)) return false;
        gato gato = (gato) o;
        return getNome().equals(gato.getNome()) && getCor().equals(gato.getCor()) && getIdade().equals(gato.getIdade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCor(), getIdade());
    }
}
