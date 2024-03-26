
package projetobanco;


public class ProjetoBanco {

   
    public static void main(String[] args) {
        Conta c1 = new ContaPoupanca();
        Conta c2 = new ContaPagamentos();
        
        c1.nomeTitular = "Andressa";
        c1.numConta = 1;
        
        c2.nomeTitular = "Rafael";
        c2.numConta = 2;
        
        c1.depositar(50);
        c2.depositar(50);
        
        System.out.println("Saldo c1: " + c1.getSaldo());
        System.out.println("Saldo c2: " + c2.getSaldo());
        
        c1.sacar(10);
        c2.sacar(10);

        System.out.println("Saldo c1 após o saque: " + c1.getSaldo());
        System.out.println("Saldo c2 após o saque: " + c2.getSaldo());        
                 
    }
    
}

class Conta {
    public String nomeTitular;
    public int numConta;
    private double saldo;
    protected double taxaSaque;
    
    
    public boolean depositar (double valor){
        this.saldo += valor;
        return true;
    }
    
    public boolean sacar (double valor){
        if (valor + this.taxaSaque <= this.saldo){
            this.saldo = this.saldo - valor - this.taxaSaque;
            return true;
        } else{
            return false;
        }
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public boolean transferir (Conta contaDestino, double valor){
       if(this.sacar(valor)==true){
            contaDestino.depositar(valor);
            return true;
        }else{
            return false;
        } 
    }
        
}

class ContaPoupanca extends Conta{
    @Override
    public boolean sacar (double valor){
        super.taxaSaque = 2.0;
        return super.sacar(valor);
    }
}

class ContaPagamentos extends Conta{
    @Override
    public boolean sacar (double valor){
        super.taxaSaque = 1.0;
        return super.sacar(valor);
    }
}




