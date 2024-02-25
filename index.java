@FunctionalInterface
interface Demography
{
    int population(int county1, int count2);
}
public class index {

    public static void main(String[] args) {
        Demography pDemography = (county1, county2) -> county1 + county2;
        int result = pDemography.population(1000, 7000);
        System.out.println(result);
    }
}