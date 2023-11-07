package bt1;

public class Cylinder extends Circle {
    private double chieuCao;

    public Cylinder(double banKinh, String color, double chieuCao) {
        super(banKinh, color);
        this.chieuCao = chieuCao;
    }

    public Cylinder() {
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double tinhTheTich() {
        return super.getDientich() * chieuCao;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "ban kinh day= " + super.getBanKinh() +
                "chieuCao= " + chieuCao + "dien tich day= " + getDientich() + "the tich= " + tinhTheTich() +
                '}';
    }
}
