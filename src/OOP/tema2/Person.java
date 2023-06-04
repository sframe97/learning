package OOP.tema2;

//1.Am o clasa Person (nume, varsta, localitate) cu behaviors: doarme, mananca, canta.
//
//Am 2 clase: Copil si Adult care mostenesc Person. Adultul mai are o proprietate: tipul jobului si un behavior: munceste. Copilul are aditional behaviorul: seJoaca.
//
//Copilul poate canta un cantec sau poate sa cante o anumita perioada de timp. Adultul, spre deosebire de persoana,  doarme "7 ore in timpul saptamanii si 9 ore in weekend".
public class Person {
    String nume;

    public String getNume() {
        return nume;
    }

    public void setName(String nume){
        this.nume = nume;
    }

    int varsta;
    public int getVarsta(){
        return varsta;
    }

    String localitate;
    public String getLocalitate(){
        return localitate;
    }

    public void doarme() {
        System.out.println("dorm");
    }

    public void mananca() {
        System.out.println("mananc");
    }

    public void canta() {
        System.out.println("cant o serenada");
    }
}




