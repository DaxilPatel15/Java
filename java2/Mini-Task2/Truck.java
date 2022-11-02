import java.security.cert.TrustAnchor;

public class Truck extends Vehicle{
    //instance varibales
    public float trunkspace;
    public int seats;
   

    //adding default constructors
    public Truck(){
    }
    public Truck(int NumberOfDoors){
        this.NumberOfDoors = NumberOfDoors;
    }

    public Truck(char GasPowered){
        this.GasPowered = GasPowered;
    }


    public Truck(String Vehiclecolor){
        super(Vehiclecolor);
    }


    public Truck(int NumberOfDoors,char GasPowered){
        this.NumberOfDoors = NumberOfDoors;
        this.GasPowered = GasPowered;
    }

    public Truck(int NumberOfDoors,char GasPowered,String Vehiclecolor, int seats){
        this.NumberOfDoors = NumberOfDoors;
        this.GasPowered = GasPowered;
        this.Vehiclecolor = Vehiclecolor;
        this.seats = seats;
    }

    public Truck(int NumberOfDoors,char GasPowered,String Vehiclecolor, float trunkspace){
        this.NumberOfDoors = NumberOfDoors;
        this.GasPowered = GasPowered;
        this.Vehiclecolor = Vehiclecolor;
        this.trunkspace = trunkspace;
    }

    public Truck(int NumberOfDoors,char GasPowered,String Vehiclecolor, int seats, float trunkspace){
        this.NumberOfDoors = NumberOfDoors;
        this.GasPowered = GasPowered;
        this.Vehiclecolor = Vehiclecolor;
        this.seats = seats;
        this.trunkspace = trunkspace;
    }



    //set
    public void setSeats(int seats){
        this.seats = seats;
    }
    public void setTrunkspace(float trunkspace) {
        this.trunkspace = trunkspace;
    }


    public int getSeats() {
        return seats;
    }

    public float getTrunkspace() {
        return trunkspace;
    }

    //override
    @Override
    public String toString() {
        return "Truck_File "+ super.toString()+
                "Seats=" + getSeats() +
                "Trunk Space=" + getTrunkspace();   
    }

    @Override
    public void EcoFriendly(){
        if(NumberOfDoors==2 && !Vehiclecolor.equals('D') && seats<=2 && trunkspace==0.0f ){
            System.out.println("Vehicle is 2 doored and not gas powered");
        }
    }

}
