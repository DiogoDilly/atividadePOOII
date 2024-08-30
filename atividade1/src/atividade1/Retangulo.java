
package atividade1;

public class Retangulo {
private int largura;
private int altura;

public Retangulo(int largura, int altura){
    this.altura = altura;
    this.largura = largura;
}

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
 public void calculo(){
     System.out.println("o perímetro e:" + largura * altura);
 }
}
