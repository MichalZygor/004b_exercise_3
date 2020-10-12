public class Tasks {
    private String caption;
    private String description;
    private int priority;   // high -->1, normal --> 0, low --> -1
    Person person;

    public Tasks(String caption, String description, int priority, Person person){
        this(caption,description,priority);
        setPerson(person);
    }

    public Tasks(String caption, String description, int priority) {
        this(caption, description);
        this.priority = priority;
    }

    public Tasks(String caption, String description) {
        this.caption = caption;
        this.description = description;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


    public void setPerson(Person person) {
        this.person = person;
    }
}
