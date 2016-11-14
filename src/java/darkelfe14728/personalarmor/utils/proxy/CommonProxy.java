package darkelfe14728.personalarmor.utils.proxy;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import darkelfe14728.personalarmor.building.BuildingModule;


/**
 * @author Julien Rosset
 * 
 *         Common part of proxies classes.
 */
public class CommonProxy
{
    private AbstractModule[] modules = {BuildingModule.instance};

    public void preInit(FMLPreInitializationEvent event)
    {
        for(AbstractModule module : modules)
        {
            module.preInit(event);
        }
    }
    public void init(FMLInitializationEvent event)
    {
        for(AbstractModule module : modules)
        {
            module.init(event);
        }
    }
    public void postInit(FMLPostInitializationEvent event)
    {
        for(AbstractModule module : modules)
        {
            module.postInit(event);
        }
    }

    public EntityPlayer getPlayer(MessageContext context)
    {
        return context.getServerHandler().playerEntity;
    }
}
