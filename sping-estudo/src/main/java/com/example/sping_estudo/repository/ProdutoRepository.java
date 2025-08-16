package com.example.sping_estudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sping_estudo.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
