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
	private final RendererModel Head;
	private final RendererModel CybermanHat;
	private final RendererModel Body;
	private final RendererModel RightArm;
	private final RendererModel LeftArm;
	private final RendererModel RightLeg;
	private final RendererModel LeftLeg;

	public MondasianCybermanModel() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new RendererModel(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 25, 0, -3.0F, -9.0F, -3.0F, 6, 8, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 25, 25, -3.0F, -9.0F, -3.0F, 6, 8, 6, 0.5F, false));

		CybermanHat = new RendererModel(this);
		CybermanHat.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(CybermanHat);
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 25, 15, -4.0F, -7.0F, -2.0F, 1, 4, 4, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 34, 57, 3.0F, -7.0F, -2.0F, 1, 4, 4, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 44, 0, -4.0F, -13.0F, -1.0F, 3, 2, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 51, 45, 1.0F, -13.0F, -1.0F, 3, 2, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 36, 15, -5.0F, -12.0F, -1.0F, 1, 6, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 63, 11, 4.0F, -12.0F, -1.0F, 1, 6, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 50, 0, -2.0F, -14.0F, -3.0F, 4, 4, 6, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 62, 45, -5.0F, -6.0F, -1.0F, 2, 2, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 63, 20, 3.0F, -6.0F, -1.0F, 2, 2, 2, 0.0F, false));

		Body = new RendererModel(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 17, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F, false));

		RightArm = new RendererModel(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 17, 57, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 51, 28, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));

		LeftArm = new RendererModel(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 51, 51, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 51, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));

		RightLeg = new RendererModel(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 46, 11, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 34, 40, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));

		LeftLeg = new RendererModel(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 17, 40, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 34, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
	}

	public MondasianCybermanModel(RendererModel head, RendererModel cybermanHat, RendererModel body, RendererModel rightArm, RendererModel leftArm, RendererModel rightLeg, RendererModel leftLeg) {
		Head = head;
		CybermanHat = cybermanHat;
		Body = body;
		RightArm = rightArm;
		LeftArm = leftArm;
		RightLeg = rightLeg;
		LeftLeg = leftLeg;
	}

	@Override
	public void render(MondasianCyberman entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		Head.render(scale);
		Body.render(scale);
		RightArm.render(scale);
		LeftArm.render(scale);
		RightLeg.render(scale);
		LeftLeg.render(scale);
	}


	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}