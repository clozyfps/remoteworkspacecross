// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfireball2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fireball2"), "main");
	private final ModelPart bb_main;

	public Modelfireball2(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-10.0F, -2.0F, -12.0F, 21.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(52, 52)
						.addBox(10.0F, -24.0F, -12.0F, 2.0F, 22.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-12.0F, -24.0F, -12.0F, 2.0F, 22.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(64, 26)
						.addBox(-10.0F, -24.0F, -14.0F, 20.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 52)
						.addBox(-10.0F, -24.0F, 12.0F, 20.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-10.0F, -26.0F, -12.0F, 20.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}