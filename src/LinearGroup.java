import java.util.ArrayList;

public class LinearGroup extends Group {

    ArrayList<Component> components;

    public LinearGroup() {
        components = new ArrayList<>();
        orientation = Orientation.VERTICAL;
        align = Align.LEFT;
    }

    @Override
    public void initShape() {

    }

    @Override
    public void addComponent(Component component) throws IllegalArgumentException {
        if (this == component)
            throw new IllegalArgumentException();
        components.add(component);
    }

    @Override
    public int getWidth() {
        int max = 0;
        switch (orientation) {
            case VERTICAL:
                for (Component c:components)
                    max = Math.max(c.getWidth(), max);
                break;
            case HORIZONTAL:
                for (Component c:components)
                    max += c.getWidth();
                break;
        }
        return max;
    }

    @Override
    public int getHeight() {
        int max = 0;
        switch (orientation) {
            case HORIZONTAL:
                for (Component c:components)
                    max = Math.max(c.getHeight(), max);
                break;
            case VERTICAL:
                for (Component c:components)
                    max += c.getHeight();
                break;
        }
        return max;
    }

    @Override
    public void draw() {
        switch (orientation) {
            case VERTICAL:
                for (Component c:components) {
                    c.draw();
                    System.out.println();
                }
                break;
            case HORIZONTAL:
                for (int i = 0; i < getHeight(); i++) {
                    for (Component c : components) {
                        c.draw(i);
                    }
                    System.out.println();
                }
                break;
        }
    }

    @Override
    public void draw(int line) {
        switch (orientation) {
            case VERTICAL:
                int item = 0; // total 2
                int x = 0; // total 2*3 = 6

                for (int i = 0; i < components.size(); i++) {
                    if (components.get(item).getHeight() > line) {
                        components.get(item).draw(line);
                        break;
                    }
                    else
                        line -= components.get(item).getHeight();
                }
                break;
            case HORIZONTAL:
                for (Component c : components) {
                    c.draw(line);
                }
                break;
        }
    }
}