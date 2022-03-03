public class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[]{"C0318G","C0321H"};
    public static final String[] invalidClass = new String[]{"M0318G","P0323A"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String classEx : validClass) {
            boolean isvalid = classExample.validate(classEx);
            System.out.println("Class is" + classEx + "is" + isvalid);
        }

        for (String classEx : invalidClass) {
            boolean isvalid = classExample.validate(classEx);
            System.out.println("Class is" + classEx + "is" + isvalid);
        }
    }
}
