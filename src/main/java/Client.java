import java.util.HashMap;

public class Client {

    public static void main(String[] args) {

        HashMap<String, Boolean> testResults = new HashMap<String, Boolean>();

        // Format (NombreTest, EstadoTest)
        testResults.put("TC1", true);
        testResults.put("TC2", true);
        testResults.put("TC3", true);
        testResults.put("TC4", false);
        testResults.put("TC5", true);
        testResults.put("TC6", true);
        testResults.put("TC7", false);
        testResults.put("TC8", true);
        testResults.put("TC9", false);
        testResults.put("TC10", true);
        testResults.put("TC11", false);
        testResults.put("TC12", true);

        TestStatus testStatus = new TestStatus();
        TestCaseJira testCaseJira = new TestCaseJira();
        TestCaseGetStatus testCaseGetStatus = new TestCaseGetStatus();

        testStatus.getTestResultsStatus(testResults);

        System.out.println("--------------------------------------------");

        testCaseJira.pushTest(testResults, "TC5");

        System.out.println("--------------------------------------------");

        testCaseGetStatus.getTestStatus(testResults, "TC3");


    }
}
