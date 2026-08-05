package Temperature;

class Temperature {
    // TODO: Declare private field for celsius (double)
    private double celsius;

    // TODO: Declare private field for valid (boolean)
    private boolean valid;

    // TODO: Implement getCelsius() getter
    public double getCelsius(){
        return this.celsius;
    }


    // TODO: Implement setCelsius() setter
    // - Only accept values at or above absolute zero (-273.15)
    // - If valid, set celsius and set valid to true
    // - If invalid, don't change celsius and set valid to false
    public void setCelsius(double celsius){
        if(celsius >= -273.15){
            this.celsius = celsius;
            this.valid = true;
        } else this.valid = false;
    }

    // TODO: Implement isValid() getter (boolean getters use "is" prefix)
    public boolean isValid(){
        return this.valid;
    }

    // TODO: Implement getFahrenheit() getter
    // - Convert celsius to Fahrenheit using: (celsius * 9/5) + 32

    public double getFahrenheit(){
        return (this.celsius*9/5) + 32;
    }
}
