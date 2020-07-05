public class ProgressBar extends Widget{
    double value;
    double maxValue;
    char valueSymbol;

    public ProgressBar() {
        valueSymbol = '✓';
        maxValue = 100;
        value = 0;
        width = 30;
        height = 3;
    }

    private double getPercent() {
        return value/maxValue;
    }

    private boolean isFull(int i) {
        return (i)/(float)(width) < getPercent();
    }

    @Override
    public void initShape() {
        if (!shape.isEmpty())
            return;

        for (int i = 0; i < height; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < width; j++) {
                if (i == 0 || j == 0 || i == height-1 || j == width-1)
                    sb.append(edgeChar);
                else
                    sb.append(isFull(j)? valueSymbol : backgroundChar);
            }
            shape.add(sb.toString());
        }
    }
}
