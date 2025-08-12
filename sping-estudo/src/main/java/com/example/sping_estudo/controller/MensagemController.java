package com.example.sping_estudo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sping_estudo.service.MensagemService;

@RestController
@RequestMapping("/api")
public class MensagemController {
    public final MensagemService mensagemService;

    public MensagemController(MensagemService mensagemService){
        this.mensagemService = mensagemService;
    }

    @GetMapping("/mensagem")
    public String mensagem(){
        return mensagemService.getMensagem();
    }
}
