import java.util.Arrays;

public class ApplicationSorter {
    public static void sortApplicationNamesByLength(String[] names) {
        Arrays.sort(names, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    public static void main(String[] args) {

        String[] softwareIdeas = {"GGG", "TNL", "JBNEB", "FXWTO", "VPXCTFKKDP", "VTU", "ICNHYGS", "LCWR", "SQBKIXMN", "LBINCPNCI"};

        System.out.println("Original array: " + Arrays.toString(softwareIdeas));


        sortApplicationNamesByLength(softwareIdeas);

        System.out.println("Sorted array by length: " + Arrays.toString(softwareIdeas));
    }
}

