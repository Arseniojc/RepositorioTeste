package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
public abstract class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String nome;
    @Column
    private int idade;
    @Column
    private double salario;
    @Column
    private boolean conduz;
    @Column
    private boolean estado;

    // Metodos Getter e Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isConduz() {
        return conduz;
    }
    

    public void setConduz(boolean conduz) {
        this.conduz = conduz;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    // Metodo pra impressao
    
    public abstract String imprimir();
    
    // Metodo abstracto Obter Bonus
    
    public abstract double obterBonus(double salario);
    
    //Funcionalidade pra saber se o funcionario sabe conduzir
    
    public abstract void sabeConduzir();
    
  
    
}
