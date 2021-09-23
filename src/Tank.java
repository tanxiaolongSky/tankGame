import lombok.Data;

@Data
public class Tank {
    private int x;
    private int y;
    private int direct;
    private int speed;
    private int type;

    public Tank(int x, int y, int direct, int speed, int type) {
        this.x = x;
        this.y = y;
        this.direct = direct;
        this.speed = speed;
        this.type = type;
    }

    public void moveUp() {
        y -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    public void moveDown() {
        y += speed;
    }

    public void moveLeft() {
        x -= speed;
    }


}
