public class ClimbOutState extends PlaneState {

    public ClimbOutState(Plane plane) {
        this.plane = plane;
    }

    @Override
    public void setState() {
        // Implementation for ClimbOutState
        System.out.println("Transitioning to ClimbOutState");
        // Transition to next state if applicable
    }
}
