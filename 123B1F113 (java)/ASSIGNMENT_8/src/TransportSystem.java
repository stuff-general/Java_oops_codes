interface Transport{
    abstract double calculateFare(double distance);
}
 class Car implements Transport{
    @Override
     public double calculateFare(double distance){
        double ratePerKm=10.0;
        return distance*ratePerKm;
    }
 }

 class Bus implements Transport {
    @Override
     public double calculateFare(double distance){
        double ratePerKm=2.0;
        return distance*ratePerKm;
    }
 }

 class Train implements Transport{
    @Override
    public double calculateFare(double distance){
      double ratePerKm=1.5;
      return distance*ratePerKm;
    }
 }

 public class TransportSystem{
    public static void displayFare(Transport t,double distance){
            double fare=t.calculateFare(distance);
        System.out.println("Fare for over " + distance + " km is: "+ fare + " units");
    }
    public static void main(String[]args){
        double distance=50;

        Transport car = new Car();
        Transport bus = new Bus();
        Transport train = new Train();

        displayFare(car,distance);
        displayFare(bus,distance);
        displayFare(train,distance);
    }
 }