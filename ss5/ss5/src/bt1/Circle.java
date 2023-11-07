package bt1;

public class Circle {
    private double banKinh;
    private String color;
    private double dientich = banKinh*banKinh*Math.PI;

    public Circle(double banKinh, String color) {
        this.banKinh = banKinh;
        this.color = color;
        this.dientich = banKinh*banKinh*Math.PI;
    }

    public Circle() {
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDientich() {
        return dientich;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "banKinh=" + banKinh +
                ", color='" + color + '\'' +
                ", dientich=" + dientich +
                '}';
    }
}
