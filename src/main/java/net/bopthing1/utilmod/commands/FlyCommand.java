//package net.bopthing1.utilmod.commands;
//
//import com.mojang.brigadier.CommandDispatcher;
//import com.mojang.brigadier.arguments.ArgumentType;
//import net.minecraft.commands.CommandSource;
//import net.minecraft.commands.CommandSourceStack;
//import net.minecraft.commands.Commands;
//import net.minecraft.commands.arguments.MessageArgument;
//
//public class FlyCommand {
//    public FlyCommand(CommandDispatcher<CommandSource> dispatcher) {
//        dispatcher.register(
//                Commands.literal("fly")
//                        .requires((commandSource) -> commandSource.hasPermission(2))
//                        .then(Commands.argument("player", MessageArgument.message()))
//                        .executes((commandSource) -> {
//                            return new CommandSourceStack();
//                        })
//        );
//    }
//}
