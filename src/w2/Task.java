package w2;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class Task {
        String taskName;
        String taskDescription;
        Locale.Category taskCategory;
        java.util.Date  taskDateTimeStart;
        SimpleDateFormat taskDateTimeStop;
    public Task(String taskName, String taskDescription, Locale.Category taskCategory, SimpleDateFormat taskDateTimeStop, java.util.Date  taskDateTimeStart) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStop = taskDateTimeStop;
        this.taskDateTimeStart = taskDateTimeStart;
    }

}





