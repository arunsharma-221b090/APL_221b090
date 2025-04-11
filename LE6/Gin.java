class Gin extends Decorator {
    Gin(Offering offer) {
        this.offering=offering;
    }
    
    int getPrice() {
        return offering.getPrice()+125;
    }
    String getName() {
        return offering.getName()+"with Gin";
    }
}