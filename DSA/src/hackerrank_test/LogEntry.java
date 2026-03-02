package hackerrank_test;

import java.util.List;

class LogEntry {
    List<String> log;
    long arrivalKey;
    int index;

    LogEntry(List<String> log, long arrivalKey, int index) {
        this.log = log;
        this.arrivalKey = arrivalKey;
        this.index = index;
    }
}
