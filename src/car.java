public class car {
    public int model;
    public String color;
    public String model2;

    public car(int model, String color,String model2){
        this.model=model;
        this.color=color;
        this.model2=model2;
    }

    public String getYaer(){
        return this.color;
    }
    public String getDescription(){
        return "the car built in: "+this.model+", the color is: "+this.color+", the model is: "+this.model2;
    }
}
