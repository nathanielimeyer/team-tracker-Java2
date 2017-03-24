import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void team_instantiatesCorrectly_true(){
    Team testTeam = new Team("", "");
    assertTrue(testTeam instanceof Team);
  }

  @Test
  public void getName_teamInstantiatesWithName_FieryPhoenix(){
    Team testTeam = new Team("Fiery Phoenix", "Integrate app A with app B");
    assertEquals("Fiery Phoenix", testTeam.getName());
  }

  @Test
  public void getTeamGoal_teamInstantiatesWithName_FieryPhoenix(){
    Team testTeam = new Team("Fiery Phoenix", "Integrate app A with app B");
    assertEquals("Integrate app A with app B", testTeam.getGoal());
  }

  @Test
  public void all_returnsAllInstancesOfTeam_true(){
    Team firstTeam = new Team("Fiery Phoenix", "Integrate app A with app B");
    Team secondTeam = new Team("Cool Ranch", "Integrate Doritos with stomach");
    assertTrue(Team.all().contains(firstTeam));
    assertTrue(Team.all().contains(secondTeam));
  }

  @Test
  public void clear_emptiesAllTeamsFromList_0(){
    Team testTeam = new Team("Cool Ranch", "Integrate Doritos with stomach");
    Team.clearTeams();
    assertEquals(0, Team.all().size());
  }

  @Test
  public void getId_teamInstantiatesWithAnID_1(){
    Team.clearTeams();
    Team testTeam = new Team("Cool Ranch", "Integrate Doritos with stomach");
    assertEquals(1, testTeam.getId());
  }

  @Test
  public void find_returnsTeamWithSameId_secondTeam(){
    Team.clearTeams();
    Team firstTeam = new Team("Fiery Phoenix", "Integrate app A with app B");
    Team secondTeam = new Team("Cool Ranch", "Integrate Doritos with stomach");
    assertEquals(Team.find(secondTeam.getId()), secondTeam);
  }
}
