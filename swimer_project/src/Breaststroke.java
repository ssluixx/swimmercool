public class Breaststroke extends Swimmer {
    @Override
    public void giveRecommendation() {
        System.out.println("Breaststroke recommendations:");

        if (time > 55) {
            System.out.println("- Focus on glide phase and avoid unnecessary resistance.");
            System.out.println("- Work on explosive push-offs and streamline.");
            System.out.println("- Practice drills for kick timing and propulsion.");
        } else if (time > 45) {
            System.out.println("- Improve timing between pull and kick.");
            System.out.println("- Strengthen your dolphin kick for underwater phase.");
        } else {
            System.out.println("- Work on optimizing stroke width and minimizing glide time.");
            System.out.println("- Focus on arm recovery speed and hip-driven kicks.");
        }

        compareToTarget();
    }
}