package com.hillel;

public class Review {
    int hotelId;
    String review;

    public int getHotelId() {
        return hotelId;
    }

    public Review(int hotelId, String review) {
        this.hotelId = hotelId;
        this.review = review;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Review{" +
                "hotelId=" + hotelId +
                ", review='" + review + '\'' +
                '}';
    }
}
