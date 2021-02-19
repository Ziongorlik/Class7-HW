import jdk.jshell.spi.ExecutionControl;

import java.security.InvalidParameterException;

public class CarFactory {

    public static Drivable getCar(String carName) {
        if (carName == null)
            return null;
        switch (carName.toUpperCase()) {
            case "FIAT": {
                return new Fiat();
            }

            case "BMW": {
                return new BMW();
            }

            case "PORSCHE": {
                return new Porsche();
            }

            default: throw new InvalidParameterException(carName + " - No such car exist!");
        }
    }
}
