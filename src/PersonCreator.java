public class PersonCreator { // no main method here,
    //declare all attributes to create person object
    // encapsulation = all private
    private String name;
    private int age;
    private int height;
    private double weight;


    // create method constructor
    public PersonCreator(String name, int age, int height, double weight){ // list all parameters
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    //setter: set the methods, no static, always void, pass on parameter
    public void setName(String name){ // passing parameter 'name'
        this.name = name;
    }
    //getter:as the attributes are private, we have to use separate method to get value
    public String getName(){ // use return keyword in the body, hence the header needs to have DT
        return name;
    }

    public void setAge(int age){
            this.age=age;
    }

    public int getAge(){
        return age;
    }
    public void setHeight(int height){
        this.height=height;
    }

    public int getHeight(){
        return height;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }

    public double getWeight(){
        return weight;
    }

    // create a new method growOlder(), set the age to increase by one, and to decrease the height by 1
    public void  growOlder() { // behavioural method
        setAge(getAge() + 1); // older by 1 year
        setHeight(getHeight() - 1); // height decrease by 1
    }

}
