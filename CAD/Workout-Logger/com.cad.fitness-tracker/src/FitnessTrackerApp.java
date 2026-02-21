import features.login.WorkoutController;
import features.login.WorkoutControllerImpl;
import features.login.controller.*;
import features.login.controller.service.*;
import features.login.controller.view.*;
import features.login.controller.service.*;
import service.WorkoutServiceImpl;

public class FitnessTrackerApp {
    public static void main(String[] args) {
        LoginController login = new LoginControllerImpl(new ConsoleLoginView(), new LoginServiceImpl());

        if (login.login()) {
            WorkoutController controller =
                    new WorkoutControllerImpl(
                            new ConsoleWorkoutView(),
                            WorkoutServiceImpl.getInstance()
                    );
            controller.start();
        }

    }
}