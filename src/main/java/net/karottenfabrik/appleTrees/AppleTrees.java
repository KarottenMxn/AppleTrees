package net.karottenfabrik.appleTrees;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.karottenfabrik.appleTrees.blocks.AppleTreeLeaf;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class AppleTrees implements ModInitializer {

    public static final AppleTreeLeaf APPLE_TREE_LEAF = new AppleTreeLeaf(FabricBlockSettings.of(Material.LEAVES).sounds(BlockSoundGroup.GRASS).hardness(1f));

    public static final Item WILD_APPLE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(13f).build()));





    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("appletrees", "apple_tree_leaf"), APPLE_TREE_LEAF);
        Registry.register(Registry.ITEM, new Identifier("appletrees", "apple_tree_leaf"), new BlockItem(APPLE_TREE_LEAF, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("appletrees", "wild_apple"), WILD_APPLE);


    }
}
