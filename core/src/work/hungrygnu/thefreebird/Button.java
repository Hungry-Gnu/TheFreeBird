package work.hungrygnu.thefreebird;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

import static work.hungrygnu.thefreebird.Constants.*;
/**
 * Created by hungry on 12.02.16.
 */
public class Button {

    private ShapeRenderer renderer;
    public final Vector2 position;

    public Button(ShapeRenderer renderer, Vector2 position){
        this.renderer = renderer;
        this.position = position;

    }

    public void render(){
        renderer.set(ShapeRenderer.ShapeType.Filled);
        renderer.setColor(BUTTON_COLOR);
        renderer.circle(position.x, position.y, BUTTON_RADIUS, BUTTON_SEGMENTS);
        flyWordRender();
    }

    private void flyWordRender(){
        renderer.setColor(BUTTON_TEXT_COLOR);
        float x = position.x;
        float y = position.y;
        float r = BUTTON_RADIUS;
        float c = r/3f; // cell size, for drawing on paper
        float w = c/4f; // width of letter stick
        //F
        renderer.rectLine(x-c*2.5f, y-c, x-c*2.5f, y+c, w);
        renderer.rectLine(x-c*2.5f, y, x-c*1.5f, y, w);
        renderer.rectLine(x-c*2.5f, y+c, x-c*1.5f, y+c, w );
        //L
        renderer.rectLine(x-c/2f, y-c, x-c/2f, y+c, w);
        renderer.rectLine(x-c/2f, y-c, x+c/2f, y-c, w);
        //Y
        renderer.rectLine(x+c*1.5f, y+c, x+c*2f, y, w);
        renderer.rectLine(x+c*2.5f, y+c, x+c*2f, y, w);
        renderer.rectLine(x+c*2f, y, x+c*2f, y-c, w);


    }
}
