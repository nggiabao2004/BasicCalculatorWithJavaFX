package calc;

public class CalculatorModel {
    private double so1;
    private double so2;
    private String phepToan;

    // Thiết lập số thứ nhất 
    public void setSo1(double so1) {
        this.so1 = so1;
    }

    // Thiết lập phép toán
    public void setPhepToan(String phepToan) {
        this.phepToan = phepToan;
    }

    // Thiết lập số thứ hai
    public void setSo2(double so2) {
        this.so2 = so2;
    }

    // Phương thức tính toán kết quả
    public double tinhKetQua() throws ArithmeticException { // ArithmeticException xác thực số nguyên chia cho 0
        double ketQua = 0;
        if (phepToan.equals("+")) {
            ketQua = so1 + so2;
        } else if (phepToan.equals("-")) {
            ketQua = so1 - so2;
        } else if (phepToan.equals("*")) {
            ketQua = so1 * so2;
        } else if (phepToan.equals("/")) {
            if (so2 == 0) {
            	// Thông báo "Không thể chia cho 0"
                throw new ArithmeticException("Không thể chia cho 0");
            }
            ketQua = so1 / so2;
        }
        return ketQua;
    }
}
