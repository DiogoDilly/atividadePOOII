
package atividade1;
import java.util.Scanner;
public class Atividade1 {
private int atividade;
Scanner sc = new Scanner(System.in);    
  


public static void main(String[] args) {
pessoa t1 = new pessoa ("Roberto",20,"padre");
ContaBancaria t2 = new ContaBancaria ("michael",1163,2304);
Carro t3 = new Carro ("peugeot","2008",2020,30);
Livro t4 = new Livro ("pequeno principe","Antoine de Saint",96);
Retangulo t5 = new Retangulo (40,50);



t1.imprimi();
t2.imprimi();
t3.imprimi();
t4.imprimi();
t5.calculo();

    }
    
}
