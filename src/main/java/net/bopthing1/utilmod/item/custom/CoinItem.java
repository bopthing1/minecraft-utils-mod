package net.bopthing1.utilmod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class CoinItem extends Item {
    public CoinItem(Properties properties) {
        super(properties);
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide()) {
            int randomNumber = generateRandomNumberFromRange(1, 2);

            if (randomNumber == 1) {
                sendChatMessage(player, "heads");
            } else {
                sendChatMessage(player, "tails");
            }

            player.getCooldowns().addCooldown(this, 20);
        }

        return super.use(level, player, hand);
    }

    private int generateRandomNumberFromRange(int min, int max) {
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }

    private void sendChatMessage(Player player, String coinflipResult) {
        player.sendSystemMessage(Component.literal("coinflip result: " + coinflipResult));
    }
}
