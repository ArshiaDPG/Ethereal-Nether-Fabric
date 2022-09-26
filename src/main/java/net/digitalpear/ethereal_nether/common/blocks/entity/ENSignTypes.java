package net.digitalpear.ethereal_nether.common.blocks.entity;

import net.digitalpear.ethereal_nether.mixin.SignTypeAccessor;
import net.minecraft.util.SignType;

public class ENSignTypes {
    public static final SignType TAINTED =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("tainted"));

    public static final SignType SANGUINATED =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("sanguinated"));
}
