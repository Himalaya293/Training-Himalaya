class animals{
   static class birds{
   void dog(){System.out.println("it barks");}
   static void peacock(){System.out.println("national bird");}
    }
}
class nested{
  public static void main(String []args)
    {
       animals.birds ani=new animals.birds();
       ani.dog();
       animals.birds.peacock();
   }
}