package repository;
import model.Transcation;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TranscationRepository {

    private static TranscationRepository instance;
    private List<Transcation> transcations = new ArrayList<>();
    private int idCounter = 1;

    public static TranscationRepository getInstance() {
        if(instance == null){
            instance = new TranscationRepository();
        }
        return instance;
    }

    public void save (double amount,String category,String type){
        transcations.add(new Transcation(idCounter++,amount,category,type));
    }

    public List<Transcation> findAll(){
        return transcations;
    }

    public Transcation findById(int id){
        for(Transcation t:transcations){
            if(t.getId()==id) {
                return t;
            }
        }
        return null;
    }

    public boolean deleteById(int id){
        ListIterator<Transcation> it= transcations.listIterator();
        while(it.hasNext()){
            Transcation t=it.next();
            if(t.getId()==id) {
                it.remove();
                return true;
            }
        }
        return false;
    }
}
