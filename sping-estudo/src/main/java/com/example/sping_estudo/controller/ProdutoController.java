package com.example.sping_estudo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.example.sping_estudo.repository.ProdutoRepository;
import com.example.sping_estudo.service.ProdutoService;
import com.example.sping_estudo.model.Produto;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> listarProdutos(){
        return produtoService.listarProdutos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProduto(@PathVariable Long id){
        return produtoService.buscarProduto(id)
        .map(ResponseEntity::ok)
        .orElseGet(() -> ResponseEntity.notFound().build() );
    }

    @PostMapping()
    public Produto salvarProduto(@RequestBody Produto produto){
        return produtoService.savarProduto(produto);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
    }
    
}
