public class Backstroke extends Swimmer {
    @Override
    public void giveRecommendation() {
        System.out.println("Backstroke recommendations:");

        if (time > 50) {
            System.out.println("- Improve core stability to stay aligned.");
            System.out.println("- Practice kick sets to strengthen propulsion from legs.");
            System.out.println("- Focus on arm recovery and avoiding over-rotation.");
        } else if (time > 40) {
            System.out.println("- Maintain consistent tempo and work on underwater dolphin kicks.");
            System.out.println("- Improve breakout and streamline from the wall.");
        } else {
            System.out.println("- Fine-tune arm entry angles and minimize splash.");
            System.out.println("- Use tempo trainers to perfect pacing.");
        }

        compareToTarget();
    }
}
