import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void team_instantiatesCorrectly_true(){
    Team testTeam = new Team("", "");
    assertTrue(testTeam instanceof Team);
  }
}
