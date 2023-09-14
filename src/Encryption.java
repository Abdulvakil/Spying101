public class Encryption {

    public static void main(String[] args) {

        int key = 5;

        String text = "Mjqqt%r~%sfrj%nx%[fpnq&";
        System.out.println("Encrypted text: ");
        System.out.println(text);
        System.out.println("----------------------------------------");
        System.out.println("Decrypted message: ");

        char[] chars = text.toCharArray();
        for (char c : chars){
            c -= key;
            System.out.print(c);
        }


    }
}
