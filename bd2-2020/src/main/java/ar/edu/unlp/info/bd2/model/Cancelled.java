package ar.edu.unlp.info.bd2.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("Cancelled")
public class Cancelled extends OrderStatus {
	public boolean deliver(Order o) {
		return false;
	}
	public boolean send(Order o) {
		return false;
	}
	public boolean cancel(Order o) {
		return false;
	}
	@Override
	public String getStatus() {
		return "Cancelled";
	}
	@Override
	public boolean canDeliver(Order o) {
		return false;
	}
}
