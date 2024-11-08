package designpatterns.command;

public class Question {
    private String questionID;
    private String description;
    private int marks;

    public Question(String questionID, String description, int marks) {
        this.questionID = questionID;
        this.description = description;
        this.marks = marks;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(this.getClass())) {
            return false;
        }
        if (obj instanceof Question) {
            Question question = (Question) obj;
            return questionID.equals(question.questionID);
        }
        return false;
    }

    @Override
    public int hashCode() {
        if(questionID==null)return 7;
        return questionID.hashCode();
    }
}
