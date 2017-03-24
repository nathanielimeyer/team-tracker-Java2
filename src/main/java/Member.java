import java.util.List;
import java.util.ArrayList;

public class Member {
  private String mName;
  private String mSpecialty;
  private static List<Member> instances = new ArrayList<Member>();
  private int mId;

  public Member (String name, String specialty) {
    mName = name;
    mSpecialty = specialty;
    instances.add(this);
    mId = instances.size();
  }

  public String getName() {
    return mName;
  }

  public String getSpecialty() {
    return mSpecialty;
  }

  public static List<Member> all(){
    return instances;
  }

  public static void clearMembers() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Member find(int id) {
    return instances.get(id - 1);
  }
}
