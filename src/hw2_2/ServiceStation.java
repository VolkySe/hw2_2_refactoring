package hw2_2;

public class ServiceStation {
    public void check(WheeledVehicle wheeledVehicle) {
        if (wheeledVehicle != null) {
            System.out.println("Обслуживаем " + wheeledVehicle.getModelName());
            for (int i = 0; i < wheeledVehicle.getWheelsCount(); i++) {
                wheeledVehicle.updateTyre();
            }
        }
        }
        // Вызываем метод check(), который реализован в каждом классе
        //wheeledVehicle.check();
}

