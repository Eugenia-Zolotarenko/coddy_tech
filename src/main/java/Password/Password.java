package Password;

class Password {
    // TODO: Declare private field for storing the password
    private String password;

    // TODO: Declare private field for minimum length requirement
    private int minLength;


    // TODO: Create constructor that takes minimum length requirement
    public Password(int minLength){
        this.minLength = minLength;
    }

    // TODO: Create setPassword method that validates and sets the password
    // Return true if password meets minimum length, false otherwise
    public boolean setPassword(String password){
        if(password.length()>=this.minLength){
            this.password = password;
            return true;
        } else return false;
    }

    // TODO: Create getMaskedPassword method that returns asterisks instead of actual password
    // Never expose the actual password!
    public String getMaskedPassword(){
        StringBuilder sb = new StringBuilder("");
        if (this.password==null) return sb.toString();
        for (int i = 1; i <= this.password.length() ; i++) {
            sb.append("*");
        }
         return  sb.toString();
    }

    // TODO: Create checkPassword method that compares attempt with stored password
    public boolean checkPassword(String attempt){
        if(this.password ==null) return false;
        return this.password.equals(attempt);

    }

    // TODO: Create getLength method that returns password length (or 0 if not set)
    public int getLength(){
        if (this.password==null) return 0;
        else return this.password.length();
    }

}
