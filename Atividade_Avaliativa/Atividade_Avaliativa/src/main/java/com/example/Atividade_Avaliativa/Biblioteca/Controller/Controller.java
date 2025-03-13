package com.example.Atividade_Avaliativa.Biblioteca.Controller;

import com.example.Atividade_Avaliativa.Biblioteca.Banco.BibliotecaBd;
import com.example.Atividade_Avaliativa.Biblioteca.Model.Cliente;
import com.example.Atividade_Avaliativa.Biblioteca.Model.Emprestimo;
import com.example.Atividade_Avaliativa.Biblioteca.Model.Livro;


import java.util.List;

public class Controller {
    BibliotecaBd repository = new BibliotecaBd();

    public List<Emprestimo> getAll(){
        return repository.findAll();
    }

    public List<Emprestimo> getByEmprestimo(String data_final){
        return repository.findByEmprestimo(data_final);
    }

    public boolean insertBanco(Emprestimo emprestimo){
        return repository.insert(emprestimo);
    }

    public boolean insertBanco(Livro livro){
        return repository.insert(livro);
    }

    public boolean insertBanco(Cliente cliente){
        return repository.insert(cliente);
    }









}
