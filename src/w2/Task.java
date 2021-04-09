package w2;

import java.time.LocalDateTime;

public class Task {

    public enum Category {
        NEW, IN_PROGRESS, DONE
    }

         String taskName;
         String taskDescription;
         Category taskCategory;
         LocalDateTime taskDateTimeStart;
         LocalDateTime taskDateTimeStop;

        public Task(String taskName, String taskDescription, Category taskCategory,
                    LocalDateTime taskDateTimeStop) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStop = taskDateTimeStop;
        this.taskDateTimeStart = LocalDateTime.now();
    }

}





