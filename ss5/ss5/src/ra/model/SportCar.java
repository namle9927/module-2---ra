package ra.model;

public class SportCar extends Car{
    private String light;

    public SportCar(String light) {
        this.light = light;
    }

    public SportCar(String code, String color, String role, String cuont, String light) {
        super(code, color, role, cuont);
        this.light = light;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "light='" + light + '\'' +
                '}';
    }
}
