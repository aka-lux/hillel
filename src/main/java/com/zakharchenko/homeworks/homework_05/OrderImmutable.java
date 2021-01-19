package com.zakharchenko.homeworks.homework_05;

import java.util.Date;

public class OrderImmutable {
    private int id;
    private Date deliveryDate;
    private String customerId;
    private String address;

    public OrderImmutable(int id, Date deliveryDate, String customerId, String address) {
        this.id = id;
        this.deliveryDate = new Date(deliveryDate.getTime());
        this.customerId = customerId;
        this.address = address;
    }

    public int getId() {
        return id;
    }


    public Date getDeliveryDate() {
        return new Date(this.deliveryDate.getTime());
    }


    public String getCustomerId() {
        return customerId;
    }


    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "OrderImmutable{" +
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

        OrderImmutable that = (OrderImmutable) o;

        if (id != that.id) return false;
        if (deliveryDate != null ? !deliveryDate.equals(that.deliveryDate) : that.deliveryDate != null) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        return address != null ? address.equals(that.address) : that.address == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (deliveryDate != null ? deliveryDate.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
