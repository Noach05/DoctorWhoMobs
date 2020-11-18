package TheArkNoah05.DoctorWhoMobs.client.models;// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import TheArkNoah05.DoctorWhoMobs.entities.MondasianCyberman;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MondasianCybermanModel extends BipedModel<MondasianCyberman> {
	private final RendererModel CybermanHat;

	public MondasianCybermanModel() {
		bipedHeadwear.isHidden = true;

		textureWidth = 128;
		textureHeight = 128;

		bipedHead = new RendererModel(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 25, 0, -3.0F, -9.0F, -3.0F, 6, 8, 6, 0.0F, false));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 25, 25, -3.0F, -9.0F, -3.0F, 6, 8, 6, 0.5F, false));

		CybermanHat = new RendererModel(this);
		CybermanHat.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(CybermanHat);
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 25, 15, -4.0F, -7.0F, -2.0F, 1, 4, 4, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 34, 57, 3.0F, -7.0F, -2.0F, 1, 4, 4, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 44, 0, -4.0F, -13.0F, -1.0F, 3, 2, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 51, 45, 1.0F, -13.0F, -1.0F, 3, 2, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 36, 15, -5.0F, -12.0F, -1.0F, 1, 6, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 63, 11, 4.0F, -12.0F, -1.0F, 1, 6, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 50, 0, -2.0F, -14.0F, -3.0F, 4, 4, 6, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 62, 45, -5.0F, -6.0F, -1.0F, 2, 2, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 63, 20, 3.0F, -6.0F, -1.0F, 2, 2, 2, 0.0F, false));

		bipedBody = new RendererModel(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 17, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F, false));

		bipedRightArm = new RendererModel(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 17, 57, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 51, 28, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));

		bipedLeftArm = new RendererModel(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 51, 51, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 0, 51, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));

		bipedRightLeg = new RendererModel(this);
		bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 46, 11, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 34, 40, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));

		bipedLeftLeg = new RendererModel(this);
		bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 17, 40, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 34, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
	}


	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}