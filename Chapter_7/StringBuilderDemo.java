public class StringBuilderDemo {
   public static void main(String[] args) {


      StringBuilder builderName = new StringBuilder("Barbara");
         System.out.println("(StringBuilder 1) nameString: " + builderName);
      int builderNameCapacity = builderName.capacity();
         System.out.println("Capacity of nameString is: " + builderNameCapacity);

      StringBuilder addressString = new StringBuilder("6311 Hickory Nut Grove Road");
         System.out.println("(StringBuilder 2) addressString: " + addressString);
      int addStringCapacity = addressString.capacity();
         System.out.println("Capacity of addressString is: " + addStringCapacity);

      builderName.setLength(50);
         System.out.println("(Length set to 50 for StringBuilder 1) The name is " + builderName + "end");

      addressString.setLength(50);
         System.out.println("(Length set to 50 for StringBuilder 2) The address is " + addressString);
   }
}