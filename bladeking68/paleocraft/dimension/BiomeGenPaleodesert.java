package bladeking68.paleocraft.dimension;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeGenPaleodesert extends BiomeGenBase
{
       private WorldGenMinable theWorldGenerator;

       public BiomeGenPaleodesert(int par1)
       {
             super(par1);
             this.topBlock = (byte)Block.sand.blockID;
             this.fillerBlock = (byte)Block.sand.blockID;
             
             
             this.theBiomeDecorator.treesPerChunk = -999;
             this.theBiomeDecorator.flowersPerChunk = -999;
             this.theBiomeDecorator.deadBushPerChunk = -999;
             this.theBiomeDecorator.grassPerChunk = -999;
             this.theWorldGenerator = new WorldGenMinable(Block.pumpkin.blockID, -999);
             this.spawnableMonsterList.clear();
             this.spawnableCreatureList.clear();
             this.spawnableWaterCreatureList.clear();
          //   this.spawnableMonsterList.add(new SpawnListEntry(fisherman77.paleocraft.common.mobs.EntityDromaeosaurus.class, 1, 4, 4)); //Fisherman just keep coping this for each dino and the numbers are the spawn rate i think so you can edit that if you want
             this.spawnableCreatureList.add(new SpawnListEntry(fisherman77.paleocraft.common.mobs.EntityDromaeosaurus.class, 3, 4, 4));
             this.spawnableCreatureList.add(new SpawnListEntry(fisherman77.paleocraft.common.mobs.EntityCitipati.class,  3, 1, 1));
             this.spawnableCreatureList.add(new SpawnListEntry(fisherman77.paleocraft.common.mobs.EntityDimorphodon.class,  4, 4, 4));
             this.spawnableCreatureList.add(new SpawnListEntry(fisherman77.paleocraft.common.mobs.EntityBaryonyx.class,  1, 1, 1));
             this.spawnableCreatureList.add(new SpawnListEntry(fisherman77.paleocraft.common.mobs.EntityTroodon.class,  2, 1, 1));
       }
}