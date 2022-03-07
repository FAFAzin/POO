
package com.dio.bootcamp.interfac;

public class Calculadora implements OperacaoMatematica {

    @Override
    public void soma(Double operado1, Double operando2){

        System.out.println("Soma: " + (operado1 + operando2));
    }
    @Override
    public void subtracao(Double operado1, Double operando2){

        System.out.println("Subtração: " + (operado1 - operando2));
    }
    @Override
    public void multiplicacao(Double operado1, Double operando2){

        System.out.println("multiplicacao: " + (operado1 * operando2));
    }
    @Override
    public void divisao(Double operado1, Double operando2){

        System.out.println("divisao: " + (operado1 / operando2));
    }

}
