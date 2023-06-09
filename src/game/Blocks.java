package game;

import java.awt.*;

public class Blocks extends Rectangle {

    public Blocks(int x, int y) {
        super(x, y, 32, 32);
    }

    public void render(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.fillRect(x, y, width, height);
        g.setColor(Color.black);
        g.fillRect(x + 8, y + 8, width - 16, height - 16);
    }
}
