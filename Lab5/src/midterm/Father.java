package midterm;

import java.util.Date;

public class Father {

    Date d ;

    public Father(){
        tellTime();
    }

    void tellTime(){
        d = new Date();
        System.out.println(d.getTime());
    }
}

class Son extends  Father {

    Date d ;

    public Son(){
        d = new Date();
    }

    public Son(Date d){
        this.d = d;
    }

    @Override
    public void tellTime(){
        System.out.println(d.getTime());
    }


    public static void main(String[] args) {
        Father s = new Son();
        // here before son constructor is called, controlled is passed to parent constructor.
        // As parent constructor calls the tellTime() method which is also being overridden by the child, the date object
        // inside the child method is not initialized as the son constructor is not called yet and the exception will
        // occur as NullPointer as date object inside child is null.
        s.tellTime();
    }
}
