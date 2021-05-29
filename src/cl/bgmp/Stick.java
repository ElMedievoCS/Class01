package cl.bgmp;

public class Stick extends Entity {
    private String color;
    private String material;
    private double length;

    public Stick(String color, String material, double length, double x, double y, double z) {
        super(x, y, z);
        this.color = color;
        this.material = material;
        this.length = length;
    }

    public Stick(String color, String material, double length) {
        super();
        this.color = color;
        this.material = material;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void goUp() {
        this.y++;
    }

    public void goUp(double y) {
        this.y = this.y + y;
    }
}
