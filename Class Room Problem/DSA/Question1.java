//
// Given a log of strings such as "serverA failed" and "serverB success",
// count the number of times the substring "error" occurs three times consecutively.
//

public class Question1 {
    public static void main(String[] args) {

        String log = "serverA error error error success error error success error serverB success error error error";

        String pattern = "error error error";
        int count = 0;
        int index = 0;

        while ((index = log.indexOf(pattern, index)) != -1) {
            count++;
            index += pattern.length();
        }

        System.out.println("Count: " + count);
    }
}