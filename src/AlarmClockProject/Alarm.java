package AlarmClockProject;

import java.time.LocalDateTime;

public class Alarm {

    private LocalDateTime localdateTime;

    private String reminder;

    public LocalDateTime getLocaldateTime() {
        return localdateTime;
    }

    public void setLocaldateTime(LocalDateTime localdateTime) {
        this.localdateTime = localdateTime;
    }

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }
}
