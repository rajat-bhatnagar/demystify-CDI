package bl.service;

import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.event.Event;
import javax.inject.Inject;

import bl.helper.NumberHelper;
import bl.qualifiers.Vat;
import data.Item;
import data.PurchaseOrder;

public class PurchaseOrderService implements Computable {

	/*
	 * Injecting the value of vat which needs to be applied
	 * on the purchased cartItem
	 */
	@Inject
	@Vat
	private Float vatRate;
	
	@Inject
	private NumberHelper numberHelper;
	
	@Inject
	private Logger logger;
	
	/*
	 * Injecting an Event : PurchaseOrderService is the EventProducer and will fire an event
	 */
	@Inject
	private Event<PurchaseOrder> purchaseOrderEvent;
	
	@Override
	public PurchaseOrder compute(List<Item> items) {
		PurchaseOrder purchaseOrder = new PurchaseOrder();
		Float subTotal = 0f;
		for(Item cartItem : items){
			subTotal += cartItem.getSubTotal();
		}
		Float total = subTotal + subTotal * (vatRate/100);
		purchaseOrder.setSubTotal(numberHelper.round(subTotal));
		purchaseOrder.setTotal(numberHelper.round(total));
		purchaseOrder.setTotalAfterDiscount((numberHelper.round(total)));
		logger.info("Purchase Order # "+purchaseOrder);
		/*
		 * Firing an Event here
		 */
		purchaseOrderEvent.fire(purchaseOrder);
		logger.info(" # ProucerOrderService Fired an Event #");
		return purchaseOrder;
	}

	@Override
	public PurchaseOrder createPuchaseOrder(List<Item> items) {
		return compute(items);
	}

}
