package Chapter3.exercises;

public class Clock {
 private int hour;
 private int minute;
 private int second;
 private String displayTime;

 public void setHours(int theHour) {
  hour = theHour;
 }

 ;

 public int getHours() {
  if (hour < 24) return hour;
  return 0;
 }

 public void setMinutes(int theMinute) {
  minute = theMinute;
 }

 public int getMinutes() {
  if (minute < 59) return minute;
  return 0;
 }

 public void setSeconds(int theSecond) {
  second = theSecond;
 }

 public int getSecond() {
  if (second < 59) return second;
  return 0;
 }

 public String displayTime(){
  displayTime = "The Time is "+getHours()+":"+getMinutes()+":"+getSecond()+"\n";
  return displayTime;
 }

}

