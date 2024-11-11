package calc;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        initController();
    }

    // Khởi tạo các sự kiện
    private void initController() {
        for (Button button : view.getNumberButtons()) {
            button.setOnAction(e -> view.getTextFieldHienThi().appendText(button.getText()));
        }

        view.getButtonCong().setOnAction(e -> chonPhepToan("+"));
        view.getButtonTru().setOnAction(e -> chonPhepToan("-"));
        view.getButtonNhan().setOnAction(e -> chonPhepToan("*"));
        view.getButtonChia().setOnAction(e -> chonPhepToan("/"));
        view.getButtonBang().setOnAction(e -> tinhKetQua());
        view.getButtonXoa().setOnAction(e -> view.getTextFieldHienThi().clear());
    }

    // Xử lý sự kiện khi chọn phép toán
    private void chonPhepToan(String phepToan) {
        try {
            double so1 = Double.parseDouble(view.getTextFieldHienThi().getText());
            model.setSo1(so1);
            model.setPhepToan(phepToan);
            view.getTextFieldHienThi().clear();
        } catch (NumberFormatException e) {
            showAlert("Lỗi", "Vui lòng nhập hai số nguyên.");
        }
    }

    // Xử lý sự kiện khi nhấn nút "="
    private void tinhKetQua() {
        try {
            double so2 = Double.parseDouble(view.getTextFieldHienThi().getText());
            model.setSo2(so2);
            double ketQua = model.tinhKetQua();
            view.getTextFieldHienThi().setText(String.valueOf(ketQua));
        } catch (NumberFormatException e) {
            showAlert("Lỗi", "Vui lòng nhập đủ hai số nguyên.");
        } catch (ArithmeticException e) {
            showAlert("Lỗi", e.getMessage());
        }
    }

    // Hiển thị thông báo lỗi
    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
