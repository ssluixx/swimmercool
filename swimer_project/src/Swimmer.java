public abstract class Swimmer {
    protected double time;
    protected int age;
    protected String gender;
    protected String level;
    protected String goal;

    public void setData(int age, String gender, String level, String goal) {
        this.age = age;
        this.gender = gender;
        this.level = level;
        this.goal = goal;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public abstract void giveRecommendation();

    public void estimateTargetTime() {
        double targetTime;
        if (level.equalsIgnoreCase("beginner")) targetTime = 60;
        else if (level.equalsIgnoreCase("amateur")) targetTime = 45;
        else targetTime = 35;

        System.out.printf("Your estimated target time for your level is %.1f seconds.%n", targetTime);
    }

    public void compareToTarget() {
        System.out.printf("Your current time: %.1f sec. ", time);
        estimateTargetTime();
    }
} 