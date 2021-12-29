package toyproduct.models;

import toyproduct.Toy;

public class AmericanSubmarineToy implements Toy{

     final private Integer serialNumber;
     final String type = "submarine";
    
    public AmericanSubmarineToy(Integer serialNumber) {
        this.serialNumber=serialNumber;
    }

    
    @Override
    public Integer getSerialNumber(){
        return this.serialNumber;
    }
    
    @Override
    public void pack(){
        
        System.out.printf("Packing '%s' '%d'\n",this.type, this.serialNumber);
        
    }
    
    @Override
    public void label(){
        System.out.printf("Labelling '%s' %d'\n",this.type, this.serialNumber);
    }
   
    
    @Override
    public String toString() {
        return "AmericanSubmarineToy{" + "serialNumber = " + serialNumber + '}';
    }
}
