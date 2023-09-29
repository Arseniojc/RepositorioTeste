package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Caixa;

public class CaixaDao {
    
    EntityManagerFactory emf;
    EntityManager em;
    
    Caixa caixa = new Caixa();
    
    public CaixaDao(){
        emf = Persistence.createEntityManagerFactory("Teste1PU");
        em = emf.createEntityManager();
    }
    
    List<Caixa> caixas = new ArrayList<>();
    
    // Registrar Funcionarios numa ArrayList
    
    public void adicionar(Caixa g){
        caixas.add(g);
    }
    
    // Salvando na base de dados
     public void salvarGarson(Caixa caixa){
        em.getTransaction().begin();
        em.persist(caixas);
        em.getTransaction();
        emf.close();
    }
     
     // Metodo pra readmitir um funcionario
    
    public void readmitirGarcon(Caixa c){
        if(c.isEstado() == false){
            c.setEstado(true);
        }else{
            System.out.println("O funcionario ja Esta admitido nao pode ser Readmitido");
        }
    }
}
