public class TextField extends Widget {
    String placeHolder;

    public TextField () {
        width = 30;
        height = 3;
    }

    @Override
    public void initShape() {
        if (!shape.isEmpty())
            return;

        for (int i = 0; i < height; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < width; j++) {
                sb.append((i == 0 || j == 0 || i == height-1 || j == width-1) ? edgeChar : backgroundChar);
            }
            shape.add(sb.toString());
        }
    }
}
