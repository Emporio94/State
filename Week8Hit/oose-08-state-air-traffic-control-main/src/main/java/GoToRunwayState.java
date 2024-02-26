public class GoToRunwayState extends PlaneState {

    public GoToRunwayState(Plane plane) {
        this.plane = plane;
    }

    @Override
    public void setState() {
        // Implementation for GoToRunwayState
        System.out.println("Transitioning to GoToRunwayState");
        plane.setState(new GroundRollState(plane));
    }
}
