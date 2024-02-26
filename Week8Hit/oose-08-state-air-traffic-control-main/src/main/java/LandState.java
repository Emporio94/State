public class LandState extends PlaneState {

    public LandState(Plane plane) {
        this.plane = plane;
    }

    @Override
    public void setState() {
        // Implementation for LandState
        System.out.println("Transitioning to LandState");
        System.out.println("Finished");
    }
}
