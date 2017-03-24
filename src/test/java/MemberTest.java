import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void member_instantiatesCorrectly_true(){
    Member testMember = new Member("Bonita Appelbaum","lisp");
    assertTrue(testMember instanceof Member);
  }

  @Test
  public void member_instantiatesWithName_BonitaAppelbaum(){
    Member testMember = new Member("Bonita Appelbaum","lisp");
    assertEquals("Bonita Appelbaum", testMember.getName());
  }

  @Test
  public void member_instantiatesWithSpecialty_BonitaAppelbaum(){
    Member testMember = new Member("Bonita Appelbaum","lisp");
    assertEquals("lisp", testMember.getSpecialty());
  }

  @Test
  public void all_returnsAllInstancesOfMember_true(){
    Member firstMember = new Member("Bonita Appelbaum","lisp");
    Member secondMember = new Member("Rachel Markowitz","erlang");
    assertTrue(Member.all().contains(firstMember));
    assertTrue(Member.all().contains(secondMember));
  }

  @Test
  public void clear_emptiesAllMembersFromList_0(){
    Member testMember = new Member("Bonita Appelbaum","lisp");
    Member.clearMembers();
    assertEquals(0, Member.all().size());
  }

  @Test
  public void getId_memberInstantiatesWithAnID_1(){
    Member.clearMembers();
    Member testMember = new Member("Bonita Appelbaum","lisp");
    assertEquals(1, testMember.getId());
  }

  @Test
  public void find_returnsMemberWithSameId_secondMember(){
    Member.clearMembers();
    Member firstMember = new Member("Bonita Appelbaum","lisp");
    Member secondMember = new Member("Rachel Markowitz","erlang");
    assertEquals(Member.find(secondMember.getId()), secondMember);
  }
}
