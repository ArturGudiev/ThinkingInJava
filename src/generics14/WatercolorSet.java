package generics14;

/**
 * Created by 1 on 13.01.2017.
 */
import generics14.Watercolors.*;
import java.util.*;

import static generics14.Watercolors.*;
import static generics14.Sets.*;

public class WatercolorSet {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(BRILLIANT_RED, Watercolors.VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
        System.out.println("set1 " + set1);
        System.out.println("set2 " + set2);
        System.out.println("union(set1, set2) " + union(set1, set2));
        Set<Watercolors> subset = intersection(set1, set2);
        System.out.println("intersection(set1, set2) " + subset);
        System.out.println("difference(set1, set2) " + difference(set1, set2));
        System.out.println("complement(set1, set2) " + complement(set1, set2));
    }
}
