public class Human {

    private Name name;
    private int height;

    Name setName(Name name){
        this.name = name;
        return this.name;
    }
    Name getName(){
        return this.name;
    }
    int setHeight(int height){
        this.height = height;
        return this.height;
    }
    int getHeight(){
        return this.height;
    }

    Human(){
        this(null, 0);
    }
    Human(Name name, int height){
        this.name = name;
        this.height = height;

    }

    public String toString(){
        return "Человек с именем \"" + this.name + "\" и ростом " + this.height;
    }
}
