package ar.edu.unlp.info.bd2.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("Sent")
public class Sent extends OrderStatus {
	
	public boolean deliver(Order o) {
		o.setStatus(new Delivered());
		return true;
	}
	public boolean send(Order o) {
		return false;
	}
	public boolean cancel(Order o) {
		return false;
	}
	@Override
	public String getStatus() {
		return "Sent";
	}
	@Override
	public boolean canDeliver(Order o) {
		return false;
	}
}
