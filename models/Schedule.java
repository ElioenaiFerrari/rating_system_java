/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratingsystem.models;

/**
 *
 * @author devapp
 */
public class Schedule {
    private String locale;
    private String monitor;
    private String schedule;
    
    public Schedule(String locale, String monitor, String schedule){
        setLocale(locale);
        setMonitor(monitor);
        setSchedule(schedule);
    }
    /**
     * @return the locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * @param locale the locale to set
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * @return the monitor
     */
    public String getMonitor() {
        return monitor;
    }

    /**
     * @param monitor the monitor to set
     */
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    /**
     * @return the schedule
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * @param schedule the schedule to set
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
   
}
