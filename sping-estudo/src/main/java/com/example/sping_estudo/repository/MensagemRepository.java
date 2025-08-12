package com.example.sping_estudo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {
    public String obterMensagem(){
        return "É sobre";
    }
}
