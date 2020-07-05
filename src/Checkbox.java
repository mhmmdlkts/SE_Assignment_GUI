public class Checkbox extends Widget {
    boolean isChecked;
    char checkedSymbol;
    char uncheckedSymbol;

    public Checkbox() {
        checkedSymbol = '✓';
        uncheckedSymbol = 'x';
        isChecked = false;
        setSize(3);
    }

    public void setSize(int size) {
        boolean isOdd = size%2==1;
        super.setHeight(isOdd?size:size+1);
        super.setWidth(size*2+(isOdd?-1:1));
    }

    @Override
    public void initShape() {
        if (!shape.isEmpty())
            return;

        for (int i = 0; i < height; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < width; j++) {
                if (height/2 == i && width/2 == j)
                    sb.append(isChecked ? checkedSymbol : uncheckedSymbol);
                else
                    sb.append((i == 0 || j == 0 || i == height-1 || j == width-1) ? edgeChar : backgroundChar);
            }
            shape.add(sb.toString());
        }
    }
}
