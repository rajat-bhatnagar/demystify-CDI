package data;

public class PurchaseOrder {
	private Float total;
	private Float subTotal;
	private Float totalAfterDiscount;
	
	public PurchaseOrder() {
		super();
	}
	
	public PurchaseOrder(Float total, Float subTotal, Float totalAfterDiscount) {
		super();
		this.total = total;
		this.subTotal = subTotal;
		this.totalAfterDiscount = totalAfterDiscount;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	public Float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Float subTotal) {
		this.subTotal = subTotal;
	}

	public Float getTotalAfterDiscount() {
		return totalAfterDiscount;
	}

	public void setTotalAfterDiscount(Float totalAfterDiscount) {
		this.totalAfterDiscount = totalAfterDiscount;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [total=" + total + ", subTotal=" + subTotal
				+ ", totalAfterDiscount=" + totalAfterDiscount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((subTotal == null) ? 0 : subTotal.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
		result = prime
				* result
				+ ((totalAfterDiscount == null) ? 0 : totalAfterDiscount
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PurchaseOrder other = (PurchaseOrder) obj;
		if (subTotal == null) {
			if (other.subTotal != null)
				return false;
		} else if (!subTotal.equals(other.subTotal))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		if (totalAfterDiscount == null) {
			if (other.totalAfterDiscount != null)
				return false;
		} else if (!totalAfterDiscount.equals(other.totalAfterDiscount))
			return false;
		return true;
	}
	
}
