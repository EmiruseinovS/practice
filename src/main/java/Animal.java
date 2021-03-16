public class Animal {
    int NumOfLegs;
    String Name;
    boolean Vegetarians;
    double Weight;
    double Height;
    int Age;
    String result;

    public Animal() {

    }

    public Animal(int NumOfLegs, String Name, boolean Vegetarians, double Weight, double Height, int Age) {
        this.NumOfLegs = NumOfLegs;
        this.Name = Name;
        this.Vegetarians = Vegetarians;
        this.Weight = Weight;
        this.Height = Height;
        this.Age = Age;
    }

    public void setNumOfLegs(int NumOfLegs){
        this.NumOfLegs = NumOfLegs;
    }
    public int getNumOfLegs(){
        return NumOfLegs;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }

    public void setVegetarians(boolean Vegetarians){
        this.Vegetarians = Vegetarians;
    }
    public boolean getVegetarians(){
        return Vegetarians;
    }

    public void setWeight(double Weight){
        this.Weight = Weight;
    }
    public double getWeight(){
        return Weight;
    }

    public void setHeight(double Height){
        this.Height = Height;
    }
    public double getHeight(){
        return Height;
    }

    public void setAge(int Age){
        this.Age = Age;
    }
    public int getAge(){
        return Age;
    }
    public String toString(){
        this.result = "Animal{name=" + "'" + Name + "'" + ", weight=" + Weight + ", height=" + Height + ", age=" + Age + "}";
        return result;
    }

}
