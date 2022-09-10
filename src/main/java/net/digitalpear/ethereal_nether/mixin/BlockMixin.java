package net.digitalpear.ethereal_nether.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.sound.BlockSoundGroup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(Block.class)
public class BlockMixin{

    /*
        as taken from https://github.com/Sydokiddo/auditory
        By @Sydokiddo
     */

    @Inject(at = @At("HEAD"), method = "getSoundGroup", cancellable = true)
    public void getSoundType(BlockState state, CallbackInfoReturnable<BlockSoundGroup> info) {
        if (state.getBlock().getTranslationKey().contains("blackstone") && !state.getBlock().getTranslationKey().contains("gilded_blackstone")) {
            info.setReturnValue(BlockSoundGroup.DEEPSLATE);
        }
        if (state.getBlock().getTranslationKey().contains("polished_blackstone") && !state.getBlock().getTranslationKey().contains("gilded_blackstone")){
            info.setReturnValue(BlockSoundGroup.POLISHED_DEEPSLATE);
        }
        if (state.getBlock().getTranslationKey().contains("blackstone_brick") && !state.getBlock().getTranslationKey().contains("gilded_blackstone")){
            info.setReturnValue(BlockSoundGroup.DEEPSLATE_BRICKS);
        }
    }
}
