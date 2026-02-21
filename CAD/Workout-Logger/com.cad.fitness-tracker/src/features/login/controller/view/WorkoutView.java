package features.login.controller.view;
import service.WorkoutService;
public interface WorkoutView {
    void showMenu();
    int getChoice();
    void handle(int choice,WorkoutService service);
}
