package com.udc.imcapp.modelo;

import com.udc.imcapp.R;

public class IMC {
    private double peso;
    private double estatura;


    public IMC(String peso,String estatura){
        this.peso=Double.valueOf(peso);
        this.estatura=(Double.valueOf(estatura)/100);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    private double calcularIMC(){
        return peso/Math.pow(estatura,2);
    }

    public String calcularIMCString(){
        return String.format("%.2f",calcularIMC());
    }

    public Indicador indicadorIMC(){
        String mensaje="";
        int imagen=0;

        if(calcularIMC()>=0 && calcularIMC()<18.5){
            mensaje="Bajo Peso";
            imagen= R.drawable.bajopeso;
        }
        else if(calcularIMC()>=18.5 && calcularIMC()<25){
            mensaje="Peso Normal";
            imagen= R.drawable.pesonormal;
        }
        else if(calcularIMC()>=25 && calcularIMC()<30){
            mensaje="Sobrepeso";
            imagen= R.drawable.sobrepeso;
        }
        else if(calcularIMC()>=30){
            mensaje="Obeso";
            imagen= R.drawable.obeso;
        }
        Indicador indicador=new Indicador(mensaje,imagen);

        return indicador;
    }

}
