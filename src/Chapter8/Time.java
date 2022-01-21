package Chapter8;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private void validate(int hour, int minute, int second)  {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    private void validateMinute(int minute)  {
        boolean minuteIsNotValid = minute <0 || minute > 59;
        if (minuteIsNotValid){throw new IllegalArgumentException("Minute is not valid");}
    }

    private void validateHour(int hour) {
        boolean hourIsNotValid = hour <0 || hour >=23;
        if (hourIsNotValid){throw new IllegalArgumentException("Hour is not valid");}
    }
    private void validateSecond(int second) {
        boolean secondIsNotValid = second < 0 || second >= 59;
        if (secondIsNotValid) {
            throw new IllegalArgumentException("Second is not valid");}
    }
    public void setHour(int hour){
        validateHour(hour);
        this.hour = hour;
    }
}

