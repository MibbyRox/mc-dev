package net.minecraft.server;

public class EntityCaveSpider extends EntitySpider {

    public EntityCaveSpider(World world) {
        super(world);
        this.texture = "/mob/cavespider.png";
        this.b(0.7F, 0.5F);
    }

    protected boolean c(Entity entity) {
        if (super.c(entity)) {
            if (entity instanceof EntityLiving) {
                byte b0 = 0;

                if (this.world.spawnMonsters > 1) {
                    if (this.world.spawnMonsters == 2) {
                        b0 = 7;
                    } else if (this.world.spawnMonsters == 3) {
                        b0 = 15;
                    }
                }

                if (b0 > 0) {
                    ((EntityLiving) entity).d(new MobEffect(MobEffectList.u.H, b0 * 20, 0));
                }
            }

            return true;
        } else {
            return false;
        }
    }
}