package repository;
import dto.WorkOut;
import java.util.List;
import java.util.ArrayList;
public class repoDB implements WorkoutRepository{
     private static repoDB instance;

     private List<WorkOut> workouts = new ArrayList<>();

     private repoDB(){}

    public static repoDB getInstance(){
         if(instance == null){
             instance=new repoDB();
         }
         return instance;
    }
    @Override
    public void addWorkout(WorkOut workout) {
        workouts.add(workout);
    }

    @Override
    public WorkOut getWorkoutByDate(String date) {
         for(WorkOut w :workouts){
             if(w.getWorkoutDate().equals(date)){
                 return w;
             }
         }
         return null;
    }

    public void updateWorkout(String date,WorkOut workout) {
         deleteWorkout(date);
         workouts.add(workout);
    }

    public void deleteWorkout(String date) {
         for(WorkOut w : workouts){
             if(w.getWorkoutDate().equals(date)){
                 workouts.remove(w);
             }
         }
    }
}
