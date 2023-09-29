package teste1;

import dao.CaixaDao;
import dao.GarconDao;
import java.util.ArrayList;
import java.util.List;
import model.Caixa;
import model.Garcon;

public class Teste1 {

    public static void main(String[] args) {
        
        Caixa caixa = new Caixa();
        CaixaDao caixadao = new CaixaDao();
        List<Caixa> caixas = new ArrayList<Caixa>();
        
        Garcon garcon = new Garcon();
        GarconDao garsondao = new GarconDao();
        List<Garcon> garcons = new ArrayList<Garcon>();
        
        caixa.setNome("Ana");
    }
    
}
