package factories;

import toyproduct.Toy;

public abstract class ToyFactory {
    final protected SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Toy produceToy(Integer serialNumber){
        Toy  toy= this.createToy(serialNumber);
        toy.pack();
        toy.label();
        return toy;

    }

    protected abstract Toy createToy(Integer serialNumber);
}
