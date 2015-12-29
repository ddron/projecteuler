package com.amarkin.projecteuler;

import java.time.DayOfWeek;
import java.util.Iterator;

/**
 * Created by amarkin on 12/5/2015.
 */
public class Problem19 {

    public static void main(String[] args) {
        Date initialDate = new Date(1900, 1, 1);
        Date startDate = new Date(1901, 1, 1);
        Date endDate = new Date(2000, 12, 31);


        int i = 1;
        int sundays = 0;
        boolean start = false;
        for (Date next : initialDate) {
            //System.out.println(next);
            i++;
            if (!start && next.equals(startDate)) {
                start = true;
            }
            if (start && next.isFirstDayOfMonth() &&(i % 7 == 0)) {
                sundays++;
            }
            if (next.equals(endDate)) {
                break;
            }
        }
        System.out.println(sundays);
    }


    private static class Date implements Iterable<Date> {

        int year;
        int month; // from 1 to 12 inclusive
        int day; // from 1 to 31 inclusive

        public Date(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public Iterator<Date> iterator() {
            return new DateIterator(year, month, day);
        }

        public boolean isFirstDayOfMonth() {
            return day == 1;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Date date = (Date) o;

            if (day != date.day) return false;
            if (month != date.month) return false;
            if (year != date.year) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = year;
            result = 31 * result + month;
            result = 31 * result + day;
            return result;
        }

        @Override
        public String toString() {
            return String.format("%s/%s/%s", year, month, day);
        }
    }

    private static class DateIterator implements Iterator<Date> {
        int year;
        int month;
        int day;

        public DateIterator(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Date next() {
            if (month == 12 && day == 31) {
                year++;
                month = 1;
                day = 1;
                return new Date(year, month, day);
            }

            if (isLastDayInMonth()) {
                month++;
                day = 1;
            } else {
                day++;
            }

            return new Date(year, month, day);
        }

        private boolean isLeapYear() {
            return (year % 4 == 0)
                    && (year % 100 != 0 || year % 400 == 0);
        }

        private boolean isLastDayInMonth() {
            return (month == 1 && day == 31)
                    || (month == 2 && (day == 28 && !isLeapYear() || day == 29))
                    || (month == 3 && day == 31)
                    || (month == 4 && day == 30)
                    || (month == 5 && day == 31)
                    || (month == 6 && day == 30)
                    || (month == 7 && day == 31)
                    || (month == 8 && day == 31)
                    || (month == 9 && day == 30)
                    || (month == 10 && day == 31)
                    || (month == 11 && day == 30);
        }
    }
}
