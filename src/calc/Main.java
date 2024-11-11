package calc;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage sanKhau) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView(sanKhau);
        new CalculatorController(model, view);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
