package TheArkNoah05.DoctorWhoMobs.client.models;


import TheArkNoah05.DoctorWhoMobs.entities.MondasianCyberman;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

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
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 25, 16, -4.0F, -7.0F, -2.0F, 1, 4, 4, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 34, 58, 3.0F, -7.0F, -2.0F, 1, 4, 4, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 44, 0, -4.0F, -13.0F, -1.0F, 3, 2, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 51, 46, 1.0F, -13.0F, -1.0F, 3, 2, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 63, 11, -5.0F, -12.0F, -1.0F, 1, 6, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 64, 21, 4.0F, -12.0F, -1.0F, 1, 6, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 50, 0, -2.0F, -14.0F, -3.0F, 4, 4, 6, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 36, 16, -5.0F, -6.0F, -1.0F, 2, 2, 2, 0.0F, false));
		CybermanHat.cubeList.add(new ModelBox(CybermanHat, 62, 46, 3.0F, -6.0F, -1.0F, 2, 2, 2, 0.0F, false));

		Body = new RendererModel(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 17, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F, false));

		RightArm = new RendererModel(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 17, 58, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 51, 29, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));

		LeftArm = new RendererModel(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 51, 51, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 51, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));

		RightLeg = new RendererModel(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 46, 12, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 34, 41, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));

		LeftLeg = new RendererModel(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 17, 41, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 34, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
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