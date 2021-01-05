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

}
