import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    public Margin margin;
    public int width = 1;
    public int height = 1;
    public List<String> shape;
    public char backgroundChar = ' ';
    public char edgeChar = '.';

    public Component() {
        shape = new ArrayList<>();
        this.margin = new Margin(0,1,0,1);
    }

    public Margin getMargin() {
        return margin;
    }

    public void setMargin(int top, int right, int bottom, int left) {
        margin.setMargin(top, right, bottom, left);
    }

    public void setMargin(int all) {
        margin.setMargin(all);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setBackgroundChar(char bgChar) {
        this.backgroundChar = bgChar;
    }

    public void setEdgeChar(char edgeChar) {
        this.edgeChar = edgeChar;
    }

    public abstract void initShape();

    public void draw(int line) {
        for(int i = 0; i < margin.left; i++)
            System.out.print(' ');
        initShape();
        if (line >= shape.size())
            for(int i = 0; i <shape.get(0).length(); i++)
                System.out.print(backgroundChar);
        else
            System.out.print(shape.get(line));
        for(int i = 0; i < margin.right; i++)
            System.out.print(' ');
    }

    public void draw() {
        initShape();
        for(int i = 0; i < margin.top; i++)
            System.out.println();
        for(int i = 0; i < shape.size(); i++) {
            draw(i);
            System.out.println();
        }
        for(int i = 0; i < margin.bottom; i++)
            System.out.println();
    }
}
