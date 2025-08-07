public class PrintAlphabets {
    public static void main(String[] args) {
        char ch = 'A'; // Starting character

        System.out.println("Alphabets from A to Z:");

        // Loop until character reaches 'Z'
        while (ch <= 'Z') {
            System.out.print(ch + " ");
            ch++;
        }
    }
}
