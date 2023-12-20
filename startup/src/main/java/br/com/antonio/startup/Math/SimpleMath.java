package br.com.antonio.startup.Math;

import br.com.antonio.startup.Converters.NumberConverter;

public class SimpleMath {

    public Double soma (Double numberOne, Double numberTwo){
        return numberOne + numberTwo;
    }
    public Double subtracao (Double numberOne, Double numberTwo){
        return numberOne - numberTwo;
    }
    public Double multiplicacao (Double numberOne, Double numberTwo){
        return numberOne * numberTwo;
    }
    public Double divisao (Double numberOne, Double numberTwo){
        return numberOne / numberTwo;
    }
    public Double media (Double numberOne, Double numberTwo){
        return (numberOne + numberTwo) / 2;
    }

    public Double raizQuadrada(Double numberOne){
        return Math.sqrt(numberOne);
    }




}
