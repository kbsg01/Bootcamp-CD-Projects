import java.util.*;
public class Portfolio {
    ArrayList<Project> projects = new ArrayList<>();

    public Portfolio(){}

    public void addProject(Project project){
        this.projects.add(project);
    }

    public ArrayList<Project> getProjects() {
        return this.projects;
    }

    public float getPortfolioCost(){
        float total = 0.0f;
        for(int i = 0; i<this.projects.size(); i++){
            total += this.projects.get(i).getCost();
        }
        return total;
    }

    public void showPortfolio(){
        System.out.println("Contenido Portafolio");
        for(int i = 0; i < this.projects.size(); i++){
            System.out.println(this.projects.get(i).elevatorPitch());
        }
        System.out.println("Costo Total Portfolio: $" + this.getPortfolioCost());
    }
}
