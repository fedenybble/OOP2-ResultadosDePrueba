import java.util.HashMap;

public class TestCaseGetStatus extends TestCase{
    @Override
    public void pushTest(HashMap<String, Boolean> testResults, String nameTest) {

    }

    @Override
    public boolean getTestStatus(HashMap<String, Boolean> testResults, String nameTest) {
        if (testResults.get(nameTest)){
            System.out.println("This test status is: OK. Status = "+testResults.get(nameTest));
        }
        return true;
    }
}
