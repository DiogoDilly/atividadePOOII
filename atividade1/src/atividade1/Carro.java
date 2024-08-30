
package atividade1;
import java.util.Scanner;

public class Carro {
    Scanner sc = new Scanner(System.in);
    private String marca;
    private String modelo;
    private int ano;       
    private int velocidade; 
    private int coisa;
public Carro(String marca,String modelo,int ano,int velocidade){
    this.ano = ano;
    this.marca = marca;
    this.modelo = modelo;
    this.velocidade = velocidade;
    this.coisa = coisa;
}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getCoisa() {
        return coisa;
    }

    public void setCoisa(int coisa) {
        this.coisa = coisa;
    }
    
public void imprimi(){
    System.out.println("seu carro e da marca "+marca+"do modelo "+modelo+" e o ano do seu carro e "+ano);
    System.out.println("sua velociade:"+velocidade+"km/h 1 para desacelerar o carro em 10km/h ou aumentar 10km/h");
    coisa = sc.nextInt();
   if (coisa == 1){
       velocidade = velocidade - 10;
       System.out.println("sua velocidade:"+velocidade+"km/h");
   }else if (coisa == 2){
       velocidade = velocidade + 10;
       System.out.println("sua velocidade:"+velocidade+"km/h");
   }
    
    
}   
    
}
