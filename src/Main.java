public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Dog.DogBuilder dogBuilder = new Dog.DogBuilder();

        Dog bunnoKutta = dogBuilder
                .setGender(Constant.MALE)
                .setName("Bunno")
                .setBreed(Constant.POMERIAN)
                .build();

        Dog aawaraKutta = new Dog.DogBuilder()
                .setGender(Constant.FEMALE)
                .setBreed(Constant.AAWARA)
                .build();

        System.out.println(bunnoKutta);
        System.out.println(aawaraKutta);
    }
}