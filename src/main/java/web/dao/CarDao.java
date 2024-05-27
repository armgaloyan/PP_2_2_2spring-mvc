package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "Black", 5));
        cars.add(new Car("Mercedes", "White", 6));
        cars.add(new Car("Audi", "Red", 7));
        cars.add(new Car("Volkswagen", "Blue", 8));
        cars.add(new Car("Haval", "White", 7));
    }

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }

}
