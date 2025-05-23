public class Freestyle extends Swimmer {
    @Override
    public void giveRecommendation() {
        System.out.println("Freestyle recommendations:");

        if (time > 50) {
            System.out.println("- Work on basic endurance. Start with longer, steady swims.");
            System.out.println("- Focus on horizontal body position to reduce drag.");
            System.out.println("- Practice breathing on both sides to improve balance.");
        } else if (time > 40) {
            System.out.println("- Improve kick efficiency and maintain steady stroke rhythm.");
            System.out.println("- Work on catch phase to get more propulsion from each stroke.");
            System.out.println("- Try interval training to boost overall speed.");
        } else {
            System.out.println("- Optimize stroke rate and streamline turns.");
            System.out.println("- Use drills like fingertip drag and zipper switch to refine form.");
        }

        compareToTarget();
    }
}