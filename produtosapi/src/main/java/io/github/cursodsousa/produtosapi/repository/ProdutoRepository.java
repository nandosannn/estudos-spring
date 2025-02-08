package io.github.cursodsousa.produtosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.cursodsousa.produtosapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
