package com.leonardo.futurodev.domain.model;

public class ClientModel {
        private String nome;
        private String cpf;
        private String statusCliente;

        public String getNome(){
            return nome; 
        }

        public void setNome(String nome){
            this.nome=nome;
        }

        public String getCpf(){
            return cpf;
        }

        public void setCpf(String cpf){
            this.cpf=cpf;
        }
}
