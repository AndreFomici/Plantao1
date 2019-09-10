package com.example.plantao;

public class Calculo {
    public double Media(double[] Valor) {
        double media = 0;
        double soma = 0;
        int i;

        for (i=0;i<Valor.length;i++){
            soma += Valor[i];
        }
        media = soma / i;
        return media;
    }
    public double Maior(double[] valores){
        double maior = valores[0];
        for (int i = 1;i < valores.length; i++){
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }
        return maior;
    }
    public double Maiores3(double[] valores){
        double maior = valores[0];
        for (int i = 1;i < valores.length; i++){
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }
        return maior;
    }
}