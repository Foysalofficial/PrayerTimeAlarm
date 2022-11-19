package com.foysaltech.prayertimealarm.util;

import android.view.View;
import com.foysaltech.prayertimealarm.Alarm;

public interface OnToggleAlarmListener {
    void onToggle(Alarm alarm);
    void onDelete(Alarm alarm);
    void onItemClick(Alarm alarm,View view);
}
