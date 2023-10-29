import java.util.ArrayList;
import java.util.List;

public class BFD {


    public static List<Container> packItems(List<Package> packages,List<Container> emptyContainers){
        List<Container> containers = new ArrayList<>();
        for (Package p:
             packages) {
            boolean itemPacked = false;
            double bestContainerSpace = Integer.MAX_VALUE;
            Container bestContainer = null;

            for(Container c : emptyContainers){
                if(c.canFit(p.getVolumeInCubicFt())){
                    Double remainingSpace = c.getTotalVolumeInCubicFt() - p.getVolumeInCubicFt();
                    if(remainingSpace < bestContainerSpace){
                        bestContainerSpace = remainingSpace;
                        bestContainer = c;
                    }
                }
            }
            if(bestContainer!=null){
                bestContainer.packItems(p.getVolumeInCubicFt());
                itemPacked = true;
                containers.add(bestContainer);
            }
            if(!itemPacked){
                System.out.println("not enough space to pack package");

            }
        }

        return containers;
    }
}
