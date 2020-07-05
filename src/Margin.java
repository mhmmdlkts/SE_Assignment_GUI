public class Margin {
    int top, right, bottom, left;

    public Margin(int top, int right, int bottom, int left) {
        setMargin(top, right, bottom, left);
    }

    public Margin(int all) {
        setMargin(all);
    }

    public Margin() {
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.left = 0;
    }

    public void setMargin(int all) {
        this.top = all;
        this.right = all;
        this.bottom = all;
        this.left = all;
    }

    public void setMargin(int top, int right, int bottom, int left) {
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
    }
}
