public class AirDistanceState extends PlaneState {

    public AirDistanceState(Plane plane) {
        this.plane = plane;
    }

    @Override
    public void setState() {
        // Implementation for AirDistanceState
        System.out.println("Transitioning to AirDistanceState");
        plane.setState(new ClimbOutState(plane));
    }
}
