package com.leonardo.futurodev.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.futurodev.domain.model.ClientModel;
import com.leonardo.futurodev.domain.model.EnderecoModel;
import com.leonardo.futurodev.domain.repository.UsuarioRepository;
import com.leonardo.futurodev.rest.dto.UsuarioDto;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    public void salvar(UsuarioDto usuarioDto){
            ClientModel clienteModel = new ClientModel();
            clienteModel.setCpf(usuarioDto.getCpf());
            clienteModel.setNome(usuarioDto.getNome());
            usuarioRepository.salvarClient(clienteModel);

            EnderecoModel enderecoModel= new EnderecoModel();
            enderecoModel.setCep(usuarioDto.getCep());
            enderecoModel.setCidade(usuarioDto.getCidade());
            enderecoModel.setRua(usuarioDto.getRua());
            enderecoModel.setEstado(usuarioDto.getEstado());
            
            usuarioRepository.salvarEndereco(enderecoModel);
            System.out.println("SUCESSO!");
    }
}
