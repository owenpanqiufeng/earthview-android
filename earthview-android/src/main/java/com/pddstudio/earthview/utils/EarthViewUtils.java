/*
 * Copyright 2015 - Patrick J - earthview-android
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pddstudio.earthview.utils;

/**
 * This Class was created by Patrick J
 * on 13.12.15. For more Details and Licensing
 * have a look at the README.md
 */
public final class EarthViewUtils {

    private static String[] earthIds = IdUtils.getIdList();

    public static String[] getAllEarthViewIds() {
        return earthIds;
    }

    public static int[] getAllEarthViewIntIds() {
        int[] wallIds = new int[earthIds.length];
        for(int i = 0; i < earthIds.length; i++) {
            wallIds[i] = Integer.parseInt(earthIds[i]);
        }
        return wallIds;
    }

}
