package day4;

public class Van extends Vehicle {

	int no_of_doors;
	int load_capacity;
	int no_of_boxes;
 
	 
	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("van is started");
	}
	public Van(int no_of_doors, int load_capacity,
			int no_of_boxes) {
		super(4, "Blue", "Diesel",90);
		this.no_of_doors = no_of_doors;
		this.load_capacity = load_capacity;
		this.no_of_boxes = no_of_boxes;
		System.out.println(toString());
		System.out.println(super.toString());
		loadVan();
		System.out.println();
		 start();
		 accelerate();
		super.brake();
		System.out.println();
	}
	
	

	@Override
	public String toString() {
		return " no_of_doors=" + no_of_doors + ", load_capacity=" + load_capacity + ", no_of_boxes=" + no_of_boxes
				+ "";
	}
	void loadVan()
	{
		System.out.println("total_load is :"+(no_of_boxes*100));
	}
	@Override
	void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("van accelarated");
	}
	 

}
