import javax.swing.text.StyledEditorKit.BoldAction;

//NAME:DAXIL PATEL
//STUDENT ID: 200520270

public class Vehicle {
    public int NumberOfDoors = 4;
    public String Vehiclecolor = "RED";
    public char GasPowered = 'D';
    


    public Vehicle(){
    }

    public Vehicle(int NumberOfDoors){
        setNumberOfDoors(NumberOfDoors);
    }

    public Vehicle(char GasPowered){
        setGasPowered(GasPowered);
    }

    public Vehicle(String Vehiclecolor){
        setVehicleColor(Vehiclecolor);
    }
    
    public Vehicle(int NumberOfDoors,char GasPowered){
        setNumberOfDoors(NumberOfDoors);
        setGasPowered(GasPowered);
    }


    // using getter method to get the value
    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public char getGasPowered() {
        return GasPowered;
    }

    public String getVehicleColor() {
        return Vehiclecolor;
    }



    // using setter method to set the value 
    public void setNumberOfDoors(int NumberOfDoors){
        this.NumberOfDoors = NumberOfDoors;
    }
    public void setVehicleColor(String Vehiclecolor) {
        this.Vehiclecolor = Vehiclecolor;
    }

    public void setGasPowered(char GasPowered){
        this.GasPowered = GasPowered;
    }



    //override 
    @Override
    public String toString() {
        return "Vehicle_File: " +
                " Number of Doors = " + getNumberOfDoors() +
                " Color = " + getVehicleColor() +
                " Gas Powered = " + getGasPowered() ;
        }
    
        
    
    public void EcoFriendly(){
        if(NumberOfDoors==5 && !Vehiclecolor.equals('D')){
            System.out.println("Vehicle is 2 doored and not gas powered");
        }
    }
}
