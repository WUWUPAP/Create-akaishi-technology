package com.wuwu.cat.blocks;

import com.simibubi.create.content.kinetics.simpleRelays.CogWheelBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;


public class AkaishiCogWheelBlock extends CogWheelBlock {

    protected AkaishiCogWheelBlock(boolean large, BlockBehaviour.Properties properties) {
        super(large, properties);
    }

    public static AkaishiCogWheelBlock small(BlockBehaviour.Properties properties) {
        return new AkaishiCogWheelBlock(false, properties);
    }

    public static AkaishiCogWheelBlock large(BlockBehaviour.Properties properties) {
        return new AkaishiCogWheelBlock(true, properties);
    }
}
