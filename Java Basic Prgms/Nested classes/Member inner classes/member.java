class member{
   void announcement(){
    System.out.println("exam date has to be announced");
    }
    class department{
      void examdate(){System.out.println("it declared on dec22");}
    }
}
class nested{
  public static void main(String []args)
    {
       member mem=new member();
       mem.announcement();
       member.department dep=new member().new department();
       dep.examdate();
   }
}