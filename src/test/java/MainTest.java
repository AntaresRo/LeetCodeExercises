import org.example.SingleNumber;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testSingleNumber(){

        SingleNumber singleNumberTest = new SingleNumber();

        int[] nums2 = {2, 4, 3, 2, 4};
        int result = singleNumberTest.singleNumber(nums2);
        Assert.assertEquals(3, result);

    }

}
