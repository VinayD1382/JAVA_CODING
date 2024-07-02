package oopsjava;

abstract class absta {
    public abstract void makesound();

    public void sleep() {
        System.out.println("sleeeeeeeee");
    }
}

// Making the pig class public
 class pig extends absta {
    public void makesound() {
        System.out.println("vgjgggggggggg");
    }
}

// Main class remains unchanged
class abst {
    public static void main(String[] args) {
        pig obj = new pig();
        obj.makesound();
        obj.sleep();
    }
}
