package dto;
import java.util.List;
public class WorkOut {

    private int workoutId;
    private String workoutDate;
    private String workoutType;
    private List<Exercise> exercises;

    public WorkOut() {
    }

    public WorkOut(int workoutId, String workoutDate, String workoutType, List<Exercise> exercises) {
        this.workoutId = workoutId;
        this.workoutDate = workoutDate;
        this.workoutType = workoutType;
        this.exercises = exercises;
    }

    public int getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }

    public String getWorkoutDate() {
        return workoutDate;
    }

    public void setWorkoutDate(String workoutDate) {
        this.workoutDate = workoutDate;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

}
