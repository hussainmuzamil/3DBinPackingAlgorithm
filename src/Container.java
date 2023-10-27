public class Container {

    private double height;
    private double width;
    private double depth;

    private double totalVolumeInCubicFt = 0.0;

    public Container(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    private double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private double getDepth() {
        return depth;
    }

    private void setDepth(double depth) {
        this.depth = depth;
    }

    public double getTotalVolumeInCubicFt() {
        return totalVolumeInCubicFt;
    }
    public void packItems(double volumeInCubicFt){
        if(canFit(volumeInCubicFt)){
            totalVolumeInCubicFt -= volumeInCubicFt;
        }
    }
    public boolean isEmpty(){
        return totalVolumeInCubicFt == 0;
    }

    public void setTotalVolumeInCubicFt(double totalVolumeInCubicFt) {
        this.totalVolumeInCubicFt = totalVolumeInCubicFt;
    }
    public boolean canFit(double volumeInCubicFt){
        return totalVolumeInCubicFt <= volumeInCubicFt;
    }
    public double getVolume(){
        return (totalVolumeInCubicFt = this.getHeight() * this.getVolume() * this.getDepth());
    }
}
