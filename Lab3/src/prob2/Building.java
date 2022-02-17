package prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private int maintenanceCost;
    private List<Apartment> apartmentList ;

    Building(int maintenanceCost){
        this.maintenanceCost = maintenanceCost;
        this.apartmentList = new ArrayList<>();
    }

    public void addApartment(Apartment apartment){
        apartmentList.add(apartment);
    }

    public int getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(int maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public List<Apartment> getApartmentList() {
        return apartmentList;
    }

    public void setApartmentList(List<Apartment> apartmentList) {
        this.apartmentList = apartmentList;
    }
}
