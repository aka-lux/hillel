package com.hillel;

public class Hotel {
    int rating;
    int hotelId;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getHotelId() {
        return hotelId;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rating=" + rating +
                ", hotelId=" + hotelId +
                '}';
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public Hotel(int rating, int hotelId) {
        this.rating = rating;
        this.hotelId = hotelId;
    }
}
