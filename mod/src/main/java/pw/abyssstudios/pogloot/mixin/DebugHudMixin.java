package pw.abyssstudios.pogloot.mixin;

import net.minecraft.client.gui.hud.DebugHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin({DebugHud.class})
public abstract class DebugHudMixin {
    @Inject(method = {"getRightText"}, at = {@At("RETURN")}, cancellable = true)
    private void extraRightTextMixin(CallbackInfoReturnable<List<String>> info) {
        List<String> returnValue = (List<String>) info.getReturnValue();
        returnValue.add("Using Official PogLoot Mod 1.2.0");
    }
}
