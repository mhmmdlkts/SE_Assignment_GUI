public interface UIPlatforms {
    void addInputField(String text);
    void addSurveyQuestion(String question, boolean isChecked);
    void addProgressLabel(double value);
    void drawUI();
}
