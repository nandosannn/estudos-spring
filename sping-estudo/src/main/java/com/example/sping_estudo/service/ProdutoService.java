package com.example.sping_estudo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.sping_estudo.model.Produto;
import com.example.sping_estudo.repository.ProdutoRepository;

@Service
public class ProdutoService {
    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarProduto(Long id){
        return produtoRepository.findById(id);
    }

    public Produto savarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }



}
