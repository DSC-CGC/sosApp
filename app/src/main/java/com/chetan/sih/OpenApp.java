package com.chetan.sih;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class OpenApp extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String val = intent.getData().getHost();
        Intent i = new Intent(context, MainActivity.class);
        i.putExtra("data", val);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}