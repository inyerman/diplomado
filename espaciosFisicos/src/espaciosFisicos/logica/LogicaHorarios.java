package espaciosFisicos.logica;

public class LogicaHorarios {
	
	public LogicaHorarios()
	{
		
	}

private static LogicaHorarios instance;
	
	public static LogicaHorarios getInstance(){
		if(instance == null){
			instance = new LogicaHorarios();
		}
		 return instance;
	}
	
	public String prueba1()
	{
		return "hellow world";
	}
		
	
}