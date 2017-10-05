import com.model.Plateau;
import com.model.Rover;

public class DriveRover {

    public static void main(String a[]){
        String plateauInput = "5 5";
        Plateau plateau = new Plateau(plateauInput);

        String roverLocation = "1 2 N";
        Rover rover1 = new Rover(roverLocation);

        String navigationInput = "LMLMLMLMM";
        rover1.navigate(navigationInput,plateau);

        System.out.println(rover1.getLocation());


        String roverLocation2 = "3 3 E";
        Rover rover2 = new Rover(roverLocation2);

        String navigationInput2 = "MMRMMRMRRM";
        rover2.navigate(navigationInput2,plateau);

        System.out.println(rover2.getLocation());
    }
}
