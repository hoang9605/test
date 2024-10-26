/**
 * Lớp Geometry cung cấp các phương thức để tính diện tích của các loại hình cơ bản.
 *
 * Lớp này bao gồm các phương thức sau:
 * - Tính diện tích hình chữ nhật
 * - Tính diện tích hình tròn
 * - Tính diện tích hình tam giác
 * - Tính diện tích hình thang
 *
 * Các phương thức được mô tả chi tiết bên dưới.
 */
public class Geometry {

    /**
     * Tính diện tích hình chữ nhật.
     *
     * @param length Chiều dài của hình chữ nhật
     * @param width Chiều rộng của hình chữ nhật
     * @return Diện tích của hình chữ nhật
     */
    public double tinhDienTichHinhChuNhat(double length, double width) {
        return length * width;
    }

    /**
     * Tính diện tích hình tròn.
     *
     * @param radius Bán kính của hình tròn
     * @return Diện tích của hình tròn (π * r^2)
     */
    public double tinhDienTichHinhTron(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Tính diện tích hình tam giác.
     *
     * @param base Độ dài đáy của hình tam giác
     * @param height Chiều cao của hình tam giác (đo từ đỉnh xuống đáy)
     * @return Diện tích của hình tam giác ((base * height) / 2)
     */
    public double tinhDienTichHinhTamGiac(double base, double height) {
        return (base * height) / 2;
    }

    /**
     * Tính diện tích hình thang.
     *
     * @param base1 Độ dài đáy thứ nhất của hình thang
     * @param base2 Độ dài đáy thứ hai của hình thang
     * @param height Chiều cao của hình thang
     * @return Diện tích của hình thang (((base1 + base2) * height) / 2)
     */
    public double tinhDienTichHinhThang(double base1, double base2, double height) {
        return ((base1 + base2) * height) / 2;
    }
}