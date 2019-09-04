package at.helpch.bukkitforcedhosts.commands;

import com.google.inject.Inject;
import me.piggypiglet.framework.commands.Command;
import me.piggypiglet.framework.file.FileManager;
import me.piggypiglet.framework.user.User;

// ------------------------------
// Copyright (c) PiggyPiglet 2019
// https://www.piggypiglet.me
// ------------------------------
public final class ReloadCommand extends Command {
    @Inject private FileManager fileManager;

    public ReloadCommand() {
        super("reload");
        options.description("Reload the hosts.yml file.").usage("").permissions("bukkitforcedhosts.reload");
    }

    @Override
    protected boolean execute(User user, String[] strings) {
        fileManager.update("hosts");
        user.sendMessage("Updated hosts.yml.");
        return true;
    }
}
