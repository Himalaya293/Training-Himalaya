package twowh;
import automobile.*;

public abstract class honda extends vehicle
{
    public int getSpeed()
      {
          return 50;
       }
   public void cdplayer()
       {
          System.out.print("provides facility to control the cd player device which is available in the car");
        }
public void radio()
       {
          System.out.print("provides facility to control the radio device");
        }
 public String getmodelname()
       {
          return "HERO152Z";
        }
 public String  getregistrationnumber()
       {
          return  "78912365";
        }
 public String  getownernumber()
       {
          return  "HIMA";
        }
}