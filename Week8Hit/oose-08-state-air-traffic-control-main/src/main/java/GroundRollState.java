public class GroundRollState extends PlaneState {

    public GroundRollState(Plane plane) {
        this.plane = plane;
    }

    @Override
    public void setState() {
        // Implementation for GroundRollState
        System.out.println("Transitioning to GroundRollState");
        plane.setState(new AirDistanceState(plane));
    }
}
