import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stable<Horse> stable = new Stable<>();
        Stable<Animal> animalStable = new Stable<>();
        moveHorses(stable, animalStable);
    }
    public static <T> void  moveHorses(Stable<? extends T> source, Stable<? super T> destination) {
        destination.addHorses(source.getHorses());
    }
}