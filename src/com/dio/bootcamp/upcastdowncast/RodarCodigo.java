package com.dio.bootcamp.upcastdowncast;

public class RodarCodigo {
    public static void main(String[] args) {

        Funcionario fucionario = new Funcionario(); // Objeto

        //UpCast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast
        Vendedor vendedor2 = (Vendedor) new Funcionario();
    }
}
