package com.leonardo.futurodev.domain.repository;

import org.springframework.stereotype.Repository;
import com.leonardo.futurodev.domain.model.EnderecoModel;
import com.leonardo.futurodev.domain.model.ClientModel;

@Repository
public class UsuarioRepository {
    public void salvarClient(ClientModel clienteModel){
        
        System.out.println("Cliente inserido");
    }

    public void salvarEndereco(EnderecoModel enderecoModel){
        System.out.println("Endereco  inserido");
    }
}
