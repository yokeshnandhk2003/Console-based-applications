package service;
import dto.WorkOut;


public interface WorkoutService {
    void addWorkout(WorkOut workout);
    WorkOut viewWorkoutByDate(String date);
    void deleteWorkout(String date);
    void updateWorkout(String date, WorkOut workout);
}
