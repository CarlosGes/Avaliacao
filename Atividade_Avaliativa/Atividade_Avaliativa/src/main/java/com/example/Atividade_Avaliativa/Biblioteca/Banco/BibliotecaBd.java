package com.example.Atividade_Avaliativa.Biblioteca.Banco;

import com.example.Atividade_Avaliativa.Biblioteca.Model.Cliente;
import com.example.Atividade_Avaliativa.Biblioteca.Model.Emprestimo;
import com.example.Atividade_Avaliativa.Biblioteca.Model.Livro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BibliotecaBd {
    public List<Emprestimo> emprestimos;
    public List<Livro> livros;

    public List<Cliente> clientes;

    public BibliotecaBd(){
        this.emprestimos = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public List<Emprestimo> findAll(){
        return emprestimos.stream()
                .sorted(Comparator.comparing(Emprestimo::getData_fim).reversed())
                .toList();
    }


    public boolean insert(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
        return true;
    }

    public boolean insert(Livro livro){
        livros.add(livro);
        return true;
    }

    public boolean insert(Cliente cliente){
        clientes.add(cliente);
        return true;
    }


    public List<Emprestimo> findByEmprestimo(String dataFim) {
        return emprestimos.stream()
                .filter(emprestimo -> emprestimo.getData_fim().equals(dataFim))
                .toList();
    }


}
