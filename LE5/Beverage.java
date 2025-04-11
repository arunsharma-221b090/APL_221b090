abstract class Beverage
{
    private void pour(int quantity){
    System.out.println("Add"+quantity+"ml of beverage");
    }
    protected abstract void addCondiment();
    
    protected void stir() {}
    
    private void serve()
    {
    System.out.println("serve to waiter");
    }
    public void templateMethod(int quantity)
    {
        pour(quantity);
        addCondiment();
        stir();
        serve();
    }
}
