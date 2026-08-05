

public class MainPrintArraysValue {
    public static void main(String[] args) {
        String[] str = {"one", "two", "tree"};
        String res = "";
        for (int i = 0; i < str.length; i++) {
            res = res + str[i];
            if (i!= str.length-1) res = res + "\n";
        }
        System.out.println(res);
    }

    Formatter formatter = new Formatter(){
        @Override
        public String format() {
            return "null";
        }

    };
}
