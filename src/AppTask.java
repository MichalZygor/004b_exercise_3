public class AppTask {

    public boolean highPriority(Tasks tasks){
        return tasks.getPriority()>0;
    }

    public boolean mediumPriority(Tasks tasks){
        return tasks.getPriority()==0;
    }

    public boolean lowPriority(Tasks tasks){
        return tasks.getPriority()<0;
    }

}
