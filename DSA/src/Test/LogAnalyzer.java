package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class LogAnalyzer {

    public static List<List<String>> extractErrorLogs(List<List<String>> logs) {

        List<LogEntry> temp = new ArrayList<LogEntry>();
        for (int i = 0; i < logs.size(); i++) {

            List<String> log = logs.get(i);
            String status = log.get(2);

            if (status.equals("ERROR") || status.equals("CRITICAL")) {

                long key = buildArrivalKey(log.get(0), log.get(1));
                temp.add(new LogEntry(log, key, i));
            }
        }
        Collections.sort(temp, new Comparator<LogEntry>() {
            public int compare(LogEntry a, LogEntry b) {

                if (a.arrivalKey < b.arrivalKey)
                    return -1;
                if (a.arrivalKey > b.arrivalKey)
                    return 1;
                return a.index - b.index;
            }
        });
        List<List<String>> result = new ArrayList<List<String>>();
        for (int i = 0; i < temp.size(); i++) {
            result.add(temp.get(i).log);
        }

        return result;
    }
    private static long buildArrivalKey(String date, String time) {

        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6, 10));

        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));

        return year * 100000000L
                + month * 1000000L
                + day * 10000L
                + hour * 100L
                + minute;
    }
}

