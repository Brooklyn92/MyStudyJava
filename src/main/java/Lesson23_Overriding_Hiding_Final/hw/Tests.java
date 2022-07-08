package Lesson23_Overriding_Hiding_Final.hw;

public class Tests {
    public static void main(String[] args) {
        //================Test1==============
//            Y y = new Y();
//            y.abc(); //  -> Y
        //================Test2=================
//        Y y = new Y();
//        y.abc();  //  -> Y
//        y.def();  //  -> Y
//        y.ghi();  //  -> Y

        //=================Test3===================
//        Y y = new Y(18);
//        System.out.println(y.abc()); // -> X, Y, true

        //================Test4===================
//        Y a = new Y();
//        abc(a,a); // -> error compilations

    }
    //================Test4===================
    public static void abc(X x, Y y){
        System.out.println("privet");
    }
    public static void abc(Y y, X x){
        System.out.println("Poka");
    }
}



//==========Test1=======================
/*
class X {
    X() {}
    public void abc() {
        System.out.println("X");
    }
}

class Y {
    Y() {}
    public void abc() {
        System.out.println("Y");
    }
}
 */
//==========================================
//=================Test2================================
/* class X {
    protected void abc() {
        System.out.println("X");
    }
}
class Y extends X {
    public void abc() {
        System.out.println("Y");
    }
    public void def() {
        Y y = new Y();
        y.abc();
    }
    public void ghi() {
        X x = new Y();
        x.abc();
    }
}*/
//===============================================
//==============Test3============================
/*class X {
    public X() {
        System.out.println("X");
    }
    public X(int i){
        System.out.println("X" + i);
    }
    private boolean abc() {
        return false;
    }
}
class Y extends X {
    public Y(int i){
        System.out.println("Y");
    }
    public boolean abc() {
        return true;
    }
}*/
//==========================================
//==============Test4=======================
class X {
}
class Y {
}