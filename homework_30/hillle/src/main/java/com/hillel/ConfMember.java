package com.hillel;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;

public class ConfMember {
    private DateTimeZone timeZone;
    private LocalTime startWork;
    private LocalTime endWork;

    public ConfMember(DateTimeZone timeZone, LocalTime startWork, LocalTime endWork) {
        this.timeZone = timeZone;
        this.startWork = startWork;
        this.endWork = endWork;
    }

    public DateTimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(DateTimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public LocalTime getStartWork() {
        return startWork;
    }

    public void setStartWork(LocalTime startWork) {
        this.startWork = startWork;
    }

    public LocalTime getEndWork() {
        return endWork;
    }

    public void setEndWork(LocalTime endWork) {
        this.endWork = endWork;
    }

    public boolean isWorkHour(DateTime dt){
        LocalTime memberTime = dt.toDateTime(timeZone).toLocalTime();
        return ((memberTime.compareTo(startWork)) == 1) && ((memberTime.compareTo(endWork)) == -1);
    }

    public DateTime getMemberDateTime(DateTime dt){
        return dt.toDateTime(timeZone);
    }

}
