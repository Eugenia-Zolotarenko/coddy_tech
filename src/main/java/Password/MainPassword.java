package Password;

public class MainPassword {
    public static void main(String[] args) {
        Password psw = new Password(6);
//        System.out.println(psw.getLength());
//        System.out.println( psw.setPassword("123456"));
//        System.out.println(psw.getMaskedPassword());
//        System.out.println(psw.checkPassword("123456"));
//        System.out.println(psw.getLength());
        // TODO: Set the password and print the result ("Set: true" or "Set: false")

        System.out.println("Set: " + psw.setPassword("password"));

        // TODO: Print the masked password ("Masked: ******")
        System.out.println("Masked: "+ psw.getMaskedPassword());

        // TODO: Check the password attempt and print the result ("Match: true" or "Match: false")
        System.out.println("Match: " + psw.checkPassword("password"));
        System.out.println("*****************************************************");

        Password psw2 =new Password(6);
        System.out.println("Set: " + psw2.setPassword("secret"));
        System.out.println("Masked: "+ psw2.getMaskedPassword());
        System.out.println("Match: " + psw2.checkPassword("secret"));

        System.out.println("*****************************************************");

        Password psw3 =new Password(6);
        System.out.println("Set: " + psw3.setPassword("123456"));
        System.out.println("Masked: "+ psw3.getMaskedPassword());
        System.out.println("Match: " + psw3.checkPassword("123456"));

        System.out.println("*****************************************************");

        Password psw4 =new Password(6);
        System.out.println("Set: " + psw4.setPassword("abcdef"));
        System.out.println("Masked: "+ psw4.getMaskedPassword());
        System.out.println("Match: " + psw4.checkPassword("wrong"));
        System.out.println("*****************************************************");

        Password psw6 =new Password(6);
        System.out.println("Set: " + psw6.setPassword("short"));
        System.out.println("Masked: "+ psw6.getMaskedPassword());
        System.out.println("Match: " + psw6.checkPassword("short"));

        System.out.println("*****************************************************");

        Password psw5 =new Password(6);
        System.out.println("Set: " + psw5.setPassword("abc"));
        System.out.println("Masked: "+ psw5.getMaskedPassword());
        System.out.println("Match: " + psw5.checkPassword("abc"));

        System.out.println("*****************************************************");

        Password psw7 =new Password(6);
        System.out.println("Set: " + psw7.setPassword("MySecurePass123"));
        System.out.println("Masked: "+ psw7.getMaskedPassword());
        System.out.println("Match: " + psw7.checkPassword("MySecurePass123"));
        System.out.println("*****************************************************");

        Password psw8 =new Password(6);
        System.out.println("Set: " + psw8.setPassword("MySecurePass123"));
        System.out.println("Masked: "+ psw8.getMaskedPassword());
        System.out.println("Match: " + psw8.checkPassword("WrongPassword"));
        System.out.println("*****************************************************");

        Password psw9 =new Password(6);
        System.out.println("Set: " + psw9.setPassword(""));
        System.out.println("Masked: "+ psw9.getMaskedPassword());
        System.out.println("Match: " + psw9.checkPassword(""));
        System.out.println("*****************************************************");

        Password psw10 =new Password(6);
        System.out.println("Set: " + psw10.setPassword("P@ssw0rd!"));
        System.out.println("Masked: "+ psw10.getMaskedPassword());
        System.out.println("Match: " + psw10.checkPassword("P@ssw0rd"));



    }
}
