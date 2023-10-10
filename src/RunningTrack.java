class RunningTrack implements Obstacle {
    private double length;

    public RunningTrack(double length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant instanceof Human || participant instanceof Cat) {
            participant.run();
            return true;
        } else {
            System.out.println(participant.getClass().getSimpleName() + " не може бігти.");
            return false;
        }
    }
}
