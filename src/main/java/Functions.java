import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Stream;

public class Functions {

    ArrayList<Hotel> myHotelList = new ArrayList();                                                //Array

    //UC1-UC3-UC5
    public void addHotel() {                                                                          //Add Method

        Hotel LakeWood = new Hotel("LakeWood", 110, 80, 90, 80, 3);          //Adding Hotels Using Constructor in ArrayList
        Hotel BridgeWood = new Hotel("BridgeWood", 150, 110, 50, 50, 4);     //HotelName - WeekDayRegularRate - WeekDayRewardRate - WeekendRegularRate - WeekendRewardRate - Raiting
        Hotel RidgeWood = new Hotel("RidgeWood", 220, 100, 150, 40, 5);

        myHotelList.add(LakeWood);
        myHotelList.add(BridgeWood);
        myHotelList.add(RidgeWood);
    }

    public void showHotelInfo() {                                                //Show Method

        for (int i = 0; i < myHotelList.size(); i++) {
            System.out.println(myHotelList.get(i));
        }
    }

    //UC2-UC3  (Weekday)
    public void findCheapestHotelOne(String startDateRange, String endDateRange) {                                                      //Find CheapestHotel based on weekdayRegularRate

        LocalDate startDate = LocalDate.parse(startDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));        //LocalDate class is used to parse the start and end date ranges with DateTimeFormater class to pass date format
        LocalDate endDate = LocalDate.parse(endDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        int numberOfDays = endDate.getDayOfMonth() - startDate.getDayOfMonth() + 1;                                 //To calculate Number of days stayed + the weekdayRegularRate for eg-(5*110)

        Optional<Hotel> cheapestHotel = this.myHotelList.stream().sorted(Comparator.comparing(Hotel::getWeekdayRegularRate)).findFirst();  //Stream function on arrlits ie-myHotelList and storing in cheapestHotel

        Hotel hotel = new Hotel();                                                                                  //Hotel Object
        hotel.setHotelName(cheapestHotel.get().getHotelName());
        hotel.setTotal(cheapestHotel.get().getWeekdayRegularRate() * numberOfDays);                            //numberOfDays = for eg-(5*110)

        System.out.println("-HotelName :" + hotel.getHotelName());                                        //Printing Hotel name and total Hotel rate for the date range
        System.out.println("-NumberOfDaysStayed * WeekdayRegularRate :" + hotel.getTotal() + "$");

    }


    //UC3-UC4  (Weekend)
    public void findCheapestHotelTwo(String startDateRange, String endDateRange) {                                                      //Find CheapestHotel based on weekendRegularRate

        LocalDate startDate = LocalDate.parse(startDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));        //LocalDate class is used to parse the start and end date ranges with DateTimeFormater class to pass date format
        LocalDate endDate = LocalDate.parse(endDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        int numberOfDays = endDate.getDayOfMonth() - startDate.getDayOfMonth() + 1;                                 //To calculate Number of days stayed + the weekendRegularRate for eg-(5*90)

        Optional<Hotel> cheapestHotel = this.myHotelList.stream().sorted(Comparator.comparing(Hotel::getWeekendRegularRate)).findFirst();  //Stream function on arrlits ie-myHotelList and storing in cheapestHotel

        Hotel hotel = new Hotel();                                                                                  //Hotel Object
        hotel.setHotelName(cheapestHotel.get().getHotelName());
        hotel.setTotal(cheapestHotel.get().getWeekendRegularRate() * numberOfDays);                            //numberOfDays = for eg-(5*90)

        System.out.println("-HotelName :" + hotel.getHotelName());                                        //Printing Hotel name and total Hotel rate for the date range
        System.out.println("-NumberOfDaysStayed * WeekendRegularRate :" + hotel.getTotal() + "$");

    }

    //UC6  (Raiting)
    public void findCheapestHotelRaitingForRegular(String startDateRange, String endDateRange) {                                                      //Find CheapestHotel best Rated based on weekendRegularRate

        LocalDate startDate = LocalDate.parse(startDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));        //LocalDate class is used to parse the start and end date ranges with DateTimeFormater class to pass date format
        LocalDate endDate = LocalDate.parse(endDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        int numberOfDays = endDate.getDayOfMonth() - startDate.getDayOfMonth() + 1;                                 //To calculate Number of days stayed + the Raiting for eg-(5*90)

        Optional<Hotel> cheapestHotel = this.myHotelList.stream().sorted(Comparator.comparing(Hotel::getWeekendRegularRate)).findFirst();  //Stream function on arrylist ie-myHotelList and storing in cheapestHotel

        Hotel hotel = new Hotel();                                                                                  //Hotel Object
        hotel.setHotelName(cheapestHotel.get().getHotelName());
        hotel.setTotal(cheapestHotel.get().getWeekendRegularRate() * numberOfDays);                           //numberOfDays = for eg-(5*90)
        hotel.setRaiting(cheapestHotel.get().getRaiting());                                                 //Setting rating for the cheapesthotel

        System.out.println("-HotelName :" + hotel.getHotelName());                                        //Printing Hotel name and total Hotel rate for the date range
        System.out.println("-NumberOfDaysStayed * WeekendRegularRate :" + hotel.getTotal() + "$");
        System.out.println("-Raiting :" + hotel.getRaiting());

    }

    //UC9-UC10  (Reward Rates)
    public void findCheapestHotelRaitingForReward(String startDateRange, String endDateRange) {                       //Find CheapestHotel best Rated based on WeekendRewardRate

        LocalDate startDate = LocalDate.parse(startDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));        //LocalDate class is used to parse the start and end date ranges with DateTimeFormater class to pass date format
        LocalDate endDate = LocalDate.parse(endDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        int numberOfDays = endDate.getDayOfMonth() - startDate.getDayOfMonth() + 1;                                 //To calculate Number of days stayed + the Raiting for eg-(5*90)

        Optional<Hotel> cheapestHotel = this.myHotelList.stream().sorted(Comparator.comparing(Hotel::getWeekendRewardRate)).findFirst();  //Stream function on arrylist ie-myHotelList and storing in cheapestHotel

        Hotel hotel = new Hotel();                                                                                  //Hotel Object
        hotel.setHotelName(cheapestHotel.get().getHotelName());
        hotel.setTotal(cheapestHotel.get().getWeekendRewardRate() * numberOfDays);                           //numberOfDays = for eg-(5*90)
        hotel.setRaiting(cheapestHotel.get().getRaiting());                                                 //Setting rating for the cheapesthotel

        System.out.println("-HotelName :" + hotel.getHotelName());                                        //Printing Hotel name and total Hotel rate for the date range
        System.out.println("-NumberOfDaysStayed * WeekendRewardRate :" + hotel.getTotal() + "$");
        System.out.println("-Raiting :" + hotel.getRaiting());

    }


    //UC9-UC10  (Reward Rates)
    public void findCheapestHotelRaitingForRewardTwo(String startDateRange, String endDateRange) {                       //Find CheapestHotel best Rated based on WeekdayRewardRate

        LocalDate startDate = LocalDate.parse(startDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));        //LocalDate class is used to parse the start and end date ranges with DateTimeFormater class to pass date format
        LocalDate endDate = LocalDate.parse(endDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        int numberOfDays = endDate.getDayOfMonth() - startDate.getDayOfMonth() + 1;                                 //To calculate Number of days stayed + the Raiting for eg-(5*90)

        Optional<Hotel> cheapestHotel = this.myHotelList.stream().sorted(Comparator.comparing(Hotel::getWeekdayRewardRate)).findFirst();  //Stream function on arrylist ie-myHotelList and storing in cheapestHotel

        Hotel hotel = new Hotel();                                                                                  //Hotel Object
        hotel.setHotelName(cheapestHotel.get().getHotelName());
        hotel.setTotal(cheapestHotel.get().getWeekdayRewardRate() * numberOfDays);                           //numberOfDays = for eg-(5*90)
        hotel.setRaiting(cheapestHotel.get().getRaiting());                                                 //Setting rating for the cheapesthotel

        System.out.println("-HotelName :" + hotel.getHotelName());                                        //Printing Hotel name and total Hotel rate for the date range
        System.out.println("-NumberOfDaysStayed * WeekdayRewardRate :" + hotel.getTotal() + "$");
        System.out.println("-Raiting :" + hotel.getRaiting());

    }





}
