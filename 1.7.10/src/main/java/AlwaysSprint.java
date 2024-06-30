import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

@Mod(modid = "AlwaysSprint")
public class AlwaysSprint {
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void $(KeyInputEvent $) {
        KeyBinding.setKeyBindState(Minecraft.getMinecraft().gameSettings.keyBindSprint.getKeyCode(), true);
    }

    @EventHandler
    public void init(FMLInitializationEvent $) {
        FMLCommonHandler.instance().bus().register(this);
    }
}
