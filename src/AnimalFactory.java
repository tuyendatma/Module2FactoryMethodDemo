public class AnimalFactory {
    public Animals getAnimal(TypeAnimal type){
        if(type==TypeAnimal.DOG){
            return new Dog();
        }else return new Cat();

    }
}
