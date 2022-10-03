import java.util.HashMap;
import java.util.Map;

public class TestStatus {

    public TestStatus(){}

    public void getTestResultsStatus(HashMap<String, Boolean> testResults){

        for (Map.Entry<String, Boolean> dato : testResults.entrySet()) {
            if (dato.getValue() == false){
                System.out.println("Test fail!: "+dato.getKey());
            } else if (dato.getValue() == true){
                System.out.println("Test OK, no problem: "+dato.getKey());
            } else {
                System.out.println("Test Vacio: "+dato.getKey());
            }
        }

    }
}
