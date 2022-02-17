package prob4C;

public final class PayCheck {

    public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;

    public double getGrossPay() {
        return grossPay;
    }

    public double getFica() {
        return fica;
    }

    public double getState() {
        return state;
    }

    public double getLocal() {
        return local;
    }

    public double getMedicare() {
        return medicare;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public void print(){
        System.out.println("\n========\n Gross pay: "+grossPay+"\n FICA: "+fica*grossPay+"\n STATE: "+state*grossPay+"\n LOCAL: "+local*grossPay
        +"\n MEDICARE: "+grossPay*medicare+"\n SOCIAL SECURITY: "+grossPay*socialSecurity+"\n=======\n NET PAY: "+getNetPay() );
    }

    public double getNetPay(){
        return grossPay - ((grossPay * fica) + (grossPay * state) +( grossPay * local) +
        (grossPay * medicare) + (grossPay * socialSecurity));
    }
}
