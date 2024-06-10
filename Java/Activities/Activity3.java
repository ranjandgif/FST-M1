package Activity3;

public class Activity3 {
public static void main(String[] args) {

    double seconds = 1000000000;
    double EarthSeconds = 31557600;
    double MercurySeconds = 0.2408467;
    double VenusSeconds = 0.61519726;
    double MarsSeconds = 1.8808158;
    double JupiterSeconds = 11.862615;
    double SaturnSeconds = 29.447498;
    double UranusSeconds = 84.016846;
    double NeptuneSeconds = 164.79132;

   double earth=seconds/EarthSeconds;
   System.out.println("Age in earth" +" " +earth ) ;

   double Mercury=earth/MercurySeconds;
   System.out.println("Age in Mercury" +" " +Mercury);

   double Venus=earth/VenusSeconds;
   System.out.println("Age in Venus" +" " +Venus);

   double mars=earth/MarsSeconds;
   System.out.println("Age in mars" +" " +earth);

double Jupiter=earth/JupiterSeconds;
   System.out.println("Age in Jupiter" +" " +earth);

   double saturn=earth/SaturnSeconds;
   System.out.println("Age in saturn" +" " +earth);

double uranuns=earth/UranusSeconds ;
   System.out.println("Age in uranuns" +" " +earth);

double neputne=earth/NeptuneSeconds  ;
   System.out.println("Age in neputne" +" " +earth);




    
}


    

}

