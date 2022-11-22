package model;

public interface DecideFabrica {

	public static Fabrica FabricaDeFabricas(int id)
	{
		if(id==1)
		{
			return new FabricaHerbivoros();
		}
		else if(id==2)
		{
			return new FabricaCarnivoros();
		}
		return null;
	}
}
