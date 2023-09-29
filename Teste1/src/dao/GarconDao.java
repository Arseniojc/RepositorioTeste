package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Garcon;

public class GarconDao {
    
    EntityManagerFactory emf;
    EntityManager em;
    
    Garcon garcon = new Garcon();
    
    public GarconDao(){
        emf = Persistence.createEntityManagerFactory("Teste1PU");
        em = emf.createEntityManager();
    }
    
    List<Garcon> garcons = new ArrayList<>();
    
    // Registrar Funcionarios numa ArrayList
    
    public void adicionar(Garcon g){
        garcons.add(g);
    }
    
    // Salvando na base de dados
    
    public void salvarGarson(Garcon garcon){
        em.getTransaction().begin();
        em.persist(garcons);
        em.getTransaction();
        emf.close();
    }
    
      // Metodo pra readmitir um funcionario
    
    public void readmitirGarcon(Garcon g){
        if(g.isEstado() == false){
            g.setEstado(true);
        }else{
            System.out.println("O funcionario ja Esta admitido nao pode ser Readmitido");
        }
    }
    
}
