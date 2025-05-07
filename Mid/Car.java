package OOP1;

public class Car{

	String model;
	int year;
	int mile;

	Car(){

	}

	Car (String model, int year){
		this.model = model;
		this.year = year;
		mile = 0;
	}

	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return model;
	}

	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return year;
	}
}
