package hima1;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Comparator;

public class QueueReconstruct{
	public int[][] reconstructQueue(int[][] people) {
	    int[][] result = new int[people.length][];
	    Arrays.sort(people, new Comparator<int[]>(){
	        public int compare(int[] a1, int[] a2){
	            if(a1[0]!=a2[0]){
	                return a2[0]-a1[0];
	            }else{
	                return a1[1]-a2[1];
	            }
	        }
	    });
	 
	    ArrayList<int[]> list = new ArrayList<int[]>();
	 
	    for(int i=0; i<people.length; i++){
	        int[] arr = people[i];
	        list.add(arr[1],arr);
	    }
	 
	    for(int i=0; i<people.length; i++){
	        result[i]=list.get(i);
	    }
	 
	    return result;
	}
	public static void main(String[] args) {

	    //int[][] people=[[7,0], [4,4]];
	    QueueReconstruct qr=new QueueReconstruct();
	    int[][] people=null;
		int[][] array=qr.reconstructQueue(people);
	       System.out.print("{");
	        for(int i=0;i<array.length;i++)
	           {
	        	     System.out.print("{");
	                 for(int j=0;j<array[i].length;j++)
	                   {
	                      System.out.println(array[i][j]);
	                      if(j!=1)
	                      System.out.println(",");
	                   }
	                 System.out.print("}");
	          }
	        System.out.print("}");
	}

}
