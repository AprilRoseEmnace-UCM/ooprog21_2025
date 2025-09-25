class DemoGrossPay
{

   public static void main(String[] args)
   {
      double hours = 25;
      double hoursWorked = 37.5;
      calculateGross (10);
      calculateGross (hours);
      calculateGross (hoursWorked);
   }
   public static void calculateGross (double hours)
   {
      final double RATE = 22.75;
      double gross;
      gross = hours * RATE;
      System.out.println(hours + " hours at $" +
         RATE + " per hour is $" + gross);
   }
}