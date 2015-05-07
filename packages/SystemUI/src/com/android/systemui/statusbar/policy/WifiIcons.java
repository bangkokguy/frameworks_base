/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.statusbar.policy;

import com.android.systemui.R;

class WifiIcons {
    static final int[][] WIFI_SIGNAL_STRENGTH = {
//glg 20150123---begin
//commented out		
//            { R.drawable.stat_sys_wifi_signal_0,
//              R.drawable.stat_sys_wifi_signal_1_fully,
//              R.drawable.stat_sys_wifi_signal_2_fully,
//              R.drawable.stat_sys_wifi_signal_3_fully,
//              R.drawable.stat_sys_wifi_signal_4_fully },
//inserted
            { R.drawable.stat_sys_wifi_signal_00,
              R.drawable.stat_sys_wifi_signal_1,
              R.drawable.stat_sys_wifi_signal_2,
              R.drawable.stat_sys_wifi_signal_3,
              R.drawable.stat_sys_wifi_signal_4},
//glg---end
            { R.drawable.stat_sys_wifi_signal_0,
              R.drawable.stat_sys_wifi_signal_1_fully,
              R.drawable.stat_sys_wifi_signal_2_fully,
              R.drawable.stat_sys_wifi_signal_3_fully,
              R.drawable.stat_sys_wifi_signal_4_fully }
        };

    static final int[][] QS_WIFI_SIGNAL_STRENGTH = {
            { R.drawable.ic_qs_wifi_0,
              R.drawable.ic_qs_wifi_1,
              R.drawable.ic_qs_wifi_2,
              R.drawable.ic_qs_wifi_3,
              R.drawable.ic_qs_wifi_4 },
            { R.drawable.ic_qs_wifi_0,
              R.drawable.ic_qs_wifi_full_1,
              R.drawable.ic_qs_wifi_full_2,
              R.drawable.ic_qs_wifi_full_3,
              R.drawable.ic_qs_wifi_full_4 }
        };
//glg 20150305---begin
//insert/
	static final int[][] WIFI_DATA_IN = {
            { R.drawable.stat_sys_wifi_in_0,
              R.drawable.stat_sys_wifi_in_1,
              R.drawable.stat_sys_wifi_in_2,
              R.drawable.stat_sys_wifi_in_3,
              R.drawable.stat_sys_wifi_in_4 },
            { R.drawable.stat_sys_wifi_in_0,
              R.drawable.stat_sys_wifi_in_full_1,
              R.drawable.stat_sys_wifi_in_full_2,
              R.drawable.stat_sys_wifi_in_full_3,
              R.drawable.stat_sys_wifi_in_full_4 }
        };
	static final int[][] WIFI_DATA_OUT = {
            { R.drawable.stat_sys_wifi_out_0,
              R.drawable.stat_sys_wifi_out_1,
              R.drawable.stat_sys_wifi_out_2,
              R.drawable.stat_sys_wifi_out_3,
              R.drawable.stat_sys_wifi_out_4 },
            { R.drawable.stat_sys_wifi_out_0,
              R.drawable.stat_sys_wifi_out_full_1,
              R.drawable.stat_sys_wifi_out_full_2,
              R.drawable.stat_sys_wifi_out_full_3,
              R.drawable.stat_sys_wifi_out_full_4 }
        };
	static final int[][] WIFI_DATA_INOUT = {
            { R.drawable.stat_sys_wifi_inout_0,
              R.drawable.stat_sys_wifi_inout_1,
              R.drawable.stat_sys_wifi_inout_2,
              R.drawable.stat_sys_wifi_inout_3,
              R.drawable.stat_sys_wifi_inout_4 },
            { R.drawable.stat_sys_wifi_inout_0,
              R.drawable.stat_sys_wifi_inout_full_1,
              R.drawable.stat_sys_wifi_inout_full_2,
              R.drawable.stat_sys_wifi_inout_full_3,
              R.drawable.stat_sys_wifi_inout_full_4 }
        };
//glg---end
    static final int WIFI_LEVEL_COUNT = WIFI_SIGNAL_STRENGTH[0].length;
}
