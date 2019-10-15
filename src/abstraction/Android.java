package abstraction;

public class Android extends Mobile {
    @Override
    public void phoneCall() {
        System.out.println("Yes, an Android phone can make calls.");
    }

    @Override
    public void camera() {
        System.out.println("Yes, Android phones have a camera.");
    }
}
