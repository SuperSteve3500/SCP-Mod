
package net.mcreator.morescp.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.morescp.item.SCPLogoItemDarkItem;
import net.mcreator.morescp.MorescpModElements;

@MorescpModElements.ModElement.Tag
public class SCPBlocksItemGroup extends MorescpModElements.ModElement {
	public SCPBlocksItemGroup(MorescpModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabscp_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SCPLogoItemDarkItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
