package com.example.idea.androiddemopartone.utils;

import android.app.Activity;
import android.content.Intent;

import com.example.idea.androiddemopartone.act.CircleMenuActivity;
import com.example.idea.androiddemopartone.act.CycleScrollViewActivity;
import com.example.idea.androiddemopartone.act.HomeActivity;
import com.example.idea.androiddemopartone.act.InteractiveActivity;
import com.example.idea.androiddemopartone.act.JniTestTwoActivity;
import com.example.idea.androiddemopartone.act.LoopViewPagerActivity;
import com.example.idea.androiddemopartone.act.MyView01Act;
import com.example.idea.androiddemopartone.act.MyViewAct;
import com.example.idea.androiddemopartone.act.NonInteractiveActivity;
import com.example.idea.androiddemopartone.act.OpenGlES.OpenGlESSampleListActivity;
import com.example.idea.androiddemopartone.act.OpenGlES.Sample3_1Activity;
import com.example.idea.androiddemopartone.act.PictureAnalysisActivity;
import com.example.idea.androiddemopartone.act.ProgressBarActivity;
import com.example.idea.androiddemopartone.act.Socket_Android;
import com.example.idea.androiddemopartone.act.SurfaceTextureActivity;

/**
 * Created by idea on 16/3/25.
 */
public class ActUtils {
    public static void toJniTestAct(Activity act, boolean isFinish) {
        act.startActivity(new Intent(act, JniTestTwoActivity.class));
        if (isFinish) {
            act.finish();
        }
    }

    public static void toNoninteractiveAct(Activity act, boolean isFinish) {
        act.startActivity(new Intent(act, NonInteractiveActivity.class));
        if (isFinish) {
            act.finish();
        }
    }

    public static void toInteractiveAct(Activity act, boolean isFinish) {
        act.startActivity(new Intent(act, InteractiveActivity.class));
        if (isFinish) {
            act.finish();
        }
    }

    public static void toProgressBarAct(Activity act, boolean isFinish) {
        act.startActivity(new Intent(act, ProgressBarActivity.class));
        if (isFinish) {
            act.finish();
        }
    }

    public static void toSurfaceTextureAct(Activity act, boolean isFinish) {
        act.startActivity(new Intent(act, SurfaceTextureActivity.class));
        if (isFinish) {
            act.finish();
        }
    }

    public static void toLoopViewPagerAct(Activity act, boolean isFinish) {
        act.startActivity(new Intent(act, LoopViewPagerActivity.class));
        if (isFinish) {
            act.finish();
        }
    }

    public static void toCircleMenuAct(Activity act, boolean isFinish) {
        act.startActivity(new Intent(act, CircleMenuActivity.class));
        if (isFinish) {
            act.finish();
        }
    }

    public static void toCycleScrollViewAct(Activity act, boolean isFinish) {
        act.startActivity(new Intent(act, CycleScrollViewActivity.class));
        if (isFinish) {
            act.finish();
        }
    }

    public static void toPictureAnalysisAct(Activity act, boolean isFinish) {
        act.startActivity(new Intent(act, PictureAnalysisActivity.class));
        if (isFinish) {
            act.finish();
        }
    }

    public static void toOpenGlESSampleListAct(Activity act, boolean isFinish) {
        act.startActivity(new Intent(act, OpenGlESSampleListActivity.class));
        if (isFinish) {
            act.finish();
        }
    }


    public static void toSample3_1Act(Activity act, boolean isFinish) {
        act.startActivity(new Intent(act, Sample3_1Activity.class));
        if (isFinish) {
            act.finish();
        }
    }

    public static void toSocket_AndroidAct(Activity act, boolean isFinish) {
        act.startActivity(new Intent(act, Socket_Android.class));
        if (isFinish) {
            act.finish();
        }
    }

    public static void toMyViewAct(Activity act, boolean isFinish) {
        act.startActivity(new Intent(act,MyViewAct.class));
        if (isFinish) {
            act.finish();
        }
    }

    public static void toMyView01(Activity act, boolean isFinish) {
        act.startActivity(new Intent(act,MyView01Act.class));
        if (isFinish) {
            act.finish();
        }
    }
}
