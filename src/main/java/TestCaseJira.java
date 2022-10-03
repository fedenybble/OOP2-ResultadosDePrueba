import java.util.HashMap;
import java.util.Map;

public class TestCaseJira extends TestCase {


    @Override
    public void pushTest(HashMap<String, Boolean> testResults, String nameTest) {
        if(testResults.get(nameTest)){
            System.out.println("This test will be pushed to jira: "+nameTest+" with status = "+testResults.get(nameTest));
        } else {
            System.out.println("Error");
        }
    }


    @Override
    public boolean getTestStatus(HashMap<String, Boolean> testResults, String nameTest){
        return true;
    }
}
