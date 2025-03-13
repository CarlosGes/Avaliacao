package com.example.Atividade_Avaliativa.Biblioteca.View;

import com.example.Atividade_Avaliativa.Biblioteca.Controller.Controller;
import com.example.Atividade_Avaliativa.Biblioteca.Model.Cliente;
import com.example.Atividade_Avaliativa.Biblioteca.Model.Emprestimo;
import com.example.Atividade_Avaliativa.Biblioteca.Model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimo")

public class View {

    Controller controller = new Controller();


    @GetMapping("/data_final")
    public List<Emprestimo> getEmprestimo(
            @RequestParam(required = false) String data_fim){
        if (data_fim != null){
            return controller.getByEmprestimo(data_fim);
        }else{
            return controller.getAll();
        }
    }


    @PostMapping
    public boolean insert(@RequestBody Emprestimo emprestimo){
        return controller.insertBanco(emprestimo);
    }

    @PostMapping("/Livro")
    public boolean insert(@RequestBody Livro livro){
        return controller.insertBanco(livro);
    }

    @PostMapping("/Cliente")
    public boolean insert(@RequestBody Cliente cliente){
        return controller.insertBanco(cliente);
    }




}
