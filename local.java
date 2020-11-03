class local{
   void announcement(){
    System.out.println("exam date has to be announced");
    class department{
      void examdate(){System.out.println("it declared on dec22");}
    }
  department dep=new department();
    dep.examdate();
}
}
class nested{
  public static void main(String []args)
    {
       local mem=new local();
       mem.announcement();
   }
}