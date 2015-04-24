package com.jimpai.schedule;

import android.view.MotionEvent;

import org.cocos2d.layers.CCLayer;

/**
 * Created by jimpai on 15/4/24.
 */
public class GameLayer extends CCLayer {
    public GameLayer() {
        this.setIsTouchEnabled(true);
        // 調用 schedule 方法，傳輸函數名，以及間隔時間
        this.schedule("fun", 1);

    }

    // delta 往往用來表示增量，在當前的例子當中，該變量的值為上次調用 fun 函數與這次調用 fun 函數之間的時間差
    public void fun(float delta) {
        System.out.println("調用的 fun 函數, delta 的值為 " + delta);
    }

    @Override
    public boolean ccTouchesBegan(MotionEvent event) {
        this.unschedule("fun");
        return super.ccTouchesBegan(event);
    }
}
