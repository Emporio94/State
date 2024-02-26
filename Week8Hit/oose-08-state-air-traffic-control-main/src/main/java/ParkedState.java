public class ParkedState extends PlaneState {

    public ParkedState(Plane plane){
        this.plane = plane;
        this.planeStage = PlaneStage.PARKED;
    }

    @Override
    public void setState() {
        //Add code here
    }
    
}
