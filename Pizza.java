class Pizza {
    private String name;
    private int diameter;
    private double price;
    private int slices;
    
    public Pizza (String name, int diameter, double price, int slices)
    {
        this.name = name;
        this.diameter = diameter;
        this.price = price;
        this.slices = slices;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double areaPerSlice()
    {
        return Math.pow((diameter/2),2) * Math.PI / slices;
    }
    
    public double costPerSlice()
    {
        return price / slices;
    }
    
    public double costPerSquareInch()
    {
        return price / (Math.pow((diameter/2),2) * Math.PI);
    }
}