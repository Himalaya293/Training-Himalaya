class member{
   void ram(){
    System.out.println("it has 42Gb");
    }
    class mobile{
      void rom(){System.out.println("it has 10Gb");}
    }
}
class nested{
  public static void main(String []args)
    {
        member mem=new member();
        mem.ram();
        member.mobile mob=new member().new mobile();
        mob.rom(); 
   }
}