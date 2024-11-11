package calc;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.List;
import java.util.Arrays;

public class CalculatorView {
    private TextField textFieldHienThi;
    private GridPane gridPane;

    // Các nút số và phép toán
    private Button button0, button1, button2, button3, button4,
    				button5, button6, button7, button8, button9;
    private Button buttonCong, buttonTru, buttonNhan, buttonChia, buttonBang, buttonXoa;

    // Khởi tạo giao diện
    public CalculatorView(Stage cuaSo) {
        // Tạo TextField hiển thị
        textFieldHienThi = new TextField();
        textFieldHienThi.setPrefWidth(190);
        textFieldHienThi.setPrefHeight(40);
        textFieldHienThi.setEditable(false);

        // Tạo GridPane
        gridPane = new GridPane();
        gridPane.setPadding(new Insets(15, 15, 15, 15));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Đặt TextField hiển thị ở trên cùng
        gridPane.add(textFieldHienThi, 0, 0, 4, 1); // TextField chiếm 4 cột

        // Tạo các nút số
        button0 = new Button("0");
        button1 = new Button("1");
        button2 = new Button("2");
        button3 = new Button("3");
        button4 = new Button("4");
        button5 = new Button("5");
        button6 = new Button("6");
        button7 = new Button("7");
        button8 = new Button("8");
        button9 = new Button("9");

        // Tạo các nút phép toán và chức năng
        buttonCong = new Button("+");
        buttonTru = new Button("-");
        buttonNhan = new Button("*");
        buttonChia = new Button("/");
        buttonBang = new Button("=");
        buttonXoa = new Button("C");

        // Đặt kích thước cho các nút
        Button[] allButtons = {button0, button1, button2, button3, button4,
        		button5, button6, button7, button8, button9,
                buttonCong, buttonTru, buttonNhan, buttonChia, buttonBang, buttonXoa};
        for (Button button : allButtons) {
            button.setPrefWidth(40);
            button.setPrefHeight(40);
        }

        // Sắp xếp các nút theo bố cục yêu cầu
        gridPane.add(button7, 0, 1);
        gridPane.add(button8, 1, 1);
        gridPane.add(button9, 2, 1);
        gridPane.add(buttonChia, 3, 1);

        gridPane.add(button4, 0, 2);
        gridPane.add(button5, 1, 2);
        gridPane.add(button6, 2, 2);
        gridPane.add(buttonNhan, 3, 2);

        gridPane.add(button1, 0, 3);
        gridPane.add(button2, 1, 3);
        gridPane.add(button3, 2, 3);
        gridPane.add(buttonTru, 3, 3);

        gridPane.add(buttonXoa, 0, 4);
        gridPane.add(button0, 1, 4);
        gridPane.add(buttonBang, 2, 4);
        gridPane.add(buttonCong, 3, 4);

        // Hiển thị sân khấu
        Scene scene = new Scene(gridPane, 250, 300);
        cuaSo.setScene(scene);
        cuaSo.setTitle("Máy Tính");
        cuaSo.setResizable(false);
        cuaSo.show();
    }

    // Trả về các phần tử giao diện
    public TextField getTextFieldHienThi() {
    	return textFieldHienThi;
    	}
    public Button getButton0() {
    	return button0;
    	}
    public Button getButton1() {
    	return button1;
    	}
    public Button getButton2() {
    	return button2;
    	}
    public Button getButton3() {
    	return button3;
    	}
    public Button getButton4() {
    	return button4;
    	}
    public Button getButton5() {
    	return button5;
    	}
    public Button getButton6() {
    	return button6;
    	}
    public Button getButton7() {
    	return button7;
    	}
    public Button getButton8() {
    	return button8;
    	}
    public Button getButton9() {
    	return button9;
    	}
    public Button getButtonCong() {
    	return buttonCong;
    	}
    public Button getButtonTru() {
    	return buttonTru;
    	}
    public Button getButtonNhan() {
    	return buttonNhan;
    	}
    public Button getButtonChia() {
    	return buttonChia;
    	}
    public Button getButtonBang() {
    	return buttonBang;
    	}
    public Button getButtonXoa() {
    	return buttonXoa;
    	}
    
    // Trả về danh sách các nút số
    public List<Button> getNumberButtons() {
        return Arrays.asList(button0, button1, button2, button3, button4,
        		button5, button6, button7, button8, button9);
    }

}
