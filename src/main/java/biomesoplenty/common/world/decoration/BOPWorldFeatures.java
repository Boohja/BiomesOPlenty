package biomesoplenty.common.world.decoration;

public class BOPWorldFeatures 
{
	public PerChunk perChunk = new PerChunk();
	public DoGeneration doGeneration = new DoGeneration();
	
	public class PerChunk
	{
		public int mudPerChunk = 0;
		public int riverCanePerChunk = 0;
		public int shrubsPerChunk = 0;
		public int bushesPerChunk = 0;
		public int cloverPatchesPerChunk = 0;
		public int lavenderPerChunk = 0;

		public int bopFlowersPerChunk = 0;
	}
	
	public class DoGeneration
	{
		public boolean generatePumpkins = true;
	}
}
