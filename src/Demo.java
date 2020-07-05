import java.io.IOException;

public class Demo {
    public static void main(String args[]) throws IOException {

        Group root = new LinearGroup();
        root.orientation = Group.Orientation.VERTICAL;

        Group group1 = new LinearGroup();
        group1.orientation = Group.Orientation.HORIZONTAL;
        root.addComponent(group1);

        Label lbl_name = new Label();
        lbl_name.text = "Type your name:";
        group1.addComponent(lbl_name);
        lbl_name.setHeight(3);

        TextField tf = new TextField();
        group1.addComponent(tf);

        Group group2 = new LinearGroup();
        group2.orientation = Group.Orientation.HORIZONTAL;
        root.addComponent(group2);

        Label lbl_q1 = new Label();
        lbl_q1.text = "Do you like programming?";
        group2.addComponent(lbl_q1);
        lbl_q1.setHeight(3);

        Checkbox cb1 = new Checkbox();
        cb1.isChecked = true;
        group2.addComponent(cb1);

        Group group3 = new LinearGroup();
        group3.orientation = Group.Orientation.HORIZONTAL;
        root.addComponent(group3);

        Label lbl_q2 = new Label();
        lbl_q2.text = "Do you like debugging?";
        group3.addComponent(lbl_q2);
        lbl_q2.setHeight(3);

        Checkbox cb2 = new Checkbox();
        cb2.isChecked = false;
        group3.addComponent(cb2);

        //loading bar
        ProgressBar pg = new ProgressBar();
        pg.setMargin(2,0,0,0);
        pg.setWidth(62);
        pg.value = 70;
        root.addComponent(pg);

        root.draw();
    }
}




