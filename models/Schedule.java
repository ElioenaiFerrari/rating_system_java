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
    private String stars;

    public Schedule(String locale, String monitor, String schedule, String stars){
        setLocale(locale);
        setMonitor(monitor);
        setSchedule(schedule);
        setStars(stars);
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
    
    /**
     * @return the stars
     */
    public String getStars() {
        return stars;
    }

    /**
     * @param stars the stars to set
     */
    public void setStars(String stars) {
        this.stars = stars;
    }
   
}
