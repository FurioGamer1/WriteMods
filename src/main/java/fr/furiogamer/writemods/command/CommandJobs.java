package fr.furiogamer.writemods.command;

import fr.furiogamer.writemods.gui.atm.GuiMenuAtm;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class CommandJobs extends CommandBase {

    private final String COMMAND_NAME = "jobs";
    private final String COMMAND_HELP = "Help for WriteMods";

    @Override
    public String getName() {
        return COMMAND_NAME;
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return COMMAND_HELP;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] arguments) throws CommandException {

        Minecraft.getMinecraft().displayGuiScreen(new GuiMenuAtm(Minecraft.getMinecraft()));
    }
}
