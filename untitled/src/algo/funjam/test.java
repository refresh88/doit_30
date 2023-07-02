package algo.funjam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) throws IOException {
        Person person = new Person("홍길동");
        System.out.println(new PhoneNumber("010-1234-5678"));
        System.out.println(new PhoneNumber("010 1234 5678"));
        System.out.println(new PhoneNumber("01012345678"));
        System.out.println("person = " + person);
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
    }

    private static class Person { // 두 값 모두 생성자로 초기화 되고 나면 바뀌지 않는 값임. 이런경우 각 값들에게 final 부여해서 변경되는것을 방지.
        public final String name;   // String은 불변이니까 public으로 열어서 읽기만 가능하게 해주고
        private final List<PhoneNumber> numbers;    // List의 경우 외부에서 접근해서 임의로 값을 바꿀수 있기 때문에 private로 선언.

        public Person(String name) {
            this.name = name;
            this.numbers = new ArrayList<>();
        }

        public void addPhoneNumber(PhoneNumber number) {
            numbers.add(number);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", numbers=" + numbers +
                    '}';
        }
    }


}
