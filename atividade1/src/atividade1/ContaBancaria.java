
package atividade1;
import java.util.Scanner;


public class ContaBancaria {
   Scanner sc = new Scanner(System.in);
    private String titular;
    private int saldo;
    private int numerodaconta;
    private int usuario;
    private int avan;
    
    
public ContaBancaria(String titular,int saldo,int usuario){
    this.numerodaconta = numerodaconta;
    this.saldo = saldo;
    this.titular = titular;
    this.usuario = usuario;
    this.avan = avan;

}

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumerodaconta() {
        return numerodaconta;
    }

    public void setNumerodaconta(int numerodaconta) {
        this.numerodaconta = numerodaconta;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getAvan() {
        return avan;
    }

    public void setAvan(int avan) {
        this.avan = avan;
    }
    
public void imprimi(){
    System.out.println("bem vindo a bradesca seu saldo e"+ saldo);
    System.out.println("digite 1 para depositar 2 para sacar");
     avan = sc.nextInt();
     
    if (avan == 1){
        System.out.println("digite o quanto quer depositar");
        usuario = sc.nextInt();
        saldo = usuario + saldo;
        System.out.println("seu saldo:"+saldo);
    }else if(avan == 2){
        System.out.println("dgite o quanto quer sacar");
        usuario = sc.nextInt();
        if (usuario > saldo){
            System.out.println("ERRO");
        }
        saldo = saldo - usuario;
        System.out.println("seu saldo:"+saldo);
        
    } else if (avan > 2){
        System.out.println("ERRO");
    }
    
}

}
