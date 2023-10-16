public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Textgenerator textgenerator = new Textgenerator();
        String i = textgenerator.generateRandomString(10);
        System.out.println(i);

    }
}
