import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestCase{
  @Test
  public void Testcase1(){
    int [] testArray = new int[]{2,3,1,-4,-4,2};
    assertTrue(SingleCycleCheck.hasSingleCycle(testArray));
  }
}
