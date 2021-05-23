package org.jmc.models;

import org.jmc.threading.ChunkProcessor;
import org.jmc.threading.ThreadChunkDeligate;


/**
 * Generic model for cube blocks.
 */
public class CompactSlab extends BlockModel
{
	
	@Override
	public void addModel(ChunkProcessor obj, ThreadChunkDeligate chunks, int x, int y, int z, byte data, byte biome)
	{
		if (data == 1) // top slab
		{
		addBox(obj,
				x - 0.5f, y - 0.0f, z - 0.5f,
				x + 0.5f, y + 0.5f, z + 0.5f, 
				null, 
				getMtlSides(data,biome), 
				null, 
				drawSides(chunks, x, y, z));
		}
		else // bottom slab
		{
		addBox(obj,
				x - 0.5f, y - 0.5f, z - 0.5f,
				x + 0.5f, y + 0.0f, z + 0.5f, 
				null, 
				getMtlSides(data,biome), 
				null, 
				drawSides(chunks, x, y, z));
		}
	}

}
