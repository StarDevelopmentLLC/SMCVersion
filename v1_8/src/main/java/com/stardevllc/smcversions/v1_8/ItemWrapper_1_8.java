package com.stardevllc.smcversions.v1_8;

import com.stardevllc.smcversion.wrappers.AttributeModifierWrapper;
import com.stardevllc.smcversion.wrappers.ItemWrapper;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class ItemWrapper_1_8 implements ItemWrapper {
    
    @Override
    public void addAttributeModifier(ItemStack itemStack, String attribute, AttributeModifierWrapper wrapper) {
        
    }
    
    @Override
    public Map<String, AttributeModifierWrapper> getAttributeModifiers(ItemStack itemStack) {
        return Map.of();
    }
}