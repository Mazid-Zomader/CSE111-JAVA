public class UniversityTester {
    public static void main(String[] args) {
//        (a)
        University university1 = new University();
        University university2 = new University();
        System.out.println(university1);
        System.out.println(university2);
//        (b)
        university1.name = "Imperial College London" ;
        university1.country = "England" ;
        System.out.println(university1.name);
        System.out.println(university1.country);
        university2.name = "BRAC University" ;
        university2.country = "Bangladesh" ;
        System.out.println(university2.name);
        System.out.println(university2.country);
    }
}
