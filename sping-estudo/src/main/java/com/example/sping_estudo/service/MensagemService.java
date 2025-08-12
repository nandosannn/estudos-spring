package com.example.sping_estudo.service;

import org.springframework.stereotype.Service;

import com.example.sping_estudo.repository.MensagemRepository;

@Service
public class MensagemService {
    private MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository){
        this.mensagemRepository = mensagemRepository;
    }

    public String getMensagem(){
        return mensagemRepository.obterMensagem();
    }
}
