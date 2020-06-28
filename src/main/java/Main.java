import io.Data;
import io.impl.DataImpl;
import service.Service;
import service.impl.AddServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new DataImpl(scanner);
        Service addService = new AddServiceImpl();


        Controller controller = new Controller();
        controller.initialization(data);
        controller.calculate(addService);
        controller.done(data);
    }
}
