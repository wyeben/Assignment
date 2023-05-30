public class AirConditioner{

   private boolean isON;
   private String productName;
   private int temperature;
   
   
   
    public void AirConditioner() {
     temperature = 16;
     boolean isOn = false;
    
    }
       
    public void setproductName(){
       this.productName = productName;
       }
       
     public String getproductName() {
     return productName;
     }
     
     public void setOn(boolean isOn){
      isOn = true;
     }
     public boolean getisOn(){
     return isON;
     }
     
     public void setTemperature(int temperature){
       this.temperature = temperature;
 
    }

     public int getTemperature() {
       return temperature;
     }
     
     public void increaseTemperature(int temperature){
         this.temperature = this.temperature + temperature;
     }
     public void decreaseTemperature(int temperature){
         this.temperature = this.temperature - temperature;
       }
}

