package com.zakharchenko.homeworks.homework_03;

public class DescribeAge {
    public static void main(String[] args) {
        System.out.println(describeAge(5));
        System.out.println(describeAge(12));
        System.out.println(describeAge(15));
        System.out.println(describeAge(18));
        System.out.println(describeAge(64));
        System.out.println(describeAge(70));
    }

    /**
     * Function provide next rules
     * If the age is 12 or lower, it return "You're a(n) kid"
     * If the age is anything between 13 and 17 (inclusive), it return "You're a(n)
     * teenager"
     * If the age is anything between 18 and 64 (inclusive), it return "You're a(n)
     * adult"
     * If the age is 65 or above, it return "You're a(n) elderly"
     *
     * @param age human age
     * @return human age description
     */
    private static String describeAge(int age) {
        return (age <= 12) ? "You're a(n) kid" :
                (age <= 17) ? "You're a(n) teenager" :
                        (age <= 64) ? "You're a(n) adult" :
                                (age > 65) ? "You're a(n) elderly" : "failed to calculate";
    }

}
