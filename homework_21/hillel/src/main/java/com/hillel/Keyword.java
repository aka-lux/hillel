package com.hillel;

public class Keyword {
    int keywordRating;
    String keyword;

    public Keyword(int keywordRating, String keyword) {
        this.keywordRating = keywordRating;
        this.keyword = keyword;
    }

    public int getKeywordRating() {
        return keywordRating;
    }

    public void setKeywordRating(int keywordRating) {
        this.keywordRating = keywordRating;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "keywordId=" + keywordRating +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
