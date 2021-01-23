package com.zakharchenko.homeworks.homework_05;

import java.util.Date;

public class OrderMutable {
    private long id;
    private Date deliveryDate;
    private long customerId;
    private String address;

    public OrderMutable(long id, Date deliveryDate, long customerId, String address) {
        this.id = id;
        this.deliveryDate = deliveryDate;
        this.customerId = customerId;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrderMutable{" +
                "id=" + id +
                ", deliveryDate=" + deliveryDate +
                ", customerId='" + customerId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderMutable that = (OrderMutable) o;

        if (id != that.id) return false;
        if (customerId != that.customerId) return false;
        if (deliveryDate != null ? !deliveryDate.equals(that.deliveryDate) : that.deliveryDate != null) return false;
        return address != null ? address.equals(that.address) : that.address == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (deliveryDate != null ? deliveryDate.hashCode() : 0);
        result = 31 * result + (int) (customerId ^ (customerId >>> 32));
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
