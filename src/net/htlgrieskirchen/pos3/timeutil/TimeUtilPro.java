package net.htlgrieskirchen.pos3.timeutil;

import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class TimeUtilPro
{   
    private TimeUtilPro() {
    }

    // ########## LOCALDATE METHODS ##########
    
    public static LocalDate intToLocalDate(int date) {
        String dateString = String.valueOf(date);
        if(dateString.length() != 8) {
            new IllegalArgumentException("The date is not in a correct format! (yyyymmddhhmm)").printStackTrace();
            return null;
        }
        int year = Integer.parseInt(dateString.substring(0, 4));
        int month = Integer.parseInt(dateString.substring(4, 6));
        int day = Integer.parseInt(dateString.substring(6));
        if(year > 9999 || month < 1 || month > 12 || day < 1 || day > 31) {
            new IllegalArgumentException("The specification of year, month or day is wrong!").printStackTrace();
            return null;
        }
        return LocalDate.of(year, month, day);
    }

    public static LocalDate longToLocalDate(long dateTime) {
        String dateString = String.valueOf(dateTime);
        if(dateString.length() != 12) {
            new IllegalArgumentException("The date is not in a correct format! (yyyymmddhhmm)").printStackTrace();
            return null;
        }
        int year = Integer.parseInt(dateString.substring(0, 4));
        int month = Integer.parseInt(dateString.substring(4, 6));
        int day = Integer.parseInt(dateString.substring(6, 8));
        if(year > 9999 || month < 1 || month > 12 || day < 1 || day > 31) {
            new IllegalArgumentException("The specification of year, month or day is wrong!").printStackTrace();
            return null;
        }
        return LocalDate.of(year, month, day);
    }
    
    public static LocalDate dateToLocalDate(Date dateTime) {
        return LocalDate.ofInstant(dateTime.toInstant(), ZoneId.systemDefault());
    }
    
    public static LocalDate calendarToLocalDate(Calendar dateTime) {
        return LocalDate.ofInstant(dateTime.toInstant(), ZoneId.systemDefault());
    }
    
    // ########## LOCALDATETIME METHODS ##########
            
    public static LocalDateTime intToLocalDateTime(int date) {
        String dateString = String.valueOf(date);
        if(dateString.length() != 8) {
            new IllegalArgumentException("The date is not in a correct format! (yyyymmdd)").printStackTrace();
            return null;
        }
        int year = Integer.parseInt(dateString.substring(0, 4));
        int month = Integer.parseInt(dateString.substring(4, 6));
        int day = Integer.parseInt(dateString.substring(6, 8));
        if(year > 9999 || month < 1 || month > 12 || day < 1 || day > 31) {
            new IllegalArgumentException("The specification of year, month or day is wrong!").printStackTrace();
            return null;
        }
        return LocalDateTime.of(year, month, day, 0, 0);
    }
    
    public static LocalDateTime longToLocalDateTime(long dateTime) {
        String dateString = String.valueOf(dateTime);
        if(dateString.length() != 12) {
            new IllegalArgumentException("The date is not in a correct format! (yyyymmddhhmm)").printStackTrace();
            return null;
        }
        int year = Integer.parseInt(dateString.substring(0, 4));
        int month = Integer.parseInt(dateString.substring(4, 6));
        int day = Integer.parseInt(dateString.substring(6, 8));
        int hours = Integer.parseInt(dateString.substring(8, 10));
        int minutes = Integer.parseInt(dateString.substring(10, 12));
        if(year > 9999 || month < 1 || month > 12 || day < 1 || day > 31) {
            new IllegalArgumentException("The specification of year, month or day is wrong!").printStackTrace();
            return null;
        }
        return LocalDateTime.of(year, month, day, hours, minutes);
    }
    
    public static LocalDateTime dateToLocalDateTime(Date dateTime) {
        return LocalDateTime.ofInstant(dateTime.toInstant(), ZoneId.systemDefault());
    }
    
    public static LocalDateTime calendarToLocalDateTime(Calendar dateTime) {
        return LocalDateTime.ofInstant(dateTime.toInstant(), ZoneId.systemDefault());
    }
           
    // ########## INT METHODS ##########
    
    public static int localDateToInt(LocalDate date) {
        if(date == null){
            return 0;
        }
        return Integer.parseInt(date.toString().replace("-", ""));
    }

    public static int localDateTimeToInt(LocalDateTime dateTime) {
        if(dateTime == null){
            return 0;
        }
        return Integer.parseInt(dateTime.toString().substring(0, 10).replace("-", ""));
    }

    // ########## LONG METHODS ##########
    
    public static long localDateToLong(LocalDate date) {
        if(date == null){
            return 0;
        }
        return Long.parseLong(date.toString().replace("-", ""));
    }

    public static long localDateTimeToLong(LocalDateTime dateTime) {
        if(dateTime == null){
            return 0;
        }
        return Long.parseLong(dateTime.toString().replace("-", "").replace("T", "").replace(":", ""));
    }

    // ########## DATE METHODS ##########
    
    @SuppressWarnings("deprecation")
    public static Date localDateToDate(LocalDate date) {
        if(date == null){
            return null;
        }
        return Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    @SuppressWarnings("deprecation")
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        if(dateTime == null){
            return null;
        }
        return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    // ########## CALENDAR METHODS ##########
    
    public static Calendar localDateToCalendar(LocalDate date) {
        if(date == null){
            return null;
        }
        int year = date.getYear();
        int month = date.getMonthValue()-1;
        int day = date.getDayOfMonth();
        return new GregorianCalendar(year, month, day);
    }

    public static Calendar localDateTimeToCalendar(LocalDateTime dateTime) {
        if(dateTime == null){
            return null;
        }
        int year = dateTime.getYear();
        int month = dateTime.getMonthValue()-1;
        int day = dateTime.getDayOfMonth();
        int hours = dateTime.getHour();
        int minutes = dateTime.getMinute();
        int seconds = dateTime.getSecond();
        return new GregorianCalendar(year, month, day, hours, minutes, seconds);
    }

}
