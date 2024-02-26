public class CruiseState extends PlaneState {

    public CruiseState(Plane plane) {
        this.plane = plane;
    }

    @Override
    public void setState() {
        // Implementation for CruiseState
        System.out.println("Transitioning to CruiseState");
        plane.setState(new LandState(plane));
    }
}
