package net.lizistired.starter;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.lizistired.starter.Heelys.namespace;

public class RegisterItems {
    public static final ArmorMaterial CUSTOM_ARMOR_MATERIAL = new CustomArmorMaterial();
    public static final Item CUSTOM_MATERIAL = new CustomMaterialItem(new Item.Settings().group(Heelys.EXAMPLE_MOD_GROUP));
    // If you made a new material, this is where you would note it.
    public static final Item CUSTOM_MATERIAL_BOOTS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Heelys.EXAMPLE_MOD_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(namespace, "custom_material"), CUSTOM_MATERIAL);
        Registry.register(Registry.ITEM, new Identifier(namespace, "custom_material_boots"), CUSTOM_MATERIAL_BOOTS);
    }
}
