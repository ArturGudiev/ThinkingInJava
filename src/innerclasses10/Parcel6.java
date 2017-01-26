package innerclasses10;

/**
 * Created by 1 on 08.12.2016.
 */
public class Parcel6 {
    private void internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id = s;
                }
                String getSlip(){return id;}
            }
            TrackingSlip ts = new TrackingSlip("waiting");
            String s = ts.getSlip();

        }
    }
    public void track(){internalTracking(true);}

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
