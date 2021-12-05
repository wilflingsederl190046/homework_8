package net.htlgrieskirchen.pos3.timeutil;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class TimeUtilProTest {

    @Test
    void intToLocalDate() {
        int date = 20030201;
        LocalDate result = TimeUtilPro.intToLocalDate(date);
        LocalDate expResult = LocalDate.of(2003, 2, 1);
        assertEquals(expResult, result);
    }

    @Test
    void longToLocalDate() {
        long date = 200302011234L;
        LocalDate result = TimeUtilPro.longToLocalDate(date);
        LocalDate expResult = LocalDate.of(2003, 2, 1);
        assertEquals(expResult, result);
    }

    @Test
    void dateToLocalDate() {
        Date date = new Date(2003 - 1900, Calendar.FEBRUARY, 1, 12, 34);
        LocalDate result = TimeUtilPro.dateToLocalDate(date);
        LocalDate expResult = LocalDate.of(2003, 2, 1);
        assertEquals(expResult, result);
    }

    @Test
    void calendarToLocalDate() {
        Calendar calendar = new GregorianCalendar(2003, Calendar.FEBRUARY,1);
        LocalDate result = TimeUtilPro.calendarToLocalDate(calendar);
        LocalDate expResult = LocalDate.of(2003, 2, 1);
        assertEquals(expResult, result);
    }

    @Test
    void intToLocalDateTime() {
        int date = 20030201;
        LocalDateTime result = TimeUtilPro.intToLocalDateTime(date);
        LocalDateTime expResult = LocalDateTime.of(2003, 2, 1, 0, 0);
        assertEquals(expResult, result);
    }

    @Test
    void longToLocalDateTime() {
        long date = 200302011234L;
        LocalDateTime result = TimeUtilPro.longToLocalDateTime(date);
        LocalDateTime expResult = LocalDateTime.of(2003, 2, 1, 12, 34);
        assertEquals(expResult, result);
    }

    @Test
    void dateToLocalDateTime() {
        Date date = new Date(2003 - 1900, Calendar.FEBRUARY, 1, 12, 34);
        LocalDateTime result = TimeUtilPro.dateToLocalDateTime(date);
        LocalDateTime expResult = LocalDateTime.of(2003, 2, 1, 12, 34);
        assertEquals(expResult, result);
    }

    @Test
    void calendarToLocalDateTime() {
        Calendar calendar = new GregorianCalendar(2003, Calendar.FEBRUARY,1, 12, 34);
        LocalDateTime result = TimeUtilPro.calendarToLocalDateTime(calendar);
        LocalDateTime expResult = LocalDateTime.of(2003, 2, 1, 12, 34);
        assertEquals(expResult, result);
    }

    @Test
    void localDateToInt() {
        LocalDate l = LocalDate.of(2003, 2, 1);
        int result = TimeUtilPro.localDateToInt(l);
        int expResult = 20030201;
        assertEquals(expResult, result);
    }

    @Test
    void localDateTimeToInt() {
        LocalDateTime l = LocalDateTime.of(2003, 2, 1, 12, 34);
        int result = TimeUtilPro.localDateTimeToInt(l);
        int expResult = 20030201;
        assertEquals(expResult, result);
    }

    @Test
    void localDateToLong() {
        LocalDate l = LocalDate.of(2003, 2, 1);
        long result = TimeUtilPro.localDateToLong(l);
        long expResult = 20030201L;
        assertEquals(expResult, result);
    }

    @Test
    void localDateTimeToLong() {
        LocalDateTime l = LocalDateTime.of(2003, 2, 1, 12, 34);
        long result = TimeUtilPro.localDateTimeToLong(l);
        long expResult = 200302011234L;
        assertEquals(expResult, result);
    }

    @Test
    void localDateToDate() {
        LocalDate l = LocalDate.of(2003, 2, 1);
        Date result = TimeUtilPro.localDateToDate(l);
        Date expResult = new Date(2003 - 1900, Calendar.FEBRUARY, 1);
        assertEquals(expResult, result);
    }

    @Test
    void localDateTimeToDate() {
        LocalDateTime l = LocalDateTime.of(2003, 2, 1, 12, 34);
        Date result = TimeUtilPro.localDateTimeToDate(l);
        Date expResult = new Date(2003 - 1900, Calendar.FEBRUARY, 1, 12, 34);
        assertEquals(expResult, result);
    }

    @Test
    void localDateToCalendar() {
        LocalDate l = LocalDate.of(2003, 2, 1);
        Calendar result = TimeUtilPro.localDateToCalendar(l);
        Calendar expResult = new GregorianCalendar(2003, Calendar.FEBRUARY, 1);
        assertEquals(expResult, result);
    }

    @Test
    void localDateTimeToCalendar() {
        LocalDateTime l = LocalDateTime.of(2003, 2, 1, 12, 34);
        Calendar result = TimeUtilPro.localDateTimeToCalendar(l);
        Calendar expResult = new GregorianCalendar(2003, Calendar.FEBRUARY, 1, 12, 34);
        assertEquals(expResult, result);
    }

    @Test
    void intToLocalDateWithFalseDate() {
        int date = 2003020153;
        LocalDate result = TimeUtilPro.intToLocalDate(date);
        LocalDate expResult = null;
        assertEquals(expResult, result);
    }

}