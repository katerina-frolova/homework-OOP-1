public class Kogtevran extends Hogwarrts {
    int intellect;
    int wisdom;
    int wit;
    int creation;

    public Kogtevran(String name, int magic, int transgression, int intellect, int wisdom, int wit, int creation) {
        super(name, magic, transgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return getName()+
                ", магия = " + getMagic() +
                ", трансгрессия = " + getTransgression() +
                ", ум = " + intellect +
                ", мудрость = " + wisdom +
                ", остроумность = " + wit +
                ", творчество = " + creation;
    }
}