public class ProjectTest {
    
    public static void main(String[] args) {
        Project project1 = new Project("Coding Dojo", "Bootcamp, cursos Online");
        project1.setCost(5800);

        Project project2 = new Project("Monkeytype","Monkeytype is a minimalistic and customizable typing test.", 1000);

        Project project3 = new Project();
        project3.setName("W3Schools");
        project3.setDescription("W3Schools is optimized for learning, testing, and training.");
        project3.setCost(2000);

        Portfolio portfolio = new Portfolio();
        portfolio.addProject(project1);
        portfolio.addProject(project3);
        portfolio.addProject(project2);
        portfolio.getProjects();
        portfolio.showPortfolio();
    }
}
