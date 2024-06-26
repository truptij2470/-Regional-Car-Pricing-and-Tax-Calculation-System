package assignment1;


 enum Region {
	R1(0.10),
	R2(0.15),
	R3(0.20),
	R4(0.25);
	
	private final double taxRate;

    Region(double taxRate) {
        this.taxRate = taxRate;
    }
    
	public double getTaxRate()
	{
		return taxRate;
	}

}
