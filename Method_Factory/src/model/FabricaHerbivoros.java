package model;

public class FabricaHerbivoros implements Fabrica{
	
	@Override
	public Animal Fabricacao(int id)
	{
		if(id==1)
		{
			return new Tartaruga();
		}
		else if(id==2)
		{
			return new Coala();
		}
		
		return null;
	}
}
