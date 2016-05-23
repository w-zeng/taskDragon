package dragE;

/**
 * Created by wendyzeng on 5/16/16.
 */
import java.util.List;
public class TaskList {
    List<Task> tasks;
   public TaskList(List<Task> t){
       tasks = t;
   }

    public int indexOf(Task t){
        for(int i = 0; i < tasks.size(); i++){
            if(t.equals(tasks.get(i))){
                return i;
            }
        }
        return -1;
    }
}
