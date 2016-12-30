package bl.service;

import java.util.logging.Logger;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import data.PurchaseOrder;

public class InventoryService {
	
	@Inject
	private Logger logger;
	
	/*
	 * By @observers Observer method is notified
	 */
	public void addItems(@Observes PurchaseOrder purchaseOrder){
		logger.info(" # Inventory Service will ship the inventory of value : "+purchaseOrder.getTotalAfterDiscount());
	}
}
