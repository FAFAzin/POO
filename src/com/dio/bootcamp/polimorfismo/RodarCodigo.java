package com.dio.bootcamp.polimorfismo;

public class RodarCodigo {
    public static void main(String[] args) {

        Funcionario fucionario = new Funcionario(); // Objeto

        //UpCast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast
        Vendedor vendedor = (Vendedor) new Funcionario();
    }
}
