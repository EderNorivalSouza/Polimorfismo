package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	private Date manufactoryDate;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	
	public UsedProduct() {
	}

	public UsedProduct(String name, Double price, Date manufactoryDate) {
		super(name, price);
		this.manufactoryDate = manufactoryDate;
	}

	public Date getManufactoryDate() {
		return manufactoryDate;
	}

	public void setManufactoryDate(Date manufactoryDate) {
		this.manufactoryDate = manufactoryDate;
	}
	
	public String toString() {
		return super.getName()
				+" $ "
				+String.format("%.2f",getPrice())
				+"(Manufactory date: "
				+sdf.format(manufactoryDate)
				+")";
	}	

}
