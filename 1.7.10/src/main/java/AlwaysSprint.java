import cpw.mods.fml.common.Mod;
import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.EventHandler;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.settings.GameSettings;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;

@Mod(modid = "AlwaysSprint")
public class AlwaysSprint {
    static final GameSettings GAME_SETTINGS = Minecraft.getMinecraft().gameSettings;

    @SubscribeEvent
    public void onClientTick(ClientTickEvent event) {
        if (GAME_SETTINGS.keyBindForward.getIsKeyPressed())
            KeyBinding.setKeyBindState(GAME_SETTINGS.keyBindSprint.getKeyCode(), true);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        FMLCommonHandler.instance().bus().register(this);
    }
}
