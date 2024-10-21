import java.util.Objects;

public class HumanWParent {

    protected Human human;
    protected Human father;

    HumanWParent(Human human, Human father){
        this.human = human;
        this.father = father;
    }
    HumanWParent(Human human){
        this(human, null);
    }
    HumanWParent(){
        this(null, null);
    }

    void setHuman(Human human) {
        this.human = human;
    }
    Human getHuman(){
        return this.human;
    }

    void setFather(Human father) {
        this.father = father;
    }
    Human getFather(){
        return this.father;
    }


    public String toString(){

        if (this.father != null) {
            if ((Objects.equals(this.human.getName().getLastName(), "")|| Objects.equals(this.human.getName().getLastName(), null)) && (!Objects.equals(this.father.getName().getLastName(), "") || !Objects.equals(this.father.getName().getLastName(), null))) {
                this.human.getName().setLastName(this.father.getName().getLastName());
            }
            if ((Objects.equals(this.human.getName().getPatronymic(), "") || Objects.equals(this.human.getName().getPatronymic(), null)) && (!Objects.equals(this.father.getName().getName(), "") || !Objects.equals(this.father.getName().getName(), null))) {
                this.human.getName().setPatronymic(this.father.getName().getName() + "ович");
            }
            return "Человек с именем \"" + this.human.getName() + "\", ростом " + this.human.getHeight() + " и отцом \"" + this.father.getName() + "\"";
        } else {
            return "Человек с именем \"" + this.human.getName() + "\" и ростом " + this.human.getHeight();
        }
    }
}
