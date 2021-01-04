import java.text.ParseException;

public class HotelReservation {


    public static void main(String[] args){

        Functions functions=new Functions();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("--Welcome to Hotel Rates Program--");
        System.out.println(" ");

        functions.addHotel();
        functions.showHotelInfo();

        System.out.println(" ");
        System.out.println("*Cheapest Hotel Based on WeekdayRegularRate");
        functions.findCheapestHotelOne("01-Jan-2021","05-Jan-2021");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("*Cheapest Hotel Based on WeekendRegularRate");
        functions.findCheapestHotelTwo("01-Jan-2021","05-Jan-2021");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("*Cheapest best Rated Hotel Based on WeekendRegularRate");
        functions.findCheapestHotelRaitingForRegular("01-Jan-2021","05-Jan-2021");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("*Cheapest best Rated Hotel Based on WeekendRewardRate");
        functions.findCheapestHotelRaitingForReward("01-Jan-2021","05-Jan-2021");
        System.out.println(" ");


        System.out.println(" ");
        System.out.println("*Cheapest best Rated Hotel Based on WeekdayRewardRate");
        functions.findCheapestHotelRaitingForRewardTwo("01-Jan-2021","05-Jan-2021");
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }


}
