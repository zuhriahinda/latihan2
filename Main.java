import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> hewan = new LinkedList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        
        System.out.println("Hewan : \n" + hewan);

        List<String> delHewan = new ArrayList<>();
        delHewan.add("Kelinci");
        delHewan.add("Kambing");
        delHewan.add("Unta");
        
        System.out.println("Hewan yang dihapus: \n" + delHewan);

        hewan.removeAll(delHewan);

        System.out.println("Output Hewan : \n" + hewan);
    }
}
