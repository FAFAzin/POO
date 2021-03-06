package com.dio.bootcamp.oo;

public class RodarCodigo {
    public static void main(String[] args) {
        // Objeto para atribuir valores aos atributos
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Mercedes Bens");
        carro1.setCapacidadeTanque(60);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5.8));

        // Outra forma de atribuir valores aos atributos
        Carro carro2 = new Carro("Verde", "BMW", 80);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(5.8));


    }

}
