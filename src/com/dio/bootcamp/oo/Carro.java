package com.dio.bootcamp.oo;

public class Carro {
    //atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    /* construtor sempre abaixo dos atributos
   -  abaixo do construtor os getters and setters
   -  O método vem depois dos getters and setters
     */

    Carro(){ // construtor comum

    } //sobrecarga
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }

    // getters and setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    // método
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

}
