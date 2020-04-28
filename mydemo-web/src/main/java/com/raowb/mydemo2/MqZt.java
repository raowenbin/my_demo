package com.raowb.mydemo2;

import java.util.ArrayList;
import java.util.List;

public class MqZt {
     private List<MqGcz> list = new ArrayList<MqGcz>();
     
     
     public void zc(MqGcz mqGcz){
    	 list.add(mqGcz);
     }
     
     public void start(){
    	 for(MqGcz mqGcz : list){
    		  mqGcz.start("Æô¶¯");
    	 }
     }
     
     public void stop(){
      	for(MqGcz mqGcz : list){
   		   mqGcz.stop("Í£Ö¹");
   	     }
      	
     }
     
     public void removeMqGcz(MqGcz mqGcz){
    	 list.remove(mqGcz);
    	 System.out.println("removeMqGcz>>>"+mqGcz.getClass().getName());
     }
     
     
}
