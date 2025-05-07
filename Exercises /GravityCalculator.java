 public class GravityCalculator {
    public static void main(String[] args) {
        double gravity = -9.81; // Acceleration due to gravity (m/s^2)
        double initialVelocity = 0.0; // Starting velocity (m/s)
        double fallingTime = 10.0; // Time the object falls (seconds)
        double initialPosition = 0.0; // Starting position (meters)

        // Calculate the final position using the physics formula:
        // position = 0.5 * gravity * time^2 + initialVelocity * time + initialPosition
        double finalPosition = 0.5 * gravity * fallingTime * fallingTime;
        finalPosition = finalPosition + initialVelocity * fallingTime;
        finalPosition = finalPosition + initialPosition;

        // Print the result
        System.out.println("An object's position after " + fallingTime +
                           " seconds is " + finalPosition + " m.");
    }
}
