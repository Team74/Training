class Motor {
    public double maxSpeed = 1.0;
    public double currentSpeed = 0.0;

    public Motor() {

    }

    public Motor(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setSpeed(double desiredSpeed) {
        if (desiredSpeed > maxSpeed) {
            currentSpeed = maxSpeed;
        } else {
            currentSpeed = desiredSpeed;
        }
    }
}