package dragE;
/**
 * Created by wendyzeng on 5/16/16.
 */
public class Task {
    protected boolean complete = false;
    protected String description;

    public Task(){
        description = null;
    }
    public Task(String d){
        description = d;
    }

    public boolean getCompletion(){
        return complete;

    }

    public void setCompeletion(boolean x){
        complete = x;
    }

    public String getDescription(){
        return description;
    }
}
