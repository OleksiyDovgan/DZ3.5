public class Participant {
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " біжить");
    }

    public void jump() {
        System.out.println(name + " стрибає");
    }

}

