package Chapter8.drills;

import java.time.LocalDate;
import java.util.Date;

public enum FavouriteDay {
    HBD("Birthday","Lagos",LocalDate.of(1991,4,13)),
    WD("Wedding Date","Lagos",LocalDate.of(2022,8,23)),
    ED("Employment Date","Lagos",LocalDate.of(2022,8,1));
    private final String name;
    private final String placeOfOccurence;
    private final LocalDate date;

    FavouriteDay(String name,String place, LocalDate date){
        this.name = name;
        placeOfOccurence = place;
        this.date = date;
    }
    public String getName() {
        return name;
    }

    public String getPlaceOfOccurence() {
        return placeOfOccurence;
    }

    public LocalDate getDate() {
        return date;
    }

}
