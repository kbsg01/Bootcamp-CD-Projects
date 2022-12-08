public class Project {
    // Campos
    private String name;
    private String description;
    private double initialCost;
    private float cost;

    // Metodos
    public Project(){}

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Project(String name, String description, double initialCost){
        this.name= name;
        this.description = description;
        this.initialCost = initialCost;
        this.cost = (float)initialCost;
    }

    public String elevatorPitch(){
        return this.name+" ($"+this.cost+"): "+this.description;
    }


    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getInitialCost() {
        return initialCost;
    }

    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
}