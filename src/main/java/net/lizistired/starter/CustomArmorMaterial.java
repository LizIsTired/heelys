package net.lizistired.starter;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CustomArmorMaterial implements ArmorMaterial {
    private static final int BASE_DURABILITY = 13;
    private static final int PROTECTION_VALUES = 1;

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY * 40;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegisterItems.CUSTOM_MATERIAL);
    }

    @Override
    public String getName() {
        // Must be all lowercase
        return "name";
    }

    @Override
    public float getToughness() {
        return 3.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.1F;
    }
}
