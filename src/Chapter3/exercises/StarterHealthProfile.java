package Chapter3.exercises;

public class StarterHealthProfile {
    private String firstName;
    private String lastname;
    private  int day;
    private int month;
    private int year;
    private String gender;
    private String dateOfBirth;
    private double height;
    private double weight;
    private int age;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public int getPresentYear() {
        return presentYear;
    }

    public void setPresentYear(int presentYear) {
        this.presentYear = presentYear;
    }

    private int presentYear;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateOfBirth() {
        dateOfBirth = +getDay()+"-"+getMonth()+"-"+getYear();
        return dateOfBirth;
    }

    public void setDateOfBirth(int day, int month, int year) {
      setDay(day);
      setMonth(month);
      setYear(year);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double pound) {
        this.weight = pound;
    }

    public int calculateAge(){
        return age = presentYear - year;
    }
    public double calculateBodyMassIndex(){
        double bodyMassIndex;
        return bodyMassIndex =  (getWeight() /(getHeight() * getHeight())) * 703;
    }
    public int calculateMaximumHeartRate(){
        int maximumHeartRate;
        return maximumHeartRate = 220 -age;
    }
    public double caluculateTargetHeartRate1(){
        double targetHeartRate1;
        return targetHeartRate1 =  calculateMaximumHeartRate() * 0.5;

    }
    public double calculateTargetHeartRate2(){
        double targetHeartRate2;
        return targetHeartRate2 = calculateMaximumHeartRate() * 0.85;
    }
    public String targetHeartRate(){
        String targerHeart = "The target Heart Rate of 50% and 85% is "+caluculateTargetHeartRate1()+" and "+calculateTargetHeartRate2()+"\n";
        return targerHeart;
    }
public String displayProile(){
        String displayProile = "\n"+
                "Last Name : "+getLastname()+"\n"+
                "First Name : "+getFirstName()+"\n"+
                "Gender : "+ getGender()+"\n"+
                "Date of Birth : "+getDateOfBirth()+"\n"+
                "Height : "+getHeight()+"Inches"+"\n"+
                "Weight : "+getWeight()+"Pounds"+"\n"+
                "Age : "+calculateAge()+"year"+"\n"+
                "BMI(Body Mass Index) :" + Math.round(calculateBodyMassIndex()) +"\n"+
                "Maximum Heart Rate : "+calculateMaximumHeartRate()+"\n"+
                "Target Heart Rate Range :"+targetHeartRate()+"\n";
        return displayProile
                ;

}

}

