package builder_pattern;

public class TestRun {
    public static void main(String[] args) {
        Computer.Builder builder = new Computer.Builder("Core_i7","COMPAQ Pressario");

        Computer computer = builder.performance("Intel Pentium Core i7 Processor")
                .levelOfMemory("16 GB").build();

        System.out.println(computer);
    }
}
