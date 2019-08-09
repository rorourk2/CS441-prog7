package com.example.fullfinalgame;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.TextView;

public class GameSurface extends SurfaceView implements SurfaceHolder.Callback {


    private GameThread gameThread;

    private PlayerCharacter player1;

    private FireBall fireball1;

    private FireBall fireball2;

    private FireBall fireball3;

    private FireBall fireball4;

    private int score=0;

    private boolean over=false;

    Context mycontext;

    //private TextView t1;

    public GameSurface(Context context)  {
        super(context);
        this.mycontext=context;
        //Intent intent = new Intent(mycontext, LearderBoard.class);
        //intent.putExtra("the",x);
       // mycontext.startActivity(intent);
        //this.t1= findViewById(R.id.textView);

        // Make Game Surface focusable so it can handle events. .
        this.setFocusable(true);

        // Sét callback.
        this.getHolder().addCallback(this);
    }

    public void update()  {
        this.player1.update();
        this.fireball1.update();
        this.fireball2.update();
        this.fireball3.update();
        this.fireball4.update();
        //t1.setVisibility(View.VISIBLE);
        if(over==false) {
            score += 1;
            if(fireball1.getX()<=player1.getX() && player1.getX()<=fireball1.getX()+fireball1.getWidth()/2){
                if(fireball1.getY()<=player1.getY() && player1.getY()<=fireball1.getY()+fireball1.getHeight()/2){
                    over=true;
                    Intent intent = new Intent(mycontext, LearderBoard.class);
                    intent.putExtra("the1",score);
                    mycontext.startActivity(intent);
                    //t1.setText("Score: "+score);
                    //t1.setVisibility(View.VISIBLE);
                }
            }

            if(fireball2.getX()<=player1.getX() && player1.getX()<=fireball2.getX()+fireball2.getWidth()/2){
                if(fireball2.getY()<=player1.getY() && player1.getY()<=fireball2.getY()+fireball2.getHeight()/2){
                    over=true;
                    Intent intent = new Intent(mycontext, LearderBoard.class);
                    intent.putExtra("the1",score);
                    mycontext.startActivity(intent);
                    //t1.setText("Score: "+score);
                    //t1.setVisibility(View.VISIBLE);
                }
            }

            if(fireball3.getX()<=player1.getX() && player1.getX()<=fireball3.getX()+fireball3.getWidth()/2){
                if(fireball3.getY()<=player1.getY() && player1.getY()<=fireball3.getY()+fireball3.getHeight()/2){
                    over=true;
                    Intent intent = new Intent(mycontext, LearderBoard.class);
                    intent.putExtra("the1",score);
                    mycontext.startActivity(intent);
                    //t1.setText("Score: "+score);
                    //t1.setVisibility(View.VISIBLE);
                }
            }

            if(fireball4.getX()<=player1.getX() && player1.getX()<=fireball4.getX()+fireball4.getWidth()/2){
                if(fireball4.getY()<=player1.getY() && player1.getY()<=fireball4.getY()+fireball4.getHeight()/2){
                    over=true;
                    Intent intent = new Intent(mycontext, LearderBoard.class);
                    intent.putExtra("the1",score);
                    mycontext.startActivity(intent);
                    //t1.setText("Score: "+score);
                    //t1.setVisibility(View.VISIBLE);
                }
            }
        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            int x=  (int)event.getX();
            int y = (int)event.getY();

            int movingVectorX =x-  this.player1.getX() ;
            int movingVectorY =y-  this.player1.getY() ;

            this.player1.setMovingVector(movingVectorX,movingVectorY);

            //Intent intent = new Intent(mycontext, LearderBoard.class);
            //intent.putExtra("the",x);
            //mycontext.startActivity(intent);

            return true;
        }
        return false;
    }

    @Override
    public void draw(Canvas canvas)  {
        super.draw(canvas);

        this.player1.draw(canvas);
        this.fireball1.draw(canvas);
        this.fireball2.draw(canvas);
        this.fireball3.draw(canvas);
        this.fireball4.draw(canvas);
    }

    // Implements method of SurfaceHolder.Callback
    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        Bitmap chibiBitmap1 = BitmapFactory.decodeResource(this.getResources(),R.drawable.player1);
        this.player1 = new PlayerCharacter(this,chibiBitmap1,100,50);

        Bitmap chibiBitmap2 = BitmapFactory.decodeResource(this.getResources(),R.drawable.fireball);
        this.fireball1 = new FireBall(this,chibiBitmap2,200,100);

        Bitmap chibiBitmap3 = BitmapFactory.decodeResource(this.getResources(),R.drawable.fireball);
        this.fireball2 = new FireBall(this,chibiBitmap3,1000,50);
        Bitmap chibiBitmap4 = BitmapFactory.decodeResource(this.getResources(),R.drawable.fireball);
        this.fireball3 = new FireBall(this,chibiBitmap4,50,500);
        Bitmap chibiBitmap5 = BitmapFactory.decodeResource(this.getResources(),R.drawable.fireball);
        this.fireball4 = new FireBall(this,chibiBitmap5,1500,500);

        this.gameThread = new GameThread(this,holder);
        this.gameThread.setRunning(true);
        this.gameThread.start();
    }

    // Implements method of SurfaceHolder.Callback
    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    // Implements method of SurfaceHolder.Callback
    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry= true;
        while(retry) {
            try {
                this.gameThread.setRunning(false);

                // Parent thread must wait until the end of GameThread.
                this.gameThread.join();
            }catch(InterruptedException e)  {
                e.printStackTrace();
            }
            retry= true;
        }
    }

    public int isOver(){
        if(over==true) {
            return score;
        }
        return -1;
    }
}
