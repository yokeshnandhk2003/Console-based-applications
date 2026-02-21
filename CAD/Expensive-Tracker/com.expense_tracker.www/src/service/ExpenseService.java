package service;

import exception.InvalidTranscationException;
import exception.TranscationNotFoundException;
import model.Transcation;
import repository.TranscationRepository;

import java.util.List;


public class ExpenseService {
      private TranscationRepository repo = TranscationRepository.getInstance();

      public void addTranscation(double amount,String category,String type){
          if(amount <=0){
              throw new InvalidTranscationException("Amount must be greater than 0.");
          }

          if(!type.equalsIgnoreCase("Income")&&!type.equalsIgnoreCase("Expense")){
              throw new InvalidTranscationException("Type must be either Income or Expense.");
          }
          repo.save(amount,category,type);
      }

    public List<Transcation> getAllTranscations() {
        return repo.findAll();
    }

    public void updateTranscation(int id,double amount,String category,String type){
        Transcation t =repo.findById(id);
          if(amount <=0){
              throw new InvalidTranscationException("Amount must be greater than 0.");
          }

          if(t==null){
              throw new InvalidTranscationException("Transcation not found.");
          }
          t.setAmount(amount);
          t.setCategory(category);
          t.setType(type);
    }
    public void deleteTranscation(int id) {
        if (!repo.deleteById(id))
            throw new TranscationNotFoundException("Transaction not found");
    }

    public double calculateBalance(){
          int income=0;
          int expense=0;
          for(Transcation t :repo.findAll()){
              if(t.getType().equalsIgnoreCase("Income")){
                  income+=t.getAmount();
              }else{
                  expense+=t.getAmount();
              }

          }
          return income-expense;

    }

}
