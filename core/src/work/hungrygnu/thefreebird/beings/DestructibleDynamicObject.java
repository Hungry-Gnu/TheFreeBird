package work.hungrygnu.thefreebird.beings;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by hungry on 18.02.16.
 */
public class DestructibleDynamicObject extends DynamicGameObject {

    public boolean active;

    public DestructibleDynamicObject(ShapeRenderer renderer, Vector2 position) {
        super(renderer, position);
        active = true;

    }


}
