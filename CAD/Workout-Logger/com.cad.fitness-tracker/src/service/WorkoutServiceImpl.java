package service;
import dto.WorkOut;
import repository.WorkoutRepository;
import repository.repoDB;
public class WorkoutServiceImpl implements WorkoutService {

     private static WorkoutServiceImpl instance;
     private WorkoutRepository repository;

     private WorkoutServiceImpl() {
         this.repository=repoDB.getInstance();
     }

     public static WorkoutServiceImpl getInstance(){
         if(instance==null){
             instance=new WorkoutServiceImpl();
         }
         return instance;
     }

    @Override
    public void addWorkout(WorkOut workout) {
        repository.addWorkout(workout);
    }

    @Override
    public WorkOut viewWorkoutByDate(String date) {
        return repository.getWorkoutByDate(date);
    }

    @Override
    public void updateWorkout(String date, WorkOut workout) {
        repository.updateWorkout(date, workout);
    }

    @Override
    public void deleteWorkout(String date) {
        repository.deleteWorkout(date);
    }



}
