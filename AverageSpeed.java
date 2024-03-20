class AverageSpeed
{
  public static void main(String[]args)
 {
   double kilometer = 14;
   double minutes = 45;
   double seconds = 30;
   double hours = (minutes + seconds/60)/60;

   double miles = kilometer*1.6;
   double averageSpeedMph = miles/hours;
   System.out.println("Average speed: " + averageSpeedMph + " miles per hour");
    }
}
   
   