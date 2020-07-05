import java.util.ArrayList;

public class Label extends Widget {

    public String text;

    public Label () {
        width = 30;
        height = 1;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void initShape() {
        if (!shape.isEmpty())
            return;
        for (int i = 0; i < height; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < width; j++) {
                sb.append(getCharAt(j, i));
            }
            shape.add(sb.toString());
        }
    }

    private char getCharAt(int x, int y) {
        if ((height>1 && height/2 != y))
            return backgroundChar;
        if (x < text.length())
            return text.charAt(x);
        return backgroundChar;
    }
}
