import java.util.List;
import java.util.ArrayList;

public class Team {
  private String mName;
  private String mGoal;
  private static List<Team> instances = new ArrayList<Team>();
  private int mId;

  public Team(String name, String goal){
    mName = name;
    mGoal = goal;
    instances.add(this);
    mId = instances.size();
  }

  public String getName(){
    return mName;
  }

  public String getGoal(){
    return mGoal;
  }

  public static List<Team> all(){
    return instances;
  }

  public static void clearTeams() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Team find(int id) {
    return instances.get(id - 1);
  }

  
}
