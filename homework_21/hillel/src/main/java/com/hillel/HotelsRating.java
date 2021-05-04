package com.hillel;


import java.io.*;
import java.util.*;


public class HotelsRating {
    public static void main(String[] args) {
        ArrayList<Keyword> keywords = new ArrayList<>();
        ArrayList<Review> reviews = new ArrayList<>();
        Map<Integer, Integer> rating = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("resources/keywords.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                keywords.add(new Keyword(Integer.parseInt(line.split(",")[0]), line.split(",")[1].toLowerCase(Locale.ROOT)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("resources/reviews.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String str = line.
                        split(",")[1].
                        toLowerCase(Locale.ROOT).
                        replaceAll("[^A-Za-z0-9 ]", "");
                rating.put(Integer.parseInt(line.split(",")[0]),0);
                reviews.add(new Review(Integer.parseInt(line.split(",")[0]), str));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Review r : reviews) {
            List<String> list = Arrays.asList(r.getReview().split(" "));
            Set<String> uniqueWords = new HashSet<String>(list);
           // System.out.println();
            // System.out.println(uniqueWords);
            //System.out.println(keywords);
            for (Keyword k : keywords) {
                if (uniqueWords.contains(k.getKeyword())) {
                   // System.out.println("hotel " + r.getHotelId() + " rat " + Collections.frequency(list, k.getKeyword()) * k.getKeywordRating());
                    rating.put(r.getHotelId(),rating.get(r.getHotelId())+Collections.frequency(list, k.getKeyword()) * k.getKeywordRating());
                }
            }

        }

        rating.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
    }

}
