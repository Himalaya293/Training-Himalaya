interface BonusCalculator {
   public double calcBonus(int amount);
}
class EmpDetails {
   public void getBonus(BonusCalculator calculator, int amount) {
      double bonus = calculator.calcBonus(amount);
      System.out.println("Bonus: " + bonus);
   }
}
class Lamda{
   public static void main(String[] args) {
      //Using Anonymous inner class
      EmpDetails details = new EmpDetails();
      details.getBonus(new BonusCalculator () {
         public double calcBonus(int amount) {
            System.out.println("Bonus Calculation of an Employee using Ananymous inner class");
            return amount*2;
         }
      },2000);
      // using Lambda Expression
      details.getBonus((amount) -> {
         System.out.println("Bonus Calculation of an Employee using Lambda Expression");
         return amount*2;
      },2000);
   }
}

