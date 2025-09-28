public class Dog {

    private String name;
    private final String breed;
    private final String gender;

    public Dog(DogBuilder dogBuilder){
        this.name = dogBuilder.getName();
        this.breed = dogBuilder.getBreed();
        this.gender = dogBuilder.getGender();
    }

    // here we will not have any setters, if we want to create then we can have, but we need to make them private
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static class DogBuilder {
        private String name;
        private String breed;
        private String gender;

        public String getName() {
            return name;
        }

        public DogBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getBreed() {
            return breed;
        }

        public DogBuilder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public DogBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Dog build(){
            return new Dog(this);
        }
    }
}
