package OOP.curs;

public class Educatie {
	public static void main(String[] args) {
		Cursant cursant = new Cursant("stefan", "moldovan");
		Cursant cursanta = new Cursant("ana", "ionescu");
		
		Cursuri curs = new Cursuri("automation", 10, cursanta);
		System.out.println("Cursul:"+curs.getName()+" price:"+curs.getPrice()
				+" cursant:"+curs.getCursant().getName()+" "+
				curs.getCursant().getSurname());
	}
}
