import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.client.settings.GameSettings;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

@Mod(modid = "AlwaysSprint")
public class AlwaysSprint {
    static final GameSettings GAME_SETTINGS = Minecraft.getMinecraft().gameSettings;

    @SubscribeEvent
    public void onClientTick(ClientTickEvent event) {
        if (GAME_SETTINGS.keyBindForward.isKeyDown())
            KeyBinding.setKeyBindState(GAME_SETTINGS.keyBindSprint.getKeyCode(), true);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
