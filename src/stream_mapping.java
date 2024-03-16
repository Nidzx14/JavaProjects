import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_mapping {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5); //creating a list
        Stream <Integer> stream= numbers.stream(); //converting list to stream
        List<Integer> cube = stream.map(x->x*x*x).toList(); //mapping
        System.out.println(numbers);
        System.out.println(cube);
    }
}
