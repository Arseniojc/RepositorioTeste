package model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Caixa extends Funcionario{
    
    @Column
    private double subsidioDfalha;

    @Override
    public String imprimir() {
        return "Id: " + getId() + "\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nSalario: " + getSalario() ;
    }

    @Override
    public double obterBonus(double salario) {
        return salario*0.35;
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
