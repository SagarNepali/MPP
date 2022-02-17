package prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {

    private int profit;
    private List<Building> buildingList = new ArrayList<>();

    LandlordInfo() {

    }

    public void addBuilding(Building b) {
        buildingList.add(b);
    }

    public int calcProfits() {
        int rent =0, mc = 0;

        for(Building b : buildingList){
            mc += b.getMaintenanceCost();
            for(Apartment a : b.getApartmentList()){
                rent += a.getRent();

            }
        }
        return rent-mc;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public List<Building> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(List<Building> buildingList) {
        this.buildingList = buildingList;
    }
}
