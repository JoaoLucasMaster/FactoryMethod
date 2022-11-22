package model;

public class FabricaCarnivoros implements Fabrica{

	@Override
	public Animal Fabricacao(int id)
	{
		if(id==1)
		{
			return new Tubarao();
		}
		else if(id==2)
		{
			return new Leao();
		}
		
		return null;
	}
}
