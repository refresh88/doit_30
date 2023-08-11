package algo;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    public static void main(String[] args) {

        Person person = new Person("홍길동");
        person.addPhoneNumber(new PhoneNumber("010-1234-2345"));
        System.out.println(person.hasPhoneNumber(new PhoneNumber("01012342345")));
//        person.addPhoneNumber(new PhoneNumber("010 1234 2345"));
//        person.addPhoneNumber(new PhoneNumber("01012342345"));
//        System.out.println(person);
    }

    private static class PhoneNumber {
        public final String phoneNumber;

        public PhoneNumber(String rawPhoneNumber) {
            this.phoneNumber = rawPhoneNumber.replaceAll("[^0-9]", "");
        }

        @Override
        public String toString() {
            return "PhoneNumber{" +
                    "phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PhoneNumber that = (PhoneNumber) o;
            return Objects.equals(phoneNumber, that.phoneNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(phoneNumber);
        }
    }

    private static class Person {
        public final String name;
        private final List<PhoneNumber> numbers;

        public Person(String name) {
            this.name = name;
            numbers = new ArrayList<>();
        }

        public void addPhoneNumber(PhoneNumber number) {
            numbers.add(number);
        }

        public boolean hasPhoneNumber(PhoneNumber number) {
            return numbers.contains(number);
        }

//        public boolean addPhoneNumber(String number) {
//            for(char c : number.toCharArray()) {
//                if(!Character.isDigit(c)) return false;
//            }
//
//            numbers.add(number);
//            return true;
//        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", numbers=" + numbers +
                    '}';
        }
    }
}