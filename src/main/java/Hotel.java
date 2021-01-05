public class Hotel {

    String hotelName;
    int weekdayRegularRate;
    int weekendRegularRate;
    int weekdayRewardRate;
    int weekendRewardRate;
    int raiting;
    int Total;

    public Hotel() {

    }

    public Hotel(String hotelName, int weekdayRegularRate, int weekdayRewardRate, int weekendRegularRate,int weekendRewardRate,int raiting) {
        this.hotelName = hotelName;
        this.weekdayRegularRate = weekdayRegularRate;
        this.weekdayRewardRate = weekdayRewardRate;
        this.weekendRegularRate = weekendRegularRate;
        this.weekendRewardRate = weekendRewardRate;
        this.raiting = raiting;
    }

    public String getHotelName() {

        return hotelName;
    }

    public void setHotelName(String hotelName) {

        this.hotelName = hotelName;
    }

    public int getWeekdayRegularRate() {

        return weekdayRegularRate;
    }

    public void setWeekdayRegularRate(int weekdayRegularRate) {

        this.weekdayRegularRate = weekdayRegularRate;
    }

    public int getWeekendRegularRate() {

        return weekendRegularRate;
    }

    public void setWeekendRegularRate(int weekendRegularRate) {

        this.weekendRegularRate = weekendRegularRate;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public int getTotal() {
        return Total;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public int getWeekdayRewardRate() {
        return weekdayRewardRate;
    }
    

    public void setWeekdayRewardRate(int weekdayRewardRate) {
        this.weekdayRewardRate = weekdayRewardRate;
    }

    public int getWeekendRewardRate() {
        return weekendRewardRate;
    }

    public void setWeekendRewardRate(int weekendRewardRate) {
        this.weekendRewardRate = weekendRewardRate;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdayRegularRate=" + weekdayRegularRate +
                ", weekendRegularRate=" + weekendRegularRate +
                ", weekdayRewardRate=" + weekdayRewardRate +
                ", weekendRewardRate=" + weekendRewardRate +
                ", raiting=" + raiting +
                '}';
    }
  

}

