package com.jimpai.schedule;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.opengl.CCGLSurfaceView;


public class MainActivity extends Activity {

    CCGLSurfaceView view = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new CCGLSurfaceView(this);
        setContentView(view);

        CCDirector director = CCDirector.sharedDirector();
        director.attachInView(view);
        director.setDisplayFPS(true);
        director.setAnimationInterval(1/30);

        GameLayer gameLayer = new GameLayer();
        CCScene ccScene = CCScene.node();
        ccScene.addChild(gameLayer);

        director.runWithScene(ccScene);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
