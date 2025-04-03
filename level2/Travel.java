import java.util.Scanner;

public class Travel{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter the starting city (from): ");
        String fromCity = scan.nextLine(); 
        System.out.print("Enter the city via which the journey passes: ");
        String viaCity = scan.nextLine();        
        System.out.print("Enter the final destination city (to): ");
        String toCity = scan.nextLine();
        double fromToVia = 156.6;  
        double viaToFinalCity = 211.8;  

        double fromToViaMiles = fromToVia * 1.6;
        double viaToFinalCityMiles = viaToFinalCity * 1.6;
        int timeFromToViaHours = 4;
        int timeFromToViaMinutes = 4;
        int timeViaToFinalCityHours = 4;
        int timeViaToFinalCityMinutes = 25;
        double totalDistanceKm = fromToVia + viaToFinalCity;
        int totalTimeMinutes = (timeFromToViaHours * 60 + timeFromToViaMinutes) + 
                               (timeViaToFinalCityHours * 60 + timeViaToFinalCityMinutes);
        int totalTimeHours = totalTimeMinutes / 60;
        int remainingMinutes = totalTimeMinutes % 60;
      System.out.println("The Total Distance travelled by " + name + " from " + 
                    fromCity + " to " + toCity + " via " + viaCity +
                    " is " + totalDistanceKm + " km (" + (fromToViaMiles + viaToFinalCityMiles) + " miles)" +
                    " and the Total Time taken is " + totalTimeHours + " hours " + remainingMinutes + " minutes.");

     
    }
}
