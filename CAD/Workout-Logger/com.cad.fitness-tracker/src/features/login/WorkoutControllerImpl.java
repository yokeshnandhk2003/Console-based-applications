package features.login;
import features.login.controller.view.WorkoutView;
import service.WorkoutService;
import service.WorkoutServiceImpl;
public class WorkoutControllerImpl implements WorkoutController {
   private WorkoutView view;
   private WorkoutService service;

   public WorkoutControllerImpl(WorkoutView view, WorkoutService service) {
       this.view = view;
       this.service = service;
   }

   public void start() {
       int choice;
       do {
           view.showMenu();
           choice = view.getChoice();
           view.handle(choice,service);
       }while (choice != 0);
   }
}
