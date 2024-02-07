package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static void main(String[] args) {
        System.out.println("Hello, Hexlet!");
    }
    
    public static int getCountOfFreeEmails(List<String> emails) {
        List<String> freeDomains = List.of("gmail.com", "yandex.ru", "hotmail.com");

        var requiredDomains = emails.stream()
                    .map(email -> email.split("@"))
                    .filter(email -> freeDomains.contains(email[1]))
                    .toList();

        return  requiredDomains.size();
    }
}
// END
