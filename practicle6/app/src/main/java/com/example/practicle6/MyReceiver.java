package com.example.practicle6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "PhoneStateChangedReceiver triggered", Toast.LENGTH_LONG).show();

        Toast.makeText(context)
        String triggeredState = intent.getStringExtra(TelephonyManager.EXTRA_STATE);

        if (triggeredState != null) {
            if (triggeredState.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
                Toast.makeText(context, "Phone is Idle", Toast.LENGTH_LONG).show();
            } else if (triggeredState.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                Toast.makeText(context, "Phone is off the hook", Toast.LENGTH_LONG).show();
            } else if (triggeredState.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                Toast.makeText(context, "Phone is Ringing", Toast.LENGTH_LONG).show();
            }
        }
    }
}