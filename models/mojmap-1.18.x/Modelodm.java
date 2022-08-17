// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelodm<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "odm"),
			"main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelodm(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.1F, 1.0F, -7.0F, 4.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(-2.1F, 1.0F, -3.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(10, 4)
						.addBox(-3.1F, 2.0F, -9.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-4.1F, 2.0F, -9.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 17)
						.addBox(-5.1F, 2.0F, -9.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 0)
						.addBox(-5.1F, 0.0F, -5.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(11, 20)
						.addBox(-3.2F, -1.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-7.2F, 0.0F, 4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.2F, -1.0F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 8)
						.addBox(-7.2F, 0.0F, -4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-7.2F, -1.0F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 22)
						.addBox(-3.2F, -1.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(2.1F, 1.0F, -7.0F, 4.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(8, 17)
						.addBox(5.1F, 2.0F, -9.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 19)
						.addBox(3.1F, 2.0F, -9.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(4.1F, 2.0F, -9.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 19)
						.addBox(3.1F, 0.0F, -5.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(3.2F, -1.0F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 0)
						.addBox(2.2F, -1.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 0)
						.addBox(6.2F, 0.0F, -4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(3.2F, -1.0F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(2.2F, -1.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 8)
						.addBox(6.2F, 0.0F, 4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}