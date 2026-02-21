package dto;

public class Exercise {
    private String workoutName;
    private int set;
    private int reps;
    private double weight;

    Exercise() {}

   public Exercise (String workoutName,int set,int reps,double weight){
        this.workoutName=workoutName;
        this.set=set;
        this.reps=reps;
        this.weight=weight;
    }

    public String getWorkoutName(){
        return workoutName;
    }
    public void setWorkoutName(String workoutName){
        this.workoutName=workoutName;
    }

    public int getSet(){
        return set;
    }
    public void setSet(int set){
        this.set=set;
    }
    public int getReps(){
        return reps;
    }
    public void setReps(int reps){
        this.reps=reps;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }


}
