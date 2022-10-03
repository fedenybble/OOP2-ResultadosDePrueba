import java.util.HashMap;

public abstract class TestCase {

    public abstract void pushTest(HashMap<String, Boolean> testResults, String nameTest);

    public boolean  getTestStatus(HashMap<String, Boolean> testResults, String nameTest){
        return testResults.get(nameTest);
    }

}
