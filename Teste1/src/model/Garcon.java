package model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Garcon extends Funcionario{

    @Column
    private double valorGorjeta;

    
    @Override
    public String imprimir() {
        
        return "Id: " + getId() + "\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nSalario: " + getSalario() ;
    }

    @Override
    public double obterBonus(double salario) {
        
        return salario*0.20;
    }

    @Override
    public void sabeConduzir() {
         
        if(isConduz() == true){
            System.out.println("Sei conduzir Carro!");
        }else{
            System.out.println("Nao sei conduzir");
        }
    }
    
    
}
