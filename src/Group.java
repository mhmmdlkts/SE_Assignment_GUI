public abstract class Group extends Component{

    enum Orientation {
        VERTICAL, HORIZONTAL;
    }

    enum Align {
        LEFT, CENTER, RIGHT;
    }

    Orientation orientation;
    Align align;

    public abstract void addComponent(Component component);
}