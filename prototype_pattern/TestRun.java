package prototype_pattern;

public class TestRun {
    public static void main(String[] args) {
        Registry registry = new Registry();

        Computer pentium_1 = registry.getComputer(ComputerType.PENTIUM_1);
        System.out.println(pentium_1);

        pentium_1.setBrand("Intel");
        System.out.println(pentium_1);

        Computer pentium_11 = registry.getComputer(ComputerType.PENTIUM_1);
        System.out.println(pentium_11);
    }
}
