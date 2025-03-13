package com.example.Atividade_Avaliativa.Biblioteca.Model;

public class Emprestimo {
    private String data_fim;
    private String data_inicio;
    private String livros_Emprestados;


    public Emprestimo(String data_fim, String data_inicio, String livros_Emprestados) {
        this.data_fim = data_fim;
        this.data_inicio = data_inicio;
        this.livros_Emprestados = livros_Emprestados;
    }


    public String getData_fim() {
        return data_fim;
    }

    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getLivros_Emprestados() {
        return livros_Emprestados;
    }

    public void setLivros_Emprestados(String livros_Emprestados) {
        this.livros_Emprestados = livros_Emprestados;
    }
}
