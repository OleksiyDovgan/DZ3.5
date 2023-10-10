class Wall implements Obstacle {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant instanceof Human || participant instanceof Robot) {
            participant.jump();
            return true;
        } else {
            System.out.println(participant.getClass().getSimpleName() + " не може стрибати.");
            return false;
        }
    }
}
