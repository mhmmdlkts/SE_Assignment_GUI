public class ASCII_Strategy implements UIPlatforms {
        Group root;

    public ASCII_Strategy() {
        root = new LinearGroup();
        root.orientation = Group.Orientation.VERTICAL;
    }

    @Override
    public void addInputField(String text) {
        Group group = new LinearGroup();
        group.orientation = Group.Orientation.HORIZONTAL;
        root.addComponent(group);

        Label lbl_name = new Label();
        lbl_name.text = text;
        group.addComponent(lbl_name);
        lbl_name.setHeight(3);

        TextField tf = new TextField();
        group.addComponent(tf);
    }

    @Override
    public void addSurveyQuestion(String question, boolean isChecked) {
        Group group = new LinearGroup();
        group.orientation = Group.Orientation.HORIZONTAL;
        root.addComponent(group);

        Label lbl_q1 = new Label();
        lbl_q1.text = question;
        group.addComponent(lbl_q1);
        lbl_q1.setHeight(3);

        Checkbox cb1 = new Checkbox();
        cb1.isChecked = isChecked;
        group.addComponent(cb1);
    }

    @Override
    public void addProgressLabel(double value) {
        ProgressBar pg = new ProgressBar();
        pg.setMargin(2,0,0,0);
        pg.setWidth(62);
        pg.value = value;
        root.addComponent(pg);
    }

    @Override
    public void drawUI() {
        root.draw();
    }
}
