public class Time {
    private int hour;

    private int minute;

    private int second;


    //default constructor
    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }


    //input constructor
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    //incrementer function to increase time
    public void increment(int incrementVal){
        this.second = this.second + incrementVal;
        if(this.second >= 60){
            int carry = this.second;
            this.second = carry % 60;
            this.minute = carry / 60 + this.minute;
        }
        if(this.minute >= 60){
            int carry2 = this.minute;
            this.minute = carry2 % 60;
            this.hour = carry2 / 60 + this.hour;
        }
        if (this.hour >= 24) {
            this.hour = this.hour - 24;
        }
    }

    //printer to determine between 24 and 12 hr time
    public void print(boolean military){
        //statements to sort out proper formatting (i.e. if minute or second are single digit, add a leading zero)
        String min;
        String sec;
        if(this.minute < 10) {
            min = "0" + this.minute;
        }else{
            min = String.valueOf(this.minute);
        }
        if(this.second < 10) {
            sec = "0" + this.second;
        }else{
            sec = String.valueOf(this.second);
        }

        if(military){
            System.out.println(this.hour + ":" + min + ":" + sec);
        }else{
            if(this.hour > 12){
                System.out.println(this.hour - 12 + ":" + min + ":" + sec + " PM");
            }else{
                System.out.println(this.hour + ":" + min + ":" + sec + " AM");
            }
        }
    }

    //reads a string into an int
    public static Time fromString(String HMS){
        String[] arrOfHMS = HMS.split(":");
        int hour = Integer.parseInt(arrOfHMS[0]);
        int minute = Integer.parseInt(arrOfHMS[1]);
        int second = Integer.parseInt(arrOfHMS[2]);

        return new Time(hour, minute, second);
    }
}
