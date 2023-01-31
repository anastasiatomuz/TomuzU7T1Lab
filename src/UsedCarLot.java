import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car>inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList getInventory(){
        return inventory;
    }

    public void addCar(Car newCar){
        inventory.add(newCar);
    }

    public boolean swap(int ind1, int ind2){
        if (ind1 >= inventory.size() || ind2 >= inventory.size()){ //within bounds
            return false;
        }
        if (ind1 < 0 || ind2 < 0){ //indices not negative
            return false;
        }
        Car temp = inventory.set(ind1, inventory.get(ind2));
        inventory.set(ind2, temp);
        return true;
    }
}
