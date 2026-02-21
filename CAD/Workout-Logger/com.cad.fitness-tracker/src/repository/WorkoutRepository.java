package repository;
import dto.WorkOut;
public interface WorkoutRepository {
       void addWorkout(WorkOut workout);
       WorkOut getWorkoutByDate(String date);
       void updateWorkout(String date,WorkOut workout);
       void deleteWorkout(String date);

}
