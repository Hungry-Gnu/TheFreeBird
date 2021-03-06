package work.hungrygnu.thefreebird;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by hungry on 11.02.16.
 */
public class Constants {
    // TODO: Balance and set the constants, especially for the food-energy-poop transfer

    // World parameters
    public static final float WORLD_WIDTH = 1920f;
    public static final float WORLD_HEIGHT = 1080f;
    public static final Color BACKCOLOR = Color.BLACK;
    public static final float SCALE = WORLD_HEIGHT/48f;
    public static final float GRAVITY = -150f;

    // Underground parameters
    public static final float UNDERGROUND_HEIGHT = WORLD_HEIGHT/16f;
    public static final Color UNDERGROUND_FRONTCOLOR = Color.BLACK;
    public static final Color UNDERGROUND_BACKCOLOR = Color.DARK_GRAY;
    // Land parameters
    public static final float LAND_Y = UNDERGROUND_HEIGHT;
    public static final float LAND_HEIGHT = WORLD_HEIGHT/16f;
    public static final Color LAND_FRONTCOLOR = Color.OLIVE;
    public static final Color LAND_BACKCOLOR = Color.FOREST;

    // Sky parameters
    public static final Color SKY_COLOR = Color.SKY;
    public static final float SKY_Y = LAND_Y + LAND_HEIGHT;
    public static final float SKY_H = WORLD_HEIGHT *6f/8f;

    //Space parameters
    public static final float SPACE_Y= SKY_Y + SKY_H;
    public static final float SPACE_H = WORLD_HEIGHT / 8f;

    // Tree parameters
    public static final float TREE_X = WORLD_WIDTH/2f;
    public static final float TREE_Y = WORLD_HEIGHT/8f;
    public static final Vector2 TREE_POSITION = new Vector2(TREE_X, TREE_Y);
    public static final int TREE_SEGMENTS = 64;
    public static final Color TREE_COLOR_GREEN1 = Color.FOREST;
    public static final Color TREE_COLOR_GREEN2 = Color.FOREST;
    public static final Color TREE_COLOR_BROWN = Color.BROWN;

    // Nest parameters
    public static final float NEST_SCALE = 0.6f * SCALE;
    public static final Color NEST_COLOR_BOTTOM = Color.TAN;
    public static final Color NEST_COLOR_TOP = Color.FIREBRICK;
    public static final int NEST_SEGMENTS = TREE_SEGMENTS;

    // Bird parameters===========================================
    public static final float BIRD_SCALE = 0.15f * SCALE;
    public static final float BIRD_BODY_RADIUS = 5f * BIRD_SCALE;
    public static final Color BIRD_COLOR_BODY = Color.RED;
    public static final Color BIRD_COLOR_BEAK = Color.CORAL;
    public static final Color BIRD_COLOR_EYE = Color.BLACK;
    public static final Color BIRD_COLOR_WINGS = Color.SCARLET;
    public static final Color BIRD_COLOR_TAIL = Color.SCARLET;
    public static final int BIRD_SEGMENTS = TREE_SEGMENTS;


    public static final float BIRD_FLYUP_ACCELERATION = 300;
    public static final float BIRD_FLYUP_MAX_SPEED = 100f;
    public static final float BIRD_FLYDOWN_MAX_SPEED = 50f;
    public static final float BIRD_GLIDE_SPEED_X = 200f;
    public static final float BIRD_WALK_SPEED_X = 100f;



    public static final long BIRD_NANOTIME_FRAME = (long)(0.5*Math.pow(10, 9));

    public static final float BIRD_BORDER_RIGHT = WORLD_WIDTH - BIRD_BODY_RADIUS;
    public static final float BIRD_BORDER_LEFT = BIRD_BODY_RADIUS;
    public static final float BIRD_BORDER_TOP = WORLD_HEIGHT;
    public static final float BIRD_GLIDE_Y = SKY_Y;
    public static final float BIRD_Y_GLIDE_DELTA = 2f;
    public static final float BIRD_BORDER_BOTTOM = SKY_Y - BIRD_Y_GLIDE_DELTA;


    public static final int BIRD_FOOD_MAX = 10;
    public static final int BIRD_ENERGY_MAX = 500;
    public static final int BIRD_POOP_MAX = 5;
    public static final long BIRD_FOOD_DIGEST_TIME = 1500l;
    public static final long BIRD_ENERGY_LOSE_TIME = 3000l;
    public static final int BIRD_ENERGY_ADD = 50;

    public static final float BIRD_COLLIDER_OFFSET_Y = 2f*BIRD_SCALE;
    public static final float BIRD_NEST_POSITION_Y_OFFSET = BIRD_COLLIDER_OFFSET_Y + NEST_SCALE/3f;
    // =========================================================

    // Camera parameters
    public static final float CAM_CLOSEUP_COEFFICIENT = 0.4f;
    public static final float CAM_CLOSEUP_WIDTH = CAM_CLOSEUP_COEFFICIENT * WORLD_WIDTH;
    public static final float CAM_CLOSEUP_HALFWIDTH = CAM_CLOSEUP_COEFFICIENT * WORLD_WIDTH/2f;
    public static final float CAM_CLOSEUP_HEIGHT = CAM_CLOSEUP_COEFFICIENT * WORLD_HEIGHT;
    public static final float CAM_CLOSEUP_HALFHEIGHT = CAM_CLOSEUP_COEFFICIENT * WORLD_HEIGHT/2f;
    public static final float CAM_BORDER_RIGHT = WORLD_WIDTH - CAM_CLOSEUP_WIDTH /2f;
    public static final float CAM_BORDER_LEFT = CAM_CLOSEUP_WIDTH /2f;

    // Poop parameters
    public static final float POOP_RADIUS = 8f;
    public static final float POOP_HEIGHT = POOP_RADIUS * 2f;
    public static final int POOP_SEGMENTS = 16;
    public static final Color POOP_COLOR_CIRCLE = Color.GRAY;
    public static final Color POOP_COLOR_TOP = Color.LIGHT_GRAY;
    public static final float POOP_LOWEST_Y = SKY_Y - BIRD_BODY_RADIUS;


    // Button parameters
    public static final float BUTTON_RADIUS = 100f;
    public static final int BUTTON_SEGMENTS = 128;
    public static final Color BUTTON_COLOR = Color.CORAL;
    public static final Color BUTTON_TEXT_COLOR = Color.WHITE;

    // Menu parameters========================================================
    //public static final Color MENU_SIDE_COLOR = new Color(1f, 0f, 0f, 0.4f);
    public static final Color MENU_SIDE_COLOR = new Color(TREE_COLOR_GREEN1.r, TREE_COLOR_GREEN1.g, TREE_COLOR_GREEN1.b, 0.8f);
    public static final Color MENU_TOP_COLOR = new Color(0f, 0f, 1f, 0.5f);
    //public static final Color MENU_BOTTOM_COLOR = new Color(0f, 1f, 0f, 0.4f);
    public static final Color MENU_BOTTOM_COLOR = new Color(TREE_COLOR_BROWN.r, TREE_COLOR_BROWN.g, TREE_COLOR_BROWN.b, 0.9f);
    //public static final Color MENU_BOTTOM_COLOR = new Color(1f, 0.f, 0.f, 0.7f);
    public static final float MENU_BOX_WIDTH = CAM_CLOSEUP_WIDTH/3f;
    // ========================================================================

    // Arrow parameters
    public static final Color ARROW_COLOR = new Color(1f, 1f, 1f, 1f);
    public static final float ARROW_LENGTH = WORLD_HEIGHT/8f;
    public static final float ARROW_HALFLENGTH = ARROW_LENGTH/2f;
    public static final float ARROW_WIDTH = ARROW_LENGTH /5f;
    public static final float ARROW_HEAD_LENGTH = ARROW_LENGTH / 3f;
    public static final float ARROW_HEAD_HALFWIDTH = ARROW_WIDTH*0.5f;

    // Cat parameters
    public static final Color CAT_COLOR_BODY = new Color(0.23f, 0.23f,  0.23f, 1);
    public static final float CAT_HEAD_RADIUS = 30f;
    public static final float CAT_HEAD_RADIUS_ONE_THIRD = CAT_HEAD_RADIUS/3f;
    public static final float CAT_BODY_LENGTH = 3f * CAT_HEAD_RADIUS;
    public static final float CAT_BODY_WIDTH = CAT_HEAD_RADIUS;
    public static final int CAT_HEAD_SEGMENTS = 24;
    public static final float CAT_CHEEK_RADIUS =  1.3f*CAT_HEAD_RADIUS_ONE_THIRD/2f;
    public static final float CAT_MOUTH_WIDTH = CAT_HEAD_RADIUS_ONE_THIRD/2f;
    public static final float CAT_MOUTH_HEIGHT = CAT_MOUTH_WIDTH/5f;
    public static final float CAT_MOUTH_DELTA = CAT_MOUTH_HEIGHT/6f;
    public static final float CAT_EYE_RADIUS = CAT_MOUTH_HEIGHT;
    public static final float CAT_EAR_OFFSET = CAT_EYE_RADIUS*2f;
    public static final float CAT_EYE_DELTA = 0.2f * CAT_EYE_RADIUS;
    public static final float CAT_MUSTACHE_LENGTH = 1.2f *CAT_HEAD_RADIUS_ONE_THIRD;
    public static final float CAT_MUSTACHE_WIDTH = CAT_MUSTACHE_LENGTH/20f;
    public static final float CAT_MUSTACHE_DELTA = 3f*CAT_MUSTACHE_WIDTH;
    public static final float CAT_NOSE_SIDE = 0.7f*CAT_HEAD_RADIUS_ONE_THIRD;
    public static final float CAT_NOSE_HALFSIDE = CAT_NOSE_SIDE/2f;
    public static final float CAT_EAR_WIDTH= CAT_HEAD_RADIUS*2f - 2f*CAT_EAR_OFFSET;
    public static final float CAT_EAR_HEIGHT = CAT_HEAD_RADIUS - 2f*CAT_EAR_OFFSET;
    public static final float CAT_TAIL_WIDTH = CAT_HEAD_RADIUS_ONE_THIRD;
    public static final float CAT_TAIL_LENGTH = CAT_HEAD_RADIUS + CAT_TAIL_WIDTH/2f;
    public static final float CAT_LEG_LENGTH = 0.8f* CAT_TAIL_LENGTH;
    public static final float CAT_LEG_WIDTH = CAT_TAIL_WIDTH;

    public static final float CAT_SPEED_X = 90f;
    public static final float CAT_BODY_RADIUS = CAT_BODY_LENGTH + CAT_HEAD_RADIUS;
    public static final float CAT_START_X_LEFT = -CAT_BODY_RADIUS;
    public static final float CAT_START_X_RIGHT = WORLD_WIDTH;
    public static final int CAT_RESPAWN_COEFFICIENT = 150; // BIGGER NUMBER - LESS CATS
    public static final int CAT_MAX_NUMBER = 100;
    public static final float CAT_WALK_AMP = 0.02f;
    public static final long CAT_WALK_PERIOD = 340l;
    public static final float CAT_Y = SKY_Y + CAT_BODY_WIDTH/2f;

    // Caterpillar parameters
    public static final Color CATERPILLAR_COLOR_BODY = Color.GOLDENROD;
    public static final float CATERPILLAR_BODY_LENGTH = 40f;
    public static final int CATERPILLAR_CIRCLES_NUMBER = 5;
    public static final float CATERPILLAR_RADIUS = CATERPILLAR_BODY_LENGTH/CATERPILLAR_CIRCLES_NUMBER;
    public static final float CATERPILLAR_TIGHT_RADIUS = CATERPILLAR_RADIUS * 0.6f;
    public static final int CATERPILLAR_RESPAWN_COEFFICIENT = 100; // BIGGER NUMBER - LESS CATERPILLARS
    public static final float CATERPILLAR_SPEED_X = 10f;
    public static final float CATERPILLAR_Y = SKY_Y - (BIRD_BODY_RADIUS - CATERPILLAR_RADIUS);
    public static final float CATERPILLAR_Y_DELTA = CATERPILLAR_RADIUS/16f;
    public static final long CATERPILLAR_NANOTIME_FRAME = (long)(24000000000l*CATERPILLAR_Y_DELTA/CATERPILLAR_SPEED_X);
    public static final int CATERPILLAR_MAX_NUMBER = 150;
    public static final float CATERPILLAR_EYE_Y_OFFSET =  CATERPILLAR_RADIUS/3f;
    public static final float CATERPILLAR_EYE_RADIUS =  CATERPILLAR_RADIUS/8f;

    // Bar parameters
    public static final float BAR_WIDTH = CAM_CLOSEUP_WIDTH/5f;
    public static final float BAR_HEIGHT = BAR_WIDTH/12f;
    public static final float BAR_MARGIN = BAR_WIDTH/17f;
    public static final float BAR_PADDING = BAR_MARGIN/3f;
    public static final Color BAR_BOTOM_COLOR = Color.WHITE;

    //Scores parameters
    public static final float SCORES_SCALE = MENU_BOX_WIDTH/16f;
    public static final float SCORES_MARGIN = 0.8f*SCORES_SCALE;
    public static final float SCORES_PADDING = SCORES_SCALE/2;
    public static final float SCORES_RADIUS = SCORES_SCALE;

    //Direction parameters
    public static final boolean DIRECTION_LEFT = true;
    public static final boolean DIRECTION_RIGHT = false;

    //Input parameters
    public static final int MAX_NUMBER_OF_FINGERS_PLAYER_HAS_TO_PLAY = 10;

}
