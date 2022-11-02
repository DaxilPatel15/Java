public class HouseRunner {
    public static void main(String[] args) {
        House House1 = new House(758,"TOM",15.5);
        System.out.printf("Integer: %d" + " String: %s"+ " Double: %f",House1.getInteger(),House1.getString(),House1.getDouble());

        System.out.println();

        House House2 = new House(19.9,1500,"JERRY");
        System.out.printf("Double: %f"+" Integer: %d"+" String: %s",House2.getDouble(),House2.getInteger(),House2.getString());


        System.out.println();

        House House3 = new House(505,32.5,"BOB");
        System.out.printf("Integer: %d"+" Double: %f"+" String: %s",House3.getInteger(),House3.getDouble(),House3.getString());
    }



}
