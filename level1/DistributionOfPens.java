public class DistributionOfPens {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        double pensforeach = (double) pens / students;
        int remaining = pens % students;
        System.out.println("The Pen Per Student is " + pensforeach + 
                           " and the remaining pen not distributed is " + remaining);
    }
}
