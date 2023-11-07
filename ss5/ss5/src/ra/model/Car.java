package ra.model;

public class Car {
    private String code;
    private String color;
    private String role;
    private String cuont;

    public void run() {
        System.out.println("running");
    }

    public Car() {
    }

    public Car(String code, String color) {
        this.code = code;
        this.color = color;
    }

    public Car(String code, String color, String role, String cuont) {
        this.code = code;
        this.color = color;
        this.role = role;
        this.cuont = cuont;
    }

    public void stop() {
        System.out.println("stop");
    }

    @Override
    public String toString() {
        return "Car{" +
                "code='" + code + '\'' +
                ", color='" + color + '\'' +
                ", role='" + role + '\'' +
                ", cuont='" + cuont + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCuont() {
        return cuont;
    }

    public void setCuont(String cuont) {
        this.cuont = cuont;
    }
}
