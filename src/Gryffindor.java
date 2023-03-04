public class Gryffindor extends Hogwarrts {
    int nobleness;
    int honor;
    int bravery;

    public Gryffindor(String name, int magic, int transgression, int nobleness, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobleness() {
        return nobleness;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return getName()+
                ", магия = " + getMagic() +
                ", трансгрессия = " + getTransgression() +
                ", благородство = " + nobleness +
                ", честь = " + honor +
                ", храбрость = " + bravery;
    }
}