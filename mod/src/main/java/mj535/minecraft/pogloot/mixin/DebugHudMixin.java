package mj535.minecraft.pogloot.mixin;

import java.util.List;
import net.minecraft.client.gui.hud.DebugHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({DebugHud.class})
public abstract class DebugHudMixin {
    @Inject(method = {"getRightText"}, at = {@At("RETURN")}, cancellable = true)
    private void extraRightTextMixin(CallbackInfoReturnable<List<String>> info) {
        List<String> returnValue = (List<String>)info.getReturnValue();
        returnValue.add("Official PogLoot Mod 1.2.0-pre2");
    }
}
