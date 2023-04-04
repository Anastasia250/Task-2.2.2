package web.config;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> carsCount(List<Car> list, int number) {
        if (number == 0 || number > 5){
            throw new RuntimeException("Превышено число машин");
        }
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
