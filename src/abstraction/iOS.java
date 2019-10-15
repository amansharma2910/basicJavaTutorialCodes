package abstraction;

public class iOS extends Mobile {
    @Override
    public void phoneCall() {
        System.out.println("Yes, an iOS phone can make calls.");
    }

    @Override
    public void camera() {
        System.out.println("Yes, iOS phones have a camera.");
    }
}
