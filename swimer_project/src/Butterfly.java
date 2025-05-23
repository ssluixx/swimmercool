public class Butterfly extends Swimmer {
    @Override
    public void giveRecommendation() {
        System.out.println("Butterfly recommendations:");

        if (time > 55) {
            System.out.println("- Develop rhythm and improve body undulation.");
            System.out.println("- Build shoulder strength and endurance.");
            System.out.println("- Practice with fins to reinforce dolphin kick.");
        } else if (time > 45) {
            System.out.println("- Work on arm entry timing and reduce resistance.");
            System.out.println("- Use single-arm butterfly drill to improve technique.");
        } else {
            System.out.println("- Fine-tune breathing technique (every 2nd stroke).");
            System.out.println("- Focus on smooth, continuous wave motion.");
        }

        compareToTarget();
    }
}

