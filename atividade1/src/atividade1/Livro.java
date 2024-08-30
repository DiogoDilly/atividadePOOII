
package atividade1;
import java.util.Scanner;


public class Livro {
  Scanner sc = new Scanner(System.in);
  private String titulo;
  private String autor;
  private int numerodepaginas;
  private int numerodeex;
  private int coisa;
  public Livro(String titulo,String autor,int numerodepaginas){
      this.autor = autor;
      this.numerodeex = numerodeex;
      this.titulo = titulo;
      this.numerodepaginas = numerodepaginas;
  }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumerodepaginas() {
        return numerodepaginas;
    }

    public void setNumerodepaginas(int numerodepaginas) {
        this.numerodepaginas = numerodepaginas;
    }

    public int getNumerodeex() {
        return numerodeex;
    }

    public void setNumerodeex(int numerodeex) {
        this.numerodeex = numerodeex;
    }

    public int getCoisa() {
        return coisa;
    }

    public void setCoisa(int coisa) {
        this.coisa = coisa;
    }
  public void imprimi(){
  numerodeex =57;
      System.out.println("livro:"+titulo+" do autor:"+autor+" os numeros de paginas são:"+numerodepaginas);
      System.out.println("numero de exemplares:"+numerodeex);
      System.out.println("digite 1 para pegar livro e 2 para devolver");
      coisa = sc.nextInt();
  if (coisa == 1){
   numerodeex =  numerodeex - 1;
      System.out.println("numero de exemplares:"+numerodeex);
  }else if( coisa ==2)
      numerodeex = numerodeex +1;
      System.out.println("numero de exemplares:"+numerodeex);
  }
}
