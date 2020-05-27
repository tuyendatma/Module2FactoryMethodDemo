public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory =new AnimalFactory();

        Animals dog1 = animalFactory.getAnimal(TypeAnimal.DOG);
        System.out.println("chó kêu: "+dog1.makeSound());

        Animals cat1 = animalFactory.getAnimal(TypeAnimal.CAT);
        System.out.println("mèo kêu: "+cat1.makeSound());
    }
}
