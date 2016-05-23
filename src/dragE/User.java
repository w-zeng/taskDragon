package dragE;

/**
 * Created by wendyzeng on 5/16/16.
 */
import java.util.List;
public class User {
    Dragon drag;
    List<Habit> habits;
    List<Todo> todos;
    List<Dragon> dragons;
    public User(){
        drag = new Dragon();
    }

    public void completeTask(Task m){
        //increment age
    }

    public void completeHabit(Habit h){
       /* if(user clicked +){
            //increment hp
        }
        else{
            //decrement hp
        }
        */
    }

    public Dragon getDragon(){
        return drag;
    }

    public void addHabit(Habit m){
        habits.add(m);
    }

    public Habit removeHabit(Habit m){
        habits.remove(m);
        return m;
    }

    public void addTodo(Todo m){
        todos.add(m);
    }

    public void removeTodo(Todo m){
        todos.remove(m);
    }

    public void release(Dragon g){
        dragons.add(g);
        drag = new Dragon();

    }

    public List<Dragon> getDrags(){
        return dragons;
    }
}
