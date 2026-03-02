package hackerrank_test;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<List<String>> logs = new ArrayList<List<String>>();

        List<String> log1 = new ArrayList<String>();
        log1.add("01-01-2023");
        log1.add("15-00");
        log1.add("INFO");
        log1.add("established");
        logs.add(log1);

        List<String> log2 = new ArrayList<String>();
        log2.add("01-01-2023");
        log2.add("01:30");
        log2.add("ERROR");
        log2.add("Failed");
        logs.add(log2);

        List<String> log3 = new ArrayList<String>();
        log3.add("01-01-2024");
        log3.add("09-30");
        log3.add("CRITICAL");
        log3.add("Crash");
        logs.add(log3);

        List<String> log4 = new ArrayList<String>();
        log4.add("02-01-2024");
        log4.add("08-00");
        log4.add("ERROR");
        log4.add("Disk error");
        logs.add(log4);
        List<List<String>> result =
                LogAnalyzer.extractErrorLogs(logs);

        System.out.println("Filtered & Sorted Error Logs:");
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
