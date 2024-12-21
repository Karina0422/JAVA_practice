import java.util.ArrayList;
import java.util.List;

// Перечисление для типов питомцев
enum PetType {
    DOG, CAT
}

// Перечисление для состояний здоровья питомцев
enum HealthStatus {
    HEALTHY, SICK
}

// Класс для питомца
class Pet {
    protected String name;
    protected int age;
    protected PetType type;
    protected HealthStatus healthStatus;

    public Pet(String name, int age, PetType type, HealthStatus healthStatus) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.healthStatus = healthStatus;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Тип: " + type + ", Состояние: " + healthStatus);
    }

    public String getName() {
        return name;
    }
}

// Класс для собаки
class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String breed, HealthStatus healthStatus) {
        super(name, age, PetType.DOG, healthStatus);
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Порода: " + breed);
    }
}

// Класс для кошки
class Cat extends Pet {
    private String color;

    public Cat(String name, int age, String color, HealthStatus healthStatus) {
        super(name, age, PetType.CAT, healthStatus);
        this.color = color;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Цвет: " + color);
    }
}

// Исключение для случаев, когда питомец с таким именем уже существует
class PetAlreadyExistsException extends Exception {
    public PetAlreadyExistsException(String message) {
        super(message);
    }
}

// Класс для ветеринарной клиники
class PetClinic {
    private List<Pet> pets;

    public PetClinic() {
        pets = new ArrayList<>();
    }

    public void addPet(Pet pet) throws PetAlreadyExistsException {
        for (Pet p : pets) {
            if (p.getName().equalsIgnoreCase(pet.getName())) {
                throw new PetAlreadyExistsException("Питомец с таким именем уже есть в клинике!");
            }
        }
        pets.add(pet);
    }

    public void displayPets() {
        for (Pet pet : pets) {
            pet.displayInfo();
            System.out.println();
        }
    }
}

// Главный класс для тестирования
public class first {
    public static void main(String[] args) {
        PetClinic clinic = new PetClinic();
        try {
            Dog dog1 = new Dog("Бобик", 3, "Шершавая", HealthStatus.HEALTHY);
            Cat cat1 = new Cat("Мурка", 2, "Черный", HealthStatus.HEALTHY);
            clinic.addPet(dog1);
            clinic.addPet(cat1);

            // Попытка добавить питомца с уже существующим именем
            Dog dog2 = new Dog("Бобик", 5, "Лабрадор", HealthStatus.SICK);
            clinic.addPet(dog2); // вызовет исключение, что питомец с таким именем уже существует

            Cat cat2 = new Cat("Гарри", 2, "Рыжий", HealthStatus.HEALTHY);
            clinic.addPet(cat2);
            clinic.displayPets();
        } catch (PetAlreadyExistsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
