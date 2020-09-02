package com.example.adam.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AuroraBlock extends Block {

    public AuroraBlock() {
        super(Block.Properties.create(Material.ICE)
                .hardnessAndResistance(5.0f, 6.0f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE));
    }
}
