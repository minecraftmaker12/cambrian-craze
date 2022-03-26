// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwiwaxia extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public Modelwiwaxia() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(16, 11).addBox(0.0F, -10.0F, -1.0F, 0.0F, 7.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -5.0F, 6.0F, 4.0F, 9.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.2618F);
		cube_r1.setTextureOffset(4, 11).addBox(0.0F, -9.0F, 0.0F, 0.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0873F, 0.0F, -0.2618F);
		cube_r2.setTextureOffset(4, 0).addBox(0.0F, -9.0F, 0.0F, 0.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0873F, 0.0F, 0.2618F);
		cube_r3.setTextureOffset(0, 11).addBox(0.0F, -9.0F, -2.0F, 0.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(8, 11).addBox(0.0F, -9.0F, 1.0F, 0.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(12, 11).addBox(0.0F, -9.0F, -4.0F, 0.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0873F, 0.0F, -0.2618F);
		cube_r6.setTextureOffset(0, 0).addBox(0.0F, -9.0F, -2.0F, 0.0F, 7.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}