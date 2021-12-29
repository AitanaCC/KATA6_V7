package business;

import toyproduct.Toy;
import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;

public class ToyBusiness {
    
    final private Map<String, ToyFactory> toyFactories = new HashMap<>();
    final private SerialNumberGenerator generator = new SerialNumberGenerator();

    public void add(String name, ToyFactory toyFactory){
        this.toyFactories.put(name, toyFactory);
    }
    
    public Toy produceToy(String type){
        return this.toyFactories.get(type).produceToy(this.generator.next());
    }
   
    
}
